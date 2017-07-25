package com.example.android.tourguideapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Vicuko on 17/7/17.
 */

public class SiteAdapter extends ArrayAdapter<Site> {

    private int mColorResourceId;

    public SiteAdapter(Activity context, ArrayList<Site> sites, int colorResourceId) {
        super(context, 0, sites);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Site site = getItem(position);

        TextView placeName = (TextView) listItemView.findViewById(R.id.place_name);
        placeName.setText(site.getSiteName());

        TextView descriptionContent = (TextView) listItemView.findViewById(R.id.description_content);
        descriptionContent.setText(site.getSiteDescription());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        if (site.hasImage()){
            imageView.setImageResource(site.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }

        else {
            imageView.setVisibility(View.GONE);
        }

        View textContainer = (RelativeLayout) listItemView.findViewById(R.id.list);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}