package com.example.gulsh.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity_calculator extends AppCompatActivity {
        TextView result;
        EditText num1 , num2;
        Button add , sub , multi , divide;
        float number_result;
        int number1, number2;
        public double addition(double i, double j){
            return (i+j);
        }
        public double subtraction(double i, double j){
            return (i-j);
        }
        public double multiplication(double i, double j){
            return (i*j);
        }
        public double division(double i, double j){
            return (i/j);
        }


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_calculator);

        result = (TextView)findViewById(R.id.result );

        num1 = (EditText)findViewById(R.id.num1 );
        num2 = (EditText)findViewById(R.id.num2 );

        add = (Button) findViewById(R.id.add );
        sub  = (Button)findViewById(R.id.sub );
        multi  = (Button)findViewById(R.id.multi );
        divide  = (Button)findViewById(R.id.divide );
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 =Integer.parseInt(num1 .getText().toString());
                number2 =Integer.parseInt(num2 .getText().toString());
                number_result = number1+ number2 ;
                result.setText(String.valueOf(number_result) );
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 =Integer.parseInt(num1 .getText().toString());
                number2 =Integer.parseInt(num2 .getText().toString());
                number_result = number1-number2 ;
                result.setText(String.valueOf(number_result) );
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 =Integer.parseInt(num1 .getText().toString());
                number2 =Integer.parseInt(num2 .getText().toString());
                number_result = number1*number2 ;
                result.setText(String.valueOf(number_result) );
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 =Integer.parseInt(num1 .getText().toString());
                number2 =Integer.parseInt(num2 .getText().toString());
                number_result = number1/number2 ;
                result.setText(String.valueOf(number_result) );
            }
        });
    }
}
