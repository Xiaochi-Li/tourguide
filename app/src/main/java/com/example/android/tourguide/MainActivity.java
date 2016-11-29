package com.example.android.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView uq = (TextView) findViewById(R.id.uq);
        uq.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent uqIntent = new Intent(MainActivity.this,UQ.class);
                startActivity(uqIntent);
            }
        });

        TextView southBank = (TextView) findViewById(R.id.south_bank);
        southBank.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent southBankIntent = new Intent(MainActivity.this,southBankActivity.class);
                startActivity(southBankIntent);
            }
        });

        TextView mtLookout = (TextView) findViewById(R.id.mt_lookout);
        mtLookout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent mtLookoutIntent = new Intent(MainActivity.this,mtLookoutActivity.class);
                startActivity(mtLookoutIntent);
            }
        });

        TextView artGallery = (TextView) findViewById(R.id.art_gallery);
        artGallery.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent artGalleryIntent = new Intent(MainActivity.this,galleryActivity.class);
                startActivity(artGalleryIntent);
            }
        });
    }
}
