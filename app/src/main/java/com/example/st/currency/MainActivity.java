package com.example.st.currency;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void currencyConverter(View view){
        Log.i("Info", " Button Pressed!");
        EditText text = (EditText) findViewById(R.id.beforeConvert);
        String amountOfMoney = text.getText().toString();
        Double amountOfMoneyDouble = 1.3*(Double.parseDouble(amountOfMoney));
        String afterConvertTwoDecimal = String.format("%.2f", amountOfMoneyDouble);
        Toast.makeText(this, amountOfMoney+" £ is "+afterConvertTwoDecimal+" $", Toast.LENGTH_LONG).show();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
