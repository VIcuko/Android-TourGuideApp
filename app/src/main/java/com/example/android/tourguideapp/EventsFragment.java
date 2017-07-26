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

        sites.add(new Site("Flamenco show", "Feel the heat of the traditional dance of Spain with a flamenco show " +
                "in one of the most prestigious \"tablaos\" (flamenco halls) in the country.",
                R.drawable.event_flamenco_show, R.string.event_flamenco_show,49));

        sites.add(new Site("Madrid walking tour", "Admire in centuries of Madrid's history during a guided tour on " +
                "foot through the Spanish capital.", R.drawable.event_madrid_walking_tour, R.string.event_madrid_walking_tour,90));

        sites.add(new Site("Real Madrid match", "Let yourself be carried away by football fever in a Real Madrid match " +
                "at the Santiago Bernabéu stadium.", R.drawable.event_real_madrid_match, R.string.event_real_madrid_match,800));

        sites.add(new Site("Full day excursion to Toledo ", "Travel from Madrid to Toledo, a national monument of Spain's " +
                "art and history, and discover the treasure of El Greco's works of art.", R.drawable.event_full_excursion_toledo,
                R.string.event_excursion_to_toledo,57));

        sites.add(new Site("One day tour at El Escorial", "Discover the magnificent monastery of El Escorial, the Valley of " +
                "the Fallen and visit the \"Imperial City\" of Toledo on this day trip.", R.drawable.event_el_escorial,
                R.string.event_tour_el_escorial,97));

        sites.add(new Site("Free stops bus", "Discover the highlights of Madrid aboard a double decker bus with free stops.",
                R.drawable.event_free_stop_bus, R.string.event_free_stops_bus,21));

        sites.add(new Site("Visit the Prado Museum", "Explore the Prado Museum in Madrid with an expert guide in art, avoiding " +
                "long entry lines with your priority access ticket.", R.drawable.event_visit_the_prado, R.string.event_visit_the_prado,40));

        sites.add(new Site("3-hour bicycle tour", "Enjoy this 3-hour bike tour that will give you the opportunity to see the best " +
                "places of interest in Madrid in a fun way.", R.drawable.event_bicycle_tour, R.string.event_bicycle_tour,22));

        sites.add(new Site("Arab baths experience", "Look for serenity in the Arab baths of Madrid, Hamman Al Ándalus, and spend " +
                "time relaxing your body, soul and mind.", R.drawable.event_arab_baths, R.string.event_arab_baths,63));

        sites.add(new Site("Guided wine tour", "Discover the prestigious wine region of the Ribera del Duero from Madrid.",
                R.drawable.event_wine_tour, R.string.event_guided_wine_tour,150));

        SiteAdapter adapter = new SiteAdapter(getActivity(), sites, R.color.category_events);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}