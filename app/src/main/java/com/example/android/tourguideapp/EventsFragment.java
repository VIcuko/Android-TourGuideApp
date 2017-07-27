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
public class EventsFragment extends Fragment {

    public EventsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.site_list, container, false);

        //Create an ArrayList of sites
        final ArrayList<Site> sites = new ArrayList<Site>();

        sites.add(new Site(R.string.event_flamenco_show_name, R.string.event_flamenco_show_description,
                R.drawable.event_flamenco_show, R.string.event_flamenco_show_location, 49));

        sites.add(new Site(R.string.event_madrid_walking_tour_name, R.string.event_madrid_walking_tour_description,
                R.drawable.event_madrid_walking_tour, R.string.event_madrid_walking_tour_location, 90));

        sites.add(new Site(R.string.event_real_madrid_match_name, R.string.event_real_madrid_match_description,
                R.drawable.event_real_madrid_match, R.string.event_real_madrid_match_location, 800));

        sites.add(new Site(R.string.event_excursion_to_toledo_name, R.string.event_excursion_to_toledo_description,
                R.drawable.event_full_excursion_toledo, R.string.event_excursion_to_toledo_location, 57));

        sites.add(new Site(R.string.event_tour_el_escorial_name, R.string.event_tour_el_escorial_description,
                R.drawable.event_el_escorial, R.string.event_tour_el_escorial_location, 97));

        sites.add(new Site(R.string.event_free_stops_bus_name, R.string.event_free_stops_bus_description,
                R.drawable.event_free_stop_bus, R.string.event_free_stops_bus_location, 21));

        sites.add(new Site(R.string.event_visit_the_prado_name, R.string.event_visit_the_prado_description,
                R.drawable.event_visit_the_prado, R.string.event_visit_the_prado_location, 40));

        sites.add(new Site(R.string.event_bicycle_tour_name, R.string.event_bicycle_tour_description,
                R.drawable.event_bicycle_tour, R.string.event_bicycle_tour_location, 22));

        sites.add(new Site(R.string.event_arab_baths_name, R.string.event_arab_baths_description,
                R.drawable.event_arab_baths, R.string.event_arab_baths_location, 63));

        sites.add(new Site(R.string.event_guided_wine_tour_name, R.string.event_guided_wine_tour_description,
                R.drawable.event_wine_tour, R.string.event_guided_wine_tour_location, 150));

        SiteAdapter adapter = new SiteAdapter(getActivity(), sites, R.color.category_events);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}