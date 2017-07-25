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
        sites.add(new Site("Puerta de Alcalá", "lutti", R.drawable.ic_place_white_24dp, R.raw.number_one));
        sites.add(new Site("Cibele", "otiiko", R.drawable.ic_place_white_24dp, R.raw.number_two));
        sites.add(new Site("Bernabéu", "tolookosu", R.drawable.ic_place_white_24dp, R.raw.number_three));
        sites.add(new Site("Puerta de Sol", "oyyisa", R.drawable.ic_place_white_24dp, R.raw.number_four));
        sites.add(new Site("Plaza Mayor", "massokka", R.drawable.ic_place_white_24dp, R.raw.number_five));
        sites.add(new Site("Palacio Real", "temmokka", R.drawable.ic_place_white_24dp, R.raw.number_six));
        sites.add(new Site("Parque el retiro", "kenekaku", R.drawable.ic_place_white_24dp, R.raw.number_seven));
        sites.add(new Site("Museo del Prado", "kawinta", R.drawable.ic_place_white_24dp, R.raw.number_eight));
        sites.add(new Site("Gran Vía", "wo’e", R.drawable.ic_place_white_24dp, R.raw.number_nine));
        sites.add(new Site("Basílica de la Almudena", "na’aacha", R.drawable.ic_place_white_24dp, R.raw.number_ten));

        WordAdapter adapter = new WordAdapter(getActivity(), sites, R.color.category_numbers);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
