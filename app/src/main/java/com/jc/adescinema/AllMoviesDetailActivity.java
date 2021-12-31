package com.jc.adescinema;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class AllMoviesDetailActivity extends AppCompatActivity {

    public static final String EXTRA_CINEMA_ID = "cinemaId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_movies_detail);

        //Ngatur toolbar sebagai app bar si activity
        Toolbar toolbar =(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        //Menampilkan detail filmnye
        //ngambil Intent
        int cinemaId = (Integer)getIntent().getExtras().get(EXTRA_CINEMA_ID);

        //Bikin sebuah cursor
        SQLiteOpenHelper cinemaDatabaseHelper = new CinemaDatabaseHelper(this);
        try{
            SQLiteDatabase db = cinemaDatabaseHelper.getReadableDatabase();
            Cursor cursor = db.query("ALLMOVIES",
                    new String[]{"TITLE", "RESOURCE_ID", "CASTS", "SYNOPSIS"},
                    "_id = ?",
                    new String[]{Integer.toString(cinemaId)},
                    null, null, null);

            //Pindahin cursor ke paling baris paling atas
            if (cursor.moveToFirst()){
                //Ambil detail dari cursor
                String title = cursor.getString(0);
                int posterId = cursor.getInt(1);
                String casts = cursor.getString(2);
                String synopsis = cursor.getString(3);
                //Ngisi judul
                TextView movieTitle = (TextView) findViewById(R.id.cinema_text);
                movieTitle.setText(title);
                //Ngisi id foto
                ImageView poster = (ImageView) findViewById(R.id.cinema_image);
                poster.setImageResource(posterId);
                poster.setContentDescription(title);
                //Ngisi pemain
                TextView pemain = (TextView) findViewById(R.id.casts);
                pemain.setText(casts);
                //Ngisi sinopsis
                TextView sinopis = (TextView) findViewById(R.id.synopsis);
                sinopis.setText(synopsis);
            }
            cursor.close();
            db.close();
        } catch(SQLiteException e) {
            Toast toast = Toast.makeText(this,
                    "Film tidak ditemukan",
                    Toast.LENGTH_LONG);
            toast.show();
        }

//        //nama pelm
//        String cinemaName = Data.allmovies[cinemaId].getName();
//        TextView cinemaName = (TextView) findViewById(R.id.cinema_text);
//        cinemaName.setText(cinemaName);
//        //poster pelm
//        int cinemaImage = Data.allmovies[cinemaId].getImageResourceId();
//        ImageView imageView = (ImageView) findViewById(R.id.cinema_image);
//        imageView.setImageDrawable(ContextCompat.getDrawable(this, cinemaImage));
//        imageView.setContentDescription(cinemaName);
//        //pemainnye
//        String cinemaCasts = Data.allmovies[cinemaId].getCasts();
//        TextView textView1 = (TextView) findViewById(R.id.casts);
//        textView1.setText(cinemaCasts);
//        //synopsis
//        String cinemaSynopsis = Data.allmovies[cinemaId].getSynopsis();
//        TextView textView2 = (TextView) findViewById(R.id.synopsis);
//        textView2.setText(cinemaSynopsis);
//

    }
}