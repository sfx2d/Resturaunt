package org.baltimorecityschools.miresturaunt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    Button moreInfoBTN, addressMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        moreInfoBTN = findViewById(R.id.moreInfoBTN);
        addressMap = findViewById(R.id.addressMap);


        moreInfoBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent anIntent = new Intent(MainActivity.this, Menu.class);
                anIntent.putExtra("Hamburger", toString());


                startActivity(anIntent);



            }
        });

    }
}