package com.jc.adescinema;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class CinemaDatabaseHelper extends SQLiteOpenHelper {
    private static final String DB_NAME = "CINEMA";
    private static final int DB_VERSION = 2;

    CinemaDatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        updateMyDatabase(db, 0, DB_VERSION);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        updateMyDatabase(db, oldVersion, newVersion);
    }

    private static void insertMovie(SQLiteDatabase db, String title, int resourceId, String casts, String synopsis, String category) {
        ContentValues movieValues = new ContentValues();
        movieValues.put("TITLE", title);
        movieValues.put("RESOURCE_ID", resourceId);
        movieValues.put("CASTS", casts);
        movieValues.put("SYNOPSIS", synopsis);
        movieValues.put("CATEGORY", category);
        db.insert("ALLMOVIES", null, movieValues);
    }

    private void updateMyDatabase(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (oldVersion < 1) {
            //Bikin table kosongan
            db.execSQL("CREATE TABLE ALLMOVIES ("
                    + "_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + "TITLE TEXT, "
                    + "RESOURCE_ID INTEGER, "
                    + "CASTS TEXT, "
                    + "CATEGORY TEXT, "
                    + "SYNOPSIS TEXT);");

            //Masukin data
            insertMovie(db, "Evil Dead",
                    R.drawable.evildead,
                    "Jane Levy\nShiloh Fernendez\nJessica Lucas",
                    "Five friends head to a remote cabin, where the discovery of a Book of the Dead leads them to unwittingly summon up demons living in the nearby woods.", "Horror");
            insertMovie(db, "Paranormal Activity",
                    R.drawable.paranormal,
                    "Katie Featherston\nMicah Sloat\nMark Fredrichs",
                    "After moving into a suburban home, a couple becomes increasingly disturbed by a nightly demonic presence.", "Horror");
            insertMovie(db, "A Quiet Place",
                    R.drawable.quiet,
                    "Emily Blunt\nJohn Krasinski\nMillicent Simmonds",
                    "In a post-apocalyptic world, a family is forced to live in silence while hiding from monsters with ultra-sensitive hearing.", "Horror");
            insertMovie(db, "The Lord of the Rings: The Fellowship of the Ring",
                    R.drawable.lotrfellowship,
                    "Elijah Wood\nIan McKellen\nOrlando Bloom",
                    "A meek Hobbit from the Shire and eight companions set out on a journey to destroy the powerful One Ring and save Middle-earth from the Dark Lord Sauron.", "Adventure");
            insertMovie(db, "The Lord of the Rings: The Two Towers",
                    R.drawable.lotrtower,
                    "Elijah Wood\nIan McKellen\nOrlando Bloom",
                    "While Frodo and Sam edge closer to Mordor with the help of the shifty Gollum, the divided fellowship makes a stand against Sauron's new ally, Saruman, and his hordes of Isengard.", "Adventure");
            insertMovie(db, "The Lord of the Rings: The Return of the King",
                    R.drawable.lotrking,
                    "Elijah Wood\nIan McKellen\nOrlando Bloom",
                    "Gandalf and Aragorn lead the World of Men against Sauron's army to draw his gaze from Frodo and Sam as they approach Mount Doom with the One Ring.", "Adventure");
            insertMovie(db, "Interstellar",
                    R.drawable.interstellar,
                    "Matthew McCounaughey\nAnne Hathaway\nJessica Chastain",
                    "A team of explorers travel through a wormhole in space in an attempt to ensure humanity's survival.", "Sci_Fi");
            insertMovie(db, "Ready Player One",
                    R.drawable.ready,
                    "Tye Sheridan\nOlivia Cooke\nBen Mendelsohn",
                    "When the creator of a virtual reality called the OASIS dies, he makes a posthumous challenge to all OASIS users to find his Easter Egg, which will give the finder his fortune and control of his world.", "Sci_Fi");
            insertMovie(db, "The Martian",
                    R.drawable.martian,
                    "Matt Damon\nJessica Chastain\nKristen Wiig",
                    "An astronaut becomes stranded on Mars after his team assume him dead, and must rely on his ingenuity to find a way to signal to Earth that he is alive and can survive until a potential rescue.", "Sci_Fi");


        }
        if (oldVersion < 2) {
            db.execSQL("ALTER TABLE ALLMOVIES ADD COLUMN WISHLIST NUMERIC;");

        }
    }
}

