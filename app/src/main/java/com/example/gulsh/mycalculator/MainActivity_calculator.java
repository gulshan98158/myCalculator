package com.example.gulsh.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity_calculator extends AppCompatActivity {

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
            return (i*j);
        }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_calculator);
    }
}
