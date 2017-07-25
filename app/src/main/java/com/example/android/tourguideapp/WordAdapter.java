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
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Vicuko on 17/7/17.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words);
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

        // Get the {@link Word} object located at this position in the list
        Word word = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_text
        TextView miWokText = (TextView) listItemView.findViewById(R.id.miwok_text);

        // Get the word from the current Word object and set it on the TextView
        miWokText.setText(word.getMiWokTranslation());

        // Find the TextView in the list_item.xml layout with the ID default_text
        TextView defaultText = (TextView) listItemView.findViewById(R.id.default_text);

        // Get the word from the current Word object and set it on the TextView
        defaultText.setText(word.getDefautltTranslation());

        // Find the ImageView in the list_item.xml layout with the ID image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        if (word.hasImage()){
            // Get the image from the current Word object and set it on the ImageView
            imageView.setImageResource(word.getImageResourceId());

            // Set the ImageView visibility to visible
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            // Set the ImageView visibility to gone
            imageView.setVisibility(View.GONE);
        }

        View textContainer = (LinearLayout) listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}