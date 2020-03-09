package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Summary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
        setTitle("Your Receipt");

        Intent intent = getIntent();
        Order order = (Order) intent.getSerializableExtra(Keys.ORDER_KEY);

        TextView textView = (TextView) getView("A2_T1");
        textView.setText(order.toString());


    }

    //get View by its ID
    private View getView(String sID) {
        int ID = getResources().getIdentifier(sID, "id", getPackageName());
        return findViewById(ID);
    }
}
