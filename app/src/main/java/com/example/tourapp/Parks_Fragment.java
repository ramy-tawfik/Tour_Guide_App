package com.example.tourapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class Parks_Fragment extends Fragment {
    public Parks_Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of Locations
        final ArrayList<Location> Locations = new ArrayList<Location>();
        Locations.add(new Location(R.string.PhiladelphiaZoo, R.string.PhiladelphiaZooDes, R.drawable.zoo));
        Locations.add(new Location(R.string.FairmountPark, R.string.FairmountParkDes, R.drawable.fairmount));
        Locations.add(new Location(R.string.WissahickonValleyPark, R.string.WissahickonValleyParkDes, R.drawable.wissahickon_valley_park));

        LocationAdapter adapter = new LocationAdapter(getActivity(), Locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}