package com.jc.adescinema;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

public class AdventureDetailActivity extends AppCompatActivity {

    public static final String EXTRA_CINEMA_ID = "cinemaId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adventure_detail);

        //Ngatur toolbar sebagai app bar si activity
        Toolbar toolbar =(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        //Menampilkan detail filmnye
        //nama pelm
        int cinemaId = (Integer)getIntent().getExtras().get(EXTRA_CINEMA_ID);
        String cinemaName = Data.adventure[cinemaId].getName();
        TextView textView = (TextView) findViewById(R.id.cinema_text);
        textView.setText(cinemaName);
        //poster pelm
        int cinemaImage = Data.adventure[cinemaId].getImageResourceId();
        ImageView imageView = (ImageView) findViewById(R.id.cinema_image);
        imageView.setImageDrawable(ContextCompat.getDrawable(this, cinemaImage));
        imageView.setContentDescription(cinemaName);
        //pemainnye
        String cinemaCasts = Data.adventure[cinemaId].getCasts();
        TextView textView1 = (TextView) findViewById(R.id.casts);
        textView1.setText(cinemaCasts);
        //synopsis
        String cinemaSynopsis = Data.adventure[cinemaId].getSynopsis();
        TextView textView2 = (TextView) findViewById(R.id.synopsis);
        textView2.setText(cinemaSynopsis);


    }
}