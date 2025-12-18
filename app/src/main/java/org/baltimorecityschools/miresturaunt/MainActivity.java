package org.baltimorecityschools.miresturaunt;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    Button moreInfoBTN, addressMap;
    String myDinerLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        moreInfoBTN = findViewById(R.id.moreInfoBTN);
        addressMap = findViewById(R.id.addressMap);
        myDinerLocation = "geo:0,0?q=6798+Reisterstown+RD+Baltimore%2C+MD";


        moreInfoBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent anIntent = new Intent(MainActivity.this, Menu.class);
                anIntent.putExtra("Hamburger", toString());


                startActivity(anIntent);



            }
        });
        addressMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showMap(Uri.parse(myDinerLocation));
            }
        });

    }
    public void showMap(Uri geoLocation) {
        Intent intentMap = new Intent(Intent.ACTION_VIEW);
        intentMap.setData(geoLocation);

        startActivity(intentMap);

    }
}