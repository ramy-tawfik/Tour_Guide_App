package com.example.tourapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class Shopping_Fragment extends Fragment {

    public Shopping_Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);
        // Create a list of Locations
        final ArrayList<Location> Locations = new ArrayList<Location>();
        Locations.add(new Location(R.string.ReadingTerminalMarket, R.string.ReadingTerminalMarketDes, R.drawable.reading_terminal_market));
        Locations.add(new Location(R.string.MacysPhiladelphia, R.string.MacysPhiladelphiaDes, R.drawable.macys));

        LocationAdapter adapter = new LocationAdapter(getActivity(), Locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}