package com.example.android.tourguide;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by lixiaochi on 28/11/16.
 */

public class PlacesAdapter extends ArrayAdapter {

    private int color;

    public PlacesAdapter(Activity context, ArrayList<places> word,int color) {
        super(context, 0, word);
        this.color= color;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.single_item, parent,false);
        }

        places currentPlace = (places) getItem(position);

        listItemView.setBackgroundColor(ContextCompat.getColor(getContext(), color));
        TextView title = (TextView) listItemView.findViewById(R.id.title_text_view);
        TextView description = (TextView) listItemView.findViewById(R.id.content_text_view);

        title.setText(currentPlace.getStringResourcId());
        description.setText(currentPlace.getTextResourcId());

        ImageView image = (ImageView) listItemView.findViewById(R.id.word_image);

        if (currentPlace.hasImageResourcId() == true){
            image.setImageResource(currentPlace.getImageResourcId());
            image.setVisibility(View.VISIBLE);
        } else{
            image.setVisibility(View.GONE);
        }
        return listItemView;
    }
}
