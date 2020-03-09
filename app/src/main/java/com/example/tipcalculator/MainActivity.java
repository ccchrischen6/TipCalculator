package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Order order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) getView("B_1");
        button.setOnClickListener(listener);
    }

    /** button listener */
    private View.OnClickListener listener = new View.OnClickListener() {
        public void onClick(View v) {
            Button button = (Button) v;

            EditText e1 = (EditText) getView("E_1");
            EditText e2 = (EditText) getView("E_2");
            EditText e3 = (EditText) getView("E_3");

            order = new Order(Double.parseDouble(e1.getText().toString()),
                                Double.parseDouble(e2.getText().toString()),
                                Double.parseDouble(e3.getText().toString())
                    );
            jump();
        }
    };

    //get View by its ID
    private View getView(String sID) {
        int ID = getResources().getIdentifier(sID, "id", getPackageName());
        return findViewById(ID);
    }

    /** go to the second activity */
    public void jump(){
        /** create an intent of target activity*/
        Intent intent = new Intent(this, Summary.class);

        /** put the parameter to transfer*/
        intent.putExtra(Keys.ORDER_KEY, order);
        startActivity(intent);
    }
}
