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
        sites.add(new Site(R.string.monument_bernabeu_name, R.string.monument_bernabeu_description, R.drawable.monument_bernabeu,
                R.string.monument_bernabeu_location, 18));

        sites.add(new Site("El Capricho", "The Parque de El Capricho is a park in Madrid. The name means \"the folly\" in Spanish. " +
                "It was created by María Josefa Pimentel, Duchess of Osuna on her estate at Alameda de Osuna",
                R.drawable.monument_capricho, R.string.monument_el_capricho, 0));

        sites.add(new Site("Madrid Río", "Madrid Río is a huge enclave ludic and cultural as much for the historical monuments " +
                "and facilities of leisure and culture that it houses, as for being a point of reference from which to be able to " +
                "contemplate and to contact with the monumental Madrid.", R.drawable.monument_madrid_rio, R.string.monument_madrid_rio, 0));

        sites.add(new Site("Royal Palace", "The Royal Palace of Madrid is the official residence of the Spanish Royal Family at " +
                "the city of Madrid, but it is only used for state ceremonies.", R.drawable.monument_palacio_real,
                R.string.monument_royal_palace, 11));

        sites.add(new Site("Plaza de Cibeles", "The Plaza de Cibeles is a square with a neo-classical complex of marble sculptures " +
                "with fountains that has become an iconic symbol for the city of Madrid.", R.drawable.monument_plaza_cibeles,
                R.string.monument_cibeles, 0));

        sites.add(new Site("Puerta de Alcalá", "The Puerta de Alcalá (\"Alcalá Gate\" or \"Citadel Gate\" is a Neo-classical monument " +
                "in the Plaza de la Independencia in Madrid, Spain.", R.drawable.monument_puerta_alcala, R.string.monument_puerta_alcala, 0));

        sites.add(new Site("El Retiro", "El Retiro is one of the largest parks of the city of Madrid, Spain. " +
                "The park belonged to the Spanish Monarchy until the late 19th century, when it became a public park.",
                R.drawable.monument_retiro, R.string.monument_retiro, 0));

        sites.add(new Site("Debod Temple", "The Debod Temple is an ancient Egyptian temple that was dismantled and rebuilt in Madrid, Spain.",
                R.drawable.monument_templo_debod, R.string.monument_debod, 0));

        sites.add(new Site("The Prado Museum", "The Prado Museum is the main Spanish national art museum, located in central Madrid.",
                R.drawable.monument_the_prado, R.string.monument_the_prado, 15));

        sites.add(new Site("Thyssen Museum", "The Thyssen-Bornemisza Museum, or simply the Thyssen, is an art museum in Madrid, Spain, located " +
                "near the Prado Museum at one of city's main boulevards.", R.drawable.monument_thyssen, R.string.monument_thyssen, 12));

        SiteAdapter adapter = new SiteAdapter(getActivity(), sites, R.color.category_monuments);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
