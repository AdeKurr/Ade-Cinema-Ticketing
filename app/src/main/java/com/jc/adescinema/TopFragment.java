package com.jc.adescinema;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

public class TopFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView movieAdapter = (RecyclerView) inflater.inflate(
                R.layout.fragment_top, container, false);

        String[] Names = new String[Data.allmovies.length];
        for (int i = 0; i < Names.length; i++) {
            Names[i] = Data.allmovies[i].getName();
        }

        int[] Images = new int[Data.allmovies.length];
        for (int i = 0; i < Images.length; i++) {
            Images[i] = Data.allmovies[i].getImageResourceId();
        }

        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(Names, Images);
        movieAdapter.setAdapter(adapter);
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 1);
        movieAdapter.setLayoutManager(layoutManager);
        //nyambungin listener
        adapter.setListener(new CaptionedImagesAdapter.Listener() {
            @Override
            public void onClick(int position) {
                Intent intent = new Intent(getActivity(), AllMoviesDetailActivity.class);
                intent.putExtra(AllMoviesDetailActivity.EXTRA_CINEMA_ID, position);
                getActivity().startActivity(intent);
            }
        });
        return movieAdapter;
    }
}
