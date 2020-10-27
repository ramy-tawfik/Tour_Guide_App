package com.example.tourapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class Museums_Fragment extends Fragment {

    public Museums_Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);


        // Create a list of Locations
        final ArrayList<Location> Locations = new ArrayList<Location>();
        Locations.add(new Location(R.string.PhiladelphiaMuseumofArt, R.string.PhiladelphiaMuseumofArtDes, R.drawable.philadelphia_museum_of_art));
        Locations.add(new Location(R.string.MuseumoftheAmericanRevolution, R.string.MuseumoftheAmericanRevolutionDes, R.drawable.museum_of_the_american_revolution));
        Locations.add(new Location(R.string.TheFranklinInstitute, R.string.TheFranklinInstituteDes, R.drawable.the_franklin_institute_hear_philly));
        Locations.add(new Location(R.string.NationalMuseumofAmericanJewishHistory, R.string.NationalMuseumofAmericanJewishHistoryDes, R.drawable.national_museum_of_american_jewish_history));

        // repeated for testing
        Locations.add(new Location(R.string.PhiladelphiaMuseumofArt, R.string.PhiladelphiaMuseumofArtDes, R.drawable.philadelphia_museum_of_art));
        Locations.add(new Location(R.string.MuseumoftheAmericanRevolution, R.string.MuseumoftheAmericanRevolutionDes, R.drawable.museum_of_the_american_revolution));
        Locations.add(new Location(R.string.TheFranklinInstitute, R.string.TheFranklinInstituteDes, R.drawable.the_franklin_institute_hear_philly));
        Locations.add(new Location(R.string.NationalMuseumofAmericanJewishHistory, R.string.NationalMuseumofAmericanJewishHistoryDes, R.drawable.national_museum_of_american_jewish_history));

        LocationAdapter adapter = new LocationAdapter(getActivity(), Locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}