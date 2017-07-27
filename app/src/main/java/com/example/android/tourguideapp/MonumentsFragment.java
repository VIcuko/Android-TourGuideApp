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
        sites.add(new Site(R.string.monument_bernabeu_name, R.string.monument_bernabeu_description,
                R.drawable.monument_bernabeu, R.string.monument_bernabeu_location, 18));

        sites.add(new Site(R.string.monument_el_capricho_name, R.string.monument_el_capricho_description,
                R.drawable.monument_capricho, R.string.monument_el_capricho_location, 0));

        sites.add(new Site(R.string.monument_madrid_rio_name, R.string.monument_madrid_rio_description,
                R.drawable.monument_madrid_rio, R.string.monument_madrid_rio_location, 0));

        sites.add(new Site(R.string.monument_royal_palace_name, R.string.monument_royal_palace_description,
                R.drawable.monument_palacio_real, R.string.monument_royal_palace_location, 11));

        sites.add(new Site(R.string.monument_cibeles_name, R.string.monument_cibeles_description,
                R.drawable.monument_plaza_cibeles, R.string.monument_cibeles_location, 0));

        sites.add(new Site(R.string.monument_puerta_alcala_name, R.string.monument_puerta_alcala_description,
                R.drawable.monument_puerta_alcala, R.string.monument_puerta_alcala_location, 0));

        sites.add(new Site(R.string.monument_retiro_name, R.string.monument_retiro_description,
                R.drawable.monument_retiro, R.string.monument_retiro_location, 0));

        sites.add(new Site(R.string.monument_debod_name, R.string.monument_debod_description,
                R.drawable.monument_templo_debod, R.string.monument_debod_location, 0));

        sites.add(new Site(R.string.monument_the_prado_name, R.string.monument_the_prado_description,
                R.drawable.monument_the_prado, R.string.monument_the_prado_location, 15));

        sites.add(new Site(R.string.monument_thyssen_name, R.string.monument_thyssen_description,
                R.drawable.monument_thyssen, R.string.monument_thyssen_location, 12));

        SiteAdapter adapter = new SiteAdapter(getActivity(), sites, R.color.category_monuments);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
