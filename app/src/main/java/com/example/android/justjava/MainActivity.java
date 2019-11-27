package com.example.android.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int numberOfCoffees=2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void submitOrder(View view) {
        String priceMessagae="Total "+numberOfCoffees*5+"\nThank You";
        displayMessage(priceMessagae);
       displayPrice(numberOfCoffees*5);
        display(numberOfCoffees);
    }
    public void increment(View view) {

        numberOfCoffees=numberOfCoffees+1;
//        displayPrice(numberOfCoffees*5);
        display(numberOfCoffees);
    }
    public void decrement(View view) {

        numberOfCoffees=numberOfCoffees-1;
//        displayPrice(numberOfCoffees*5);
        display(numberOfCoffees);
    }

    private void displayMessage(String message) {
        TextView quantityTextView = (TextView) findViewById(R.id.comments);
        quantityTextView.setText(message);
    }
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}
