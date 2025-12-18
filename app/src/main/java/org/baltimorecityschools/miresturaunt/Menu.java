package org.baltimorecityschools.miresturaunt;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Menu extends AppCompatActivity {
    Button addBTN, subtractBTN, totalBTN, sendBTN;
    int quantity;
    TextView qtyTV, subtotalTV, taxTV, totalTV;
    Burger burgerOrder;
    double subtotal, tax, total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        addBTN = findViewById(R.id.addBTN);
        subtractBTN = findViewById(R.id.subtractBTN);
        totalBTN = findViewById(R.id.totalBTN);
        sendBTN = findViewById(R.id.sendBTN);
        qtyTV = findViewById(R.id.qtyTV);
        subtotalTV = findViewById(R.id.subtotalTV);
        quantity = 0;
        taxTV = findViewById(R.id.taxTV);
        totalTV = findViewById(R.id.totaLtv);

        addBTN.setOnClickListener(v -> {
            quantity +=1;
            qtyTV.setText(quantity + "");
        });
        subtractBTN.setOnClickListener(v -> {

            if (quantity > 0){
                quantity -=1;
                qtyTV.setText(quantity + "");
            }


        });
        totalBTN.setOnClickListener(v -> {
            burgerOrder = new Burger(false, false, quantity);
            Log.d("aaa", burgerOrder.toString());
            subtotal = burgerOrder.getPrice();
            subtotalTV.setText("Subtotal: $ " + subtotal);
            tax = subtotal * 0.06;
            total = subtotal + tax;
            taxTV.setText("Tax: $ " + tax);
            totalTV.setText("Total: $ " + total);



        });
        sendBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String body = "New order";
                String subject = "New Burger Order";
                String[] emailAddress = new String[]{"kevinromerohernandez16@gmail.com"};
                composeEmail(body, subject, emailAddress);

            }
        });




    }
    public void composeEmail(String body, String subject, String[] emailAddress) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // Only email apps handle this.
        intent.putExtra(Intent.EXTRA_TEXT, body);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_EMAIL, emailAddress);
        startActivity(intent);
    }

}