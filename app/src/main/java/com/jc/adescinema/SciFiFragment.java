package com.jc.adescinema;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SciFiFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView pizzaRecycler = (RecyclerView)inflater.inflate(
                R.layout.fragment_sci_fi, container, false);

        String[] Names = new String[Data.sci_fi.length];
        for (int i = 0; i < Names.length; i++) {
            Names[i] = Data.sci_fi[i].getName();
        }

        int[] Images = new int[Data.sci_fi.length];
        for (int i = 0; i < Images.length; i++) {
            Images[i] = Data.sci_fi[i].getImageResourceId();
        }

        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(Names, Images);
        pizzaRecycler.setAdapter(adapter);
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);
        pizzaRecycler.setLayoutManager(layoutManager);
        //nyambungin listener
        adapter.setListener(new CaptionedImagesAdapter.Listener() {
            @Override
            public void onClick(int position) {
                Intent intent = new Intent(getActivity(), SciFiDetailActivity.class);
                intent.putExtra(SciFiDetailActivity.EXTRA_CINEMA_ID, position);
                getActivity().startActivity(intent);
            }
        });
        return pizzaRecycler;
    }
}
