package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.site_list, container, false);

        //Create an ArrayList of sites
        final ArrayList<Site> sites = new ArrayList<Site>();
        sites.add(new Site("Toga", "Mediterranean", R.drawable.ic_place_white_24dp, R.string.monument_1, 30));
        sites.add(new Site("Cacao Restobar", "Latin", R.drawable.ic_place_white_24dp, R.string.monument_2, 30));
        sites.add(new Site("Mu! El Placer De La Carne", "Grill, BBQ", R.drawable.ic_place_white_24dp, R.string.monument_3, 30));
        sites.add(new Site("Algarabía", "Mediterranean", R.drawable.ic_place_white_24dp, R.string.monument_4,25));
        sites.add(new Site("La Candela Restò", "Spanish", R.drawable.ic_place_white_24dp, R.string.monument_5,40));
        sites.add(new Site("Nuevo Horno de Santa Teresa", "Mediterranean", R.drawable.ic_place_white_24dp, R.string.monument_7,25));
        sites.add(new Site("Vinoteca Moratín", "Mediterranean", R.drawable.ic_place_white_24dp, R.string.monument_8,30));
        sites.add(new Site("Kabuki Wellington", "Japanese", R.drawable.ic_place_white_24dp, R.string.monument_9,45));
        sites.add(new Site("Cervecería La Mayor", "European", R.drawable.ic_place_white_24dp, R.string.monument_10,20));
        sites.add(new Site("La Mi Venta", "Mediterranean", R.drawable.ic_place_white_24dp, R.string.monument_6,20));

        SiteAdapter adapter = new SiteAdapter(getActivity(), sites, R.color.category_restaurants);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
