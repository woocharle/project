package com.ict.eng_support;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Hydraulic_frag1 extends Fragment {
    Button calculate;
    EditText lineno, flow;
    String fitting_1, fitting_2;
    Hydraulic hydraulic;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        hydraulic = new Hydraulic();

        ViewGroup vg
                = (ViewGroup)inflater.inflate(R.layout.hydraulic_frag1, container, false);

        calculate = vg.findViewById(R.id.hyd_calculation);
        lineno = vg.findViewById(R.id.hyd_lineno);
        flow = vg.findViewById(R.id.hyd_flow);


        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Hydraulic hydraulic = (Hydraulic)getActivity();
                String[] fitting = hydraulic.sendFitting();

                fitting_1 = fitting[0];
                fitting_2 = fitting[1];

                String chk = fitting_1 + "," + fitting_2;
                lineno.setText(chk);
            }
        });

        return vg;
    }

    public double change_type(EditText sth){
        double num = 0;
        String str = sth.getText().toString();
        num = Double.parseDouble(str);

        return num;
    }



}
