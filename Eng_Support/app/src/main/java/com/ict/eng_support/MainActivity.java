package com.ict.eng_support;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button unit, simple, hydraulic, heattrans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        unit = findViewById(R.id.unit);
        simple = findViewById(R.id.simple);
        hydraulic = findViewById(R.id.hydraulic);
        heattrans = findViewById(R.id.heattrans);

        unit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, UnitConverter.class);
                startActivity(intent);
            }
        });

        simple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SimpleCalculate.class);
                startActivity(intent);
            }
        });

        hydraulic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Hydraulic.class);
                startActivity(intent);
            }
        });

        heattrans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, HeatTransfer.class);
                startActivity(intent);
            }
        });

    }
}