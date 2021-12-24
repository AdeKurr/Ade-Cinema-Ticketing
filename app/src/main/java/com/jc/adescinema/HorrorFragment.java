package com.jc.adescinema;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HorrorFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView pizzaRecycler = (RecyclerView)inflater.inflate(
                R.layout.fragment_horror, container, false);

        String[] Names = new String[Data.horror.length];
        for (int i = 0; i < Names.length; i++) {
            Names[i] = Data.horror[i].getName();
        }

        int[] Images = new int[Data.horror.length];
        for (int i = 0; i < Images.length; i++) {
            Images[i] = Data.horror[i].getImageResourceId();
        }

        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(Names, Images);
        pizzaRecycler.setAdapter(adapter);
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);
        pizzaRecycler.setLayoutManager(layoutManager);
        return pizzaRecycler;
    }
}
