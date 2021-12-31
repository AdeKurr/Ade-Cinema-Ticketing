package com.jc.adescinema;

public class Data {
    private String name;
    private int imageResourceId;
    private String casts;
    private String synopsis;
    public static final Data[] allmovies = {
            new Data("Evil Dead",
                    R.drawable.evildead,
                    "Jane Levy\nShiloh Fernendez\nJessica Lucas",
                    "Five friends head to a remote cabin, where the discovery of a Book of the Dead leads them to unwittingly summon up demons living in the nearby woods."),
            new Data("Paranormal Activity",
                    R.drawable.paranormal,
                    "Katie Featherston\nMicah Sloat\nMark Fredrichs",
                    "After moving into a suburban home, a couple becomes increasingly disturbed by a nightly demonic presence."),
            new Data("A Quiet Place",
                    R.drawable.quiet,
                    "Emily Blunt\nJohn Krasinski\nMillicent Simmonds",
                    "In a post-apocalyptic world, a family is forced to live in silence while hiding from monsters with ultra-sensitive hearing."),
            new Data("The Lord of the Rings: The Fellowship of the Ring",
                    R.drawable.lotrfellowship,
                    "Elijah Wood\nIan McKellen\nOrlando Bloom",
                    "A meek Hobbit from the Shire and eight companions set out on a journey to destroy the powerful One Ring and save Middle-earth from the Dark Lord Sauron."),
            new Data("The Lord of the Rings: The Two Towers",
                    R.drawable.lotrtower,
                    "Elijah Wood\nIan McKellen\nOrlando Bloom",
                    "While Frodo and Sam edge closer to Mordor with the help of the shifty Gollum, the divided fellowship makes a stand against Sauron's new ally, Saruman, and his hordes of Isengard."),
            new Data("The Lord of the Rings: The Return of the King",
                    R.drawable.lotrking,
                    "Elijah Wood\nIan McKellen\nOrlando Bloom",
                    "Gandalf and Aragorn lead the World of Men against Sauron's army to draw his gaze from Frodo and Sam as they approach Mount Doom with the One Ring."),
            new Data("Interstellar",
                    R.drawable.interstellar,
                    "Matthew McCounaughey\nAnne Hathaway\nJessica Chastain",
                    "A team of explorers travel through a wormhole in space in an attempt to ensure humanity's survival."),
            new Data("Ready Player One",
                    R.drawable.ready,
                    "Tye Sheridan\nOlivia Cooke\nBen Mendelsohn",
                    "When the creator of a virtual reality called the OASIS dies, he makes a posthumous challenge to all OASIS users to find his Easter Egg, which will give the finder his fortune and control of his world."),
            new Data("The Martian",
                    R.drawable.martian,
                    "Matt Damon\nJessica Chastain\nKristen Wiig",
                    "An astronaut becomes stranded on Mars after his team assume him dead, and must rely on his ingenuity to find a way to signal to Earth that he is alive and can survive until a potential rescue.")
    };

    public static final Data[] horror = {
            new Data("Evil Dead",
                    R.drawable.evildead,
                    "Jane Levy\nShiloh Fernendez\nJessica Lucas",
                    "Five friends head to a remote cabin, where the discovery of a Book of the Dead leads them to unwittingly summon up demons living in the nearby woods."),
            new Data("Paranormal Activity",
                    R.drawable.paranormal,
                    "Katie Featherston\nMicah Sloat\nMark Fredrichs",
                    "After moving into a suburban home, a couple becomes increasingly disturbed by a nightly demonic presence."),
            new Data("A Quiet Place",
                    R.drawable.quiet,
                    "Emily Blunt\nJohnKrasinski\nMillicent Simmonds",
                    "In a post-apocalyptic world, a family is forced to live in silence while hiding from monsters with ultra-sensitive hearing."),
    };

    public static final Data[] adventure = {
            new Data("The Lord of the Rings: The Fellowship of the Ring",
                    R.drawable.lotrfellowship,
                    "Elijah Wood\nIan McKellen\nOrlando Bloom",
                    "A meek Hobbit from the Shire and eight companions set out on a journey to destroy the powerful One Ring and save Middle-earth from the Dark Lord Sauron."),
            new Data("The Lord of the Rings: The Two Towers",
                    R.drawable.lotrtower,
                    "Elijah Wood\nIan McKellen\nOrlando Bloom",
                    "While Frodo and Sam edge closer to Mordor with the help of the shifty Gollum, the divided fellowship makes a stand against Sauron's new ally, Saruman, and his hordes of Isengard."),
            new Data("The Lord of the Rings: The Return of the King",
                    R.drawable.lotrking,
                    "Elijah Wood\nIan McKellen\nOrlando Bloom",
                    "Gandalf and Aragorn lead the World of Men against Sauron's army to draw his gaze from Frodo and Sam as they approach Mount Doom with the One Ring."),
    };

    public static final Data[] sci_fi = {
            new Data("Interstellar",
                    R.drawable.interstellar,
                    "Matthew McCounaughey\nAnne Hathaway\nJessica Chastain",
                    "A team of explorers travel through a wormhole in space in an attempt to ensure humanity's survival."),
            new Data("Ready Player One",
                    R.drawable.ready,
                    "Tye Sheridan\nOlivia Cooke\nBen Mendelsohn",
                    "When the creator of a virtual reality called the OASIS dies, he makes a posthumous challenge to all OASIS users to find his Easter Egg, which will give the finder his fortune and control of his world."),
            new Data("The Martian",
                    R.drawable.martian,
                    "Matt Damon\nJessica Chastain\nKristen Wiig",
                    "An astronaut becomes stranded on Mars after his team assume him dead, and must rely on his ingenuity to find a way to signal to Earth that he is alive and can survive until a potential rescue.")
    };

    private Data(String name, int imageResourceId, String casts, String synopsis) {
        this.name = name;
        this.imageResourceId = imageResourceId;
        this.synopsis = synopsis;
        this.casts = casts;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getCasts() {
        return casts;
    }

    public String getSynopsis() {
        return synopsis;
    }
}
