package com.ict.eng_support;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class SimpleCalculate extends AppCompatActivity {
    Button btn1, btn2;
    EditText input1, input2, input3, input4,
             output1, output2, output3, output4,
             output5, output6, output7, output8;
    TextView text1, text2, text3, text4,
             text5, text6, text7, text8;

    ImageView back_simple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_calculate);

        btn1 = findViewById(R.id.simple_btn1);
        btn2 = findViewById(R.id.simple_btn2);
        back_simple = findViewById(R.id.back_simple);

        input1 = findViewById(R.id.sphere_1);
        input2 = findViewById(R.id.sphere_2);

        input3 = findViewById(R.id.cylinder_1);
        input4 = findViewById(R.id.cylinder_1);

        output1 = findViewById(R.id.sphere_3);
        output2 = findViewById(R.id.sphere_4);
        output3 = findViewById(R.id.sphere_5);
        output4 = findViewById(R.id.sphere_6);

        output5 = findViewById(R.id.cylinder_3);
        output6 = findViewById(R.id.cylinder_4);
        output7 = findViewById(R.id.cylinder_5);
        output8 = findViewById(R.id.cylinder_6);

        text1 = findViewById(R.id.sphere_text1);
        text1.setText(Html.fromHtml("m<sup>2</sup>"));
        text2 = findViewById(R.id.sphere_text2);
        text2.setText(Html.fromHtml("m<sup>2</sup>"));
        text3 = findViewById(R.id.sphere_text3);
        text3.setText(Html.fromHtml("m<sup>3</sup>"));
        text4 = findViewById(R.id.sphere_text4);
        text4.setText(Html.fromHtml("m<sup>3</sup>"));

        text5 = findViewById(R.id.cylinder_text1);
        text5.setText(Html.fromHtml("m<sup>2</sup>"));
        text6 = findViewById(R.id.cylinder_text2);
        text6.setText(Html.fromHtml("m<sup>2</sup>"));
        text7 = findViewById(R.id.cylinder_text3);
        text7.setText(Html.fromHtml("m<sup>3</sup>"));
        text8 = findViewById(R.id.cylinder_text4);
        text8.setText(Html.fromHtml("m<sup>3</sup>"));

        back_simple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
}