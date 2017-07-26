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
        sites.add(new Site("Bar Cock", "Bar Cock is a renowned venue for cocktails, offering both old favourites " +
                "and the latest creations", R.drawable.nightlife_bar_cock, R.string.nightlife_bar_cock,10));

        sites.add(new Site("Coctelería Del Diego", "Del Diego offers a vast selection of beverages, in fact, they " +
                "have one of the longest cocktail menus in Madrid", R.drawable.nightlife_del_diego, R.string.nightlife_del_diego,8));

        sites.add(new Site("Soho", "Some say this place makes the best cocktails in Madrid, but we mustn’t overlook " +
                "the American and Tex-Mex food on offer here", R.drawable.nightlife_soho, R.string.nightlife_soho,15));

        sites.add(new Site("DRY Martini Bar", "From inside this classic Madrid hotel, the Melia Fénix, barman Javier de las " +
                "Muelas has his sights set on conquering the entire city", R.drawable.nightlife_dry_martini_bar, R.string.nightlife_dry_martini_bar,10));

        sites.add(new Site("Museo Chicote", "This legendary cocktail bar on the Gran Vía has been around for years and has managed " +
                "to preserve the best of its history.", R.drawable.nightlife_museo_chicote, R.string.nightlife_museo_chicote,5));

        sites.add(new Site("Josealfredo Bar", "This American style cocktail bar is one of the most popular in Madrid. It offers " +
                "leading brands of drinks, a wide range of cocktails and an extensive selection of  gin-tonics, the speciality of the house.",
                R.drawable.nightlife_josealfredo_bar, R.string.nightlife_josealfredo_bar,0));

        sites.add(new Site("Café Central", "Since it opened its doors in 1982, this venue has been committed to a love of good jazz, with more " +
                "than 8,000 live shows under its belt.", R.drawable.nightlife_cafe_central, R.string.nightlife_cafe_central,15));

        sites.add(new Site("El búho real", "This small club, located between Chueca and Alonso Martínez, promotes little known singer-songwriters and " +
                "is a favourite with residents of Madrid who want to discover new musical talent.",
                R.drawable.nightlife_buho_real, R.string.nightlife_buho_real,12));

        sites.add(new Site("Moby Dick", "Inspired by the sea, the venue is packed with seafaring references: sail boats, sails wound around masts, " +
                "gas lamps... and also electric guitars that hang on the ceiling and walls, because music is the star in this venue.",
                R.drawable.nightlife_moby_dick, R.string.nightlife_moby_dick,45));

        sites.add(new Site("El Juglar", "Equipped with an impressive stage and the latest technology in terms of sound, this venue offers the most " +
                "varied music, the most heterogeneous bands and the best atmosphere in Lavapiés. ",
                R.drawable.nightlife_juglar, R.string.nightlife_el_juglar,32));

        SiteAdapter adapter = new SiteAdapter(getActivity(), sites, R.color.category_nightlife);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
