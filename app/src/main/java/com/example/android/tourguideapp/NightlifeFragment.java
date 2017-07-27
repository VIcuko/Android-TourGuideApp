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
public class NightlifeFragment extends Fragment {

    public NightlifeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.site_list, container, false);

        //Create an ArrayList of sites
        final ArrayList<Site> sites = new ArrayList<Site>();
        sites.add(new Site(R.string.nightlife_bar_cock_name, R.string.nightlife_bar_cock_description,
                R.drawable.nightlife_bar_cock, R.string.nightlife_bar_cock_location, 10));

        sites.add(new Site(R.string.nightlife_del_diego_name, R.string.nightlife_del_diego_description,
                R.drawable.nightlife_del_diego, R.string.nightlife_del_diego_location, 8));

        sites.add(new Site(R.string.nightlife_soho_name, R.string.nightlife_soho_description,
                R.drawable.nightlife_soho, R.string.nightlife_soho_location, 15));

        sites.add(new Site(R.string.nightlife_dry_martini_bar_name, R.string.nightlife_dry_martini_bar_description,
                R.drawable.nightlife_dry_martini_bar, R.string.nightlife_dry_martini_bar_location, 10));

        sites.add(new Site(R.string.nightlife_museo_chicote_name, R.string.nightlife_museo_chicote_description,
                R.drawable.nightlife_museo_chicote, R.string.nightlife_museo_chicote_location, 5));

        sites.add(new Site(R.string.nightlife_josealfredo_bar_name, R.string.nightlife_josealfredo_bar_description,
                R.drawable.nightlife_josealfredo_bar, R.string.nightlife_josealfredo_bar_location, 0));

        sites.add(new Site(R.string.nightlife_cafe_central_name, R.string.nightlife_cafe_central_description,
                R.drawable.nightlife_cafe_central, R.string.nightlife_cafe_central_location, 15));

        sites.add(new Site(R.string.nightlife_buho_real_name, R.string.nightlife_buho_real_description,
                R.drawable.nightlife_buho_real, R.string.nightlife_buho_real_location, 12));

        sites.add(new Site(R.string.nightlife_moby_dick_name, R.string.nightlife_moby_dick_description,
                R.drawable.nightlife_moby_dick, R.string.nightlife_moby_dick_location, 45));

        sites.add(new Site(R.string.nightlife_el_juglar_name, R.string.nightlife_el_juglar_description,
                R.drawable.nightlife_juglar, R.string.nightlife_el_juglar_location, 32));

        SiteAdapter adapter = new SiteAdapter(getActivity(), sites, R.color.category_nightlife);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
