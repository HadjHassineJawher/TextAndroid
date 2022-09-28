package com.example.testandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textNumber = findViewById(R.id.TextView);

        TextView red = findViewById(R.id.red);
        TextView blue = findViewById(R.id.blue);
        TextView green = findViewById(R.id.green);
        TextView black = findViewById(R.id.black);
        TextView add = findViewById(R.id.add);
        TextView reset= findViewById(R.id.reset);

        red.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                textNumber.setBackgroundColor(R.color.red);
            }
        });

        green.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                textNumber.setBackgroundColor(R.color.green);
            }
        });
        blue.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                textNumber.setBackgroundColor(R.color.blue);
            }
        });
        black.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                textNumber.setBackgroundColor(R.color.black);
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i = 0;
                textNumber.setText(i++);
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                textNumber.setText("Hello Again !");
                textNumber.setBackgroundColor(R.color.defaut);
            }
        });
    }
}