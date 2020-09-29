package com.ict.eng_support;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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


    }
}