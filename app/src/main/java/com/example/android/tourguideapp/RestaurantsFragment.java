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
        sites.add(new Site(R.string.restaurant_toga_name, R.string.restaurant_toga_description,
                R.drawable.restaurant_toga, R.string.restaurant_toga_location, 30));

        sites.add(new Site(R.string.restaurant_cacao_restobar_name, R.string.restaurant_cacao_restobar_description,
                R.drawable.restaurant_cacao_restobar, R.string.restaurant_cacao_restobar_location, 30));

        sites.add(new Site(R.string.restaurant_mu_name, R.string.restaurant_mu_description,
                R.drawable.restaurant_mu, R.string.restaurant_mu_location, 30));

        sites.add(new Site(R.string.restaurant_algarabia_name, R.string.restaurant_algarabia_description,
                R.drawable.restaurant_algarabia, R.string.restaurant_algarabia_location, 25));

        sites.add(new Site(R.string.restaurant_candela_resto_name, R.string.restaurant_candela_resto_description,
                R.drawable.restaurant_candela, R.string.restaurant_candela_resto_location, 40));

        sites.add(new Site(R.string.restaurant_nuevo_horno_name, R.string.restaurant_nuevo_horno_location,
                R.drawable.restaurant_nuevo_horno, R.string.restaurant_nuevo_horno_location, 25));

        sites.add(new Site(R.string.restaurant_vinoteca_moratin_name, R.string.restaurant_vinoteca_moratin_description,
                R.drawable.restaurant_vinoteca_moratin, R.string.restaurant_vinoteca_moratin_location, 30));

        sites.add(new Site(R.string.restaurant_kabuki_wellington_name, R.string.restaurant_kabuki_wellington_description,
                R.drawable.restaurant_kabuki, R.string.restaurant_kabuki_wellington_location, 45));

        sites.add(new Site(R.string.restaurant_cerveceria_la_mayor_name, R.string.restaurant_cerveceria_la_mayor_description,
                R.drawable.restaurant_cerveceria_lamayor, R.string.restaurant_cerveceria_la_mayor_location, 20));

        sites.add(new Site(R.string.restaurant_la_mi_venta_name, R.string.restaurant_la_mi_venta_description,
                R.drawable.restaurant_lamiventa, R.string.restaurant_la_mi_venta_location, 20));

        SiteAdapter adapter = new SiteAdapter(getActivity(), sites, R.color.category_restaurants);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
