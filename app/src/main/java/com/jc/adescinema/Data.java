package com.jc.adescinema;

public class Data {
    private String name;
    private int imageResourceId;
    public static final Data[] allmovies = {
            new Data("Evil Dead", R.drawable.evildead),
            new Data("Paranormal Activity", R.drawable.paranormal),
            new Data("A Quiet Place", R.drawable.quiet),
            new Data("The Lord of the Rings: The Fellowship of the Ring", R.drawable.lotrfellowship),
            new Data("The Lord of the Rings: The Two Towers", R.drawable.lotrtower),
            new Data("The Lord of the Rings: The Return of the King", R.drawable.lotrking),
            new Data("Interstellar", R.drawable.interstellar),
            new Data("Ready Player One", R.drawable.ready),
            new Data("The Martian", R.drawable.martian)
    };

    public static final Data[] horror = {
            new Data("Evil Dead", R.drawable.evildead),
            new Data("Paranormal Activity", R.drawable.paranormal),
            new Data("A Quiet Place", R.drawable.quiet)
    };

    public static final Data[] adventure = {
            new Data("The Lord of the Rings: The Fellowship of the Ring", R.drawable.lotrfellowship),
            new Data("The Lord of the Rings: The Two Towers", R.drawable.lotrtower),
            new Data("The Lord of the Rings: The Return of the King", R.drawable.lotrking)
    };

    public static final Data[] sci_fi = {
            new Data("Interstellar", R.drawable.interstellar),
            new Data("Ready Player One", R.drawable.ready),
            new Data("The Martian", R.drawable.martian)
    };
    private Data(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }
    public String getName() {
        return name;
    }
    public int getImageResourceId() {
        return imageResourceId;
    }
}
