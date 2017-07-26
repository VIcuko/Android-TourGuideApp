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
public class MonumentsFragment extends Fragment {

    public MonumentsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.site_list, container, false);

        //Create an ArrayList of sites
        final ArrayList<Site> sites = new ArrayList<Site>();
        sites.add(new Site("Santiago Bernabéu Stadium", "lutti", R.drawable.ic_place_white_24dp, R.string.monument_bernabeu,10));
        sites.add(new Site("El Capricho", "otiiko", R.drawable.ic_place_white_24dp, R.string.monument_el_capricho,0));
        sites.add(new Site("Madrid Río", "tolookosu", R.drawable.ic_place_white_24dp, R.string.monument_madrid_rio,45));
        sites.add(new Site("Royal Palace", "oyyisa", R.drawable.ic_place_white_24dp, R.string.monument_royal_palace,56));
        sites.add(new Site("Plaza de Cibeles", "temmokka", R.drawable.ic_place_white_24dp, R.string.monument_cibeles,0));
        sites.add(new Site("Puerta de Alcalá", "kenekaku", R.drawable.ic_place_white_24dp, R.string.monument_puerta_alcala,15));
        sites.add(new Site("El Retiro", "kawinta", R.drawable.ic_place_white_24dp, R.string.monument_retiro,12));
        sites.add(new Site("Debod Temple", "massokka", R.drawable.ic_place_white_24dp, R.string.monument_debod,89));
        sites.add(new Site("The Prado Museum", "wo’e", R.drawable.ic_place_white_24dp, R.string.monument_the_prado,45));
        sites.add(new Site("Thyssen Museum", "na’aacha", R.drawable.ic_place_white_24dp, R.string.monument_thyssen,32));

        SiteAdapter adapter = new SiteAdapter(getActivity(), sites, R.color.category_monuments);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
