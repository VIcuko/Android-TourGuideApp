package com.example.android.tourguideapp;


import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import static android.media.AudioManager.AUDIOFOCUS_GAIN;
import static android.media.AudioManager.AUDIOFOCUS_LOSS;

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
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        //Create an ArrayList of sites
        final ArrayList<Site> sites = new ArrayList<Site>();
        sites.add(new Site("one", "lutti", R.drawable.number_one, R.raw.number_one));
        sites.add(new Site("two", "otiiko", R.drawable.number_two, R.raw.number_two));
        sites.add(new Site("three", "tolookosu", R.drawable.number_three, R.raw.number_three));
        sites.add(new Site("four", "oyyisa", R.drawable.number_four, R.raw.number_four));
        sites.add(new Site("five", "massokka", R.drawable.number_five, R.raw.number_five));
        sites.add(new Site("six", "temmokka", R.drawable.number_six, R.raw.number_six));
        sites.add(new Site("seven", "kenekaku", R.drawable.number_seven, R.raw.number_seven));
        sites.add(new Site("eight", "kawinta", R.drawable.number_eight, R.raw.number_eight));
        sites.add(new Site("nine", "wo’e", R.drawable.number_nine, R.raw.number_nine));
        sites.add(new Site("ten", "na’aacha", R.drawable.number_ten, R.raw.number_ten));

        WordAdapter adapter = new WordAdapter(getActivity(), sites, R.color.category_numbers);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
