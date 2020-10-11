package com.ict.eng_support;

import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Hydraulic_frag1 extends Fragment {
    Bundle bd;
    Button calculate;
    EditText lineno, flow, over, temp, vis, den, mol, comp, cpcv, pin, pout, dp1, dp2, dp3, eqlen, din, wall,
             pipelen, elechange;

    double  fitting_1, fitting_2, fitting_3, fitting_4, fitting_5, fitting_6, fitting_7, fitting_8,
            fitting_9, fitting_10, fitting_11, fitting_12, fitting_13, fitting_14, fitting_15, fitting_16,
            fitting_17, fitting_18, fitting_19, fitting_20, fitting_21, fitting_22, fitting_23, fitting_24,
            fitting_25, fitting_26, fitting_27, fitting_28, fitting_29, fitting_30, fitting_31, fitting_32,
            fitting_33, fitting_34, fitting_35, fitting_36, fitting_37;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        bd = getArguments();
        ViewGroup vg
                = (ViewGroup)inflater.inflate(R.layout.hydraulic_frag1, container, false);

        calculate = (Button) vg.findViewById(R.id.hyd_calculation);
        lineno = (EditText) vg.findViewById(R.id.hyd_lineno);
        flow = (EditText) vg.findViewById(R.id.hyd_flow);
        over = (EditText) vg.findViewById(R.id.hyd_flow);
        temp = (EditText) vg.findViewById(R.id.hyd_flow);
        vis = (EditText) vg.findViewById(R.id.hyd_flow);
        den = (EditText) vg.findViewById(R.id.hyd_flow);
        mol = (EditText) vg.findViewById(R.id.hyd_flow);
        comp = (EditText) vg.findViewById(R.id.hyd_flow);
        cpcv = (EditText) vg.findViewById(R.id.hyd_flow);
        pin = (EditText) vg.findViewById(R.id.hyd_flow);
        pout = (EditText) vg.findViewById(R.id.hyd_flow);
        dp1 = (EditText) vg.findViewById(R.id.hyd_flow);
        dp2 = (EditText) vg.findViewById(R.id.hyd_flow);
        dp3 = (EditText) vg.findViewById(R.id.hyd_flow);
        eqlen = (EditText) vg.findViewById(R.id.hyd_flow);
        din = (EditText) vg.findViewById(R.id.hyd_flow);
        wall = (EditText) vg.findViewById(R.id.hyd_flow);
        pipelen = (EditText) vg.findViewById(R.id.hyd_flow);
        elechange = (EditText) vg.findViewById(R.id.hyd_flow);

        if(bd != null){
            fitting_1 = change_type(bd.getString("fitting_h1"));
            fitting_2 = change_type(bd.getString("fitting_h2"));
        }

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lineno.setText(String.valueOf(fitting_1 + fitting_2));
                // fitting_1.setText("hello");

            }
        });


        return vg;
    }

    public double change_type(String sth){
        double num =  0;

        if(sth.equals(null) || sth == null){
            num=0;
        }else{
            num = Double.parseDouble(sth);
        }

        return num;
    }
}
