package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class southBankActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pages);

        final ArrayList<places> placeList = new ArrayList<>();
        placeList.add(new places(R.string.sb_cinema,R.string.discription_sb_cinema));
        placeList.add(new places(R.string.sb_food,R.string.discription_sb_food));

        LinearLayout lLayout = (LinearLayout) findViewById(R.id.l_view);
        ImageView image = (ImageView) findViewById(R.id.place_image);
        lLayout.removeView(image);

        ListView galleryList = (ListView) findViewById(R.id.list);

        galleryList.setAdapter(new PlacesAdapter(this, placeList, R.color.south_bank));
    }
}
