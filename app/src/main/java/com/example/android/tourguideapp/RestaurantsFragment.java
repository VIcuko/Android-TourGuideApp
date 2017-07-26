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
        sites.add(new Site("Toga", "Mediterranean", R.drawable.ic_place_white_24dp, R.string.restaurant_toga, 30));
        sites.add(new Site("Cacao Restobar", "Latin", R.drawable.ic_place_white_24dp, R.string.restaurant_cacao_restobar, 30));
        sites.add(new Site("Mu! El Placer De La Carne", "Grill, BBQ", R.drawable.ic_place_white_24dp, R.string.restaurant_mu, 30));
        sites.add(new Site("Algarabía", "Mediterranean", R.drawable.ic_place_white_24dp, R.string.restaurant_algarabia,25));
        sites.add(new Site("La Candela Restò", "Spanish", R.drawable.ic_place_white_24dp, R.string.restaurant_candela_resto,40));
        sites.add(new Site("Nuevo Horno de Santa Teresa", "Mediterranean", R.drawable.ic_place_white_24dp, R.string.restaurant_nuevo_horno,25));
        sites.add(new Site("Vinoteca Moratín", "Mediterranean", R.drawable.ic_place_white_24dp, R.string.restaurant_vinoteca_moratin,30));
        sites.add(new Site("Kabuki Wellington", "Japanese", R.drawable.ic_place_white_24dp, R.string.restaurant_kabuki_wellington,45));
        sites.add(new Site("Cervecería La Mayor", "European", R.drawable.ic_place_white_24dp, R.string.restaurant_cerveceria_la_mayor,20));
        sites.add(new Site("La Mi Venta", "Mediterranean", R.drawable.ic_place_white_24dp, R.string.restaurant_la_mi_venta,20));

        SiteAdapter adapter = new SiteAdapter(getActivity(), sites, R.color.category_restaurants);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
