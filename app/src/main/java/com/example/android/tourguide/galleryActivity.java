package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class galleryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pages);

        //create image view and make it invisible
        ImageView image = (ImageView) findViewById(R.id.place_image);
        image.setImageResource(R.drawable.artgallery);

        final ArrayList<places> placeList = new ArrayList<>();
        placeList.add(new places(R.string.Gallery_event,R.string.discription_Gallery_event));
        placeList.add(new places(R.string.Gallery_food,R.string.discription_Gallery_food));

        ListView galleryList = (ListView) findViewById(R.id.list);

        galleryList.setAdapter(new PlacesAdapter(this, placeList, R.color.gallery));
    }
}
