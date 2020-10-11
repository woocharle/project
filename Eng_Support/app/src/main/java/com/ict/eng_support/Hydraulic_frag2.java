package com.ict.eng_support;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class Hydraulic_frag2 extends Fragment {
    Bundle bd;
    FragmentManager fm;
    FragmentTransaction fmt;
    Hydraulic_frag1 hydraulic_frag1;

    EditText fitting_1, fitting_2, fitting_3, fitting_4, fitting_5, fitting_6, fitting_7, fitting_8,
             fitting_9, fitting_10, fitting_11, fitting_12, fitting_13, fitting_14, fitting_15, fitting_16,
             fitting_17, fitting_18, fitting_19, fitting_20, fitting_21, fitting_22, fitting_23, fitting_24,
             fitting_25, fitting_26, fitting_27, fitting_28, fitting_29, fitting_30, fitting_31, fitting_32,
             fitting_33, fitting_34, fitting_35, fitting_36, fitting_37;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        bd = new Bundle();
        fm = getChildFragmentManager();
        fmt = fm.beginTransaction();
        hydraulic_frag1 = new Hydraulic_frag1();

        ViewGroup vg
                = (ViewGroup)inflater.inflate(R.layout.hydraulic_frag2, container, false);

        fitting_1=(EditText) vg.findViewById(R.id.fitting_h1);
        fitting_2=(EditText) vg.findViewById(R.id.fitting_h2);
        fitting_3=(EditText) vg.findViewById(R.id.fitting_h3);
        fitting_4=(EditText) vg.findViewById(R.id.fitting_h4);
        fitting_5=(EditText) vg.findViewById(R.id.fitting_h5);
        fitting_6=(EditText) vg.findViewById(R.id.fitting_h6);
        fitting_7=(EditText) vg.findViewById(R.id.fitting_h7);
        fitting_8=(EditText) vg.findViewById(R.id.fitting_h8);
        fitting_9=(EditText) vg.findViewById(R.id.fitting_h9);
        fitting_10=(EditText) vg.findViewById(R.id.fitting_h10);
        fitting_11=(EditText) vg.findViewById(R.id.fitting_h11);
        fitting_12=(EditText) vg.findViewById(R.id.fitting_h12);
        fitting_13=(EditText) vg.findViewById(R.id.fitting_h13);
        fitting_14=(EditText) vg.findViewById(R.id.fitting_h14);
        fitting_15=(EditText) vg.findViewById(R.id.fitting_h15);
        fitting_16=(EditText) vg.findViewById(R.id.fitting_h16);
        fitting_17=(EditText) vg.findViewById(R.id.fitting_h17);
        fitting_18=(EditText) vg.findViewById(R.id.fitting_h18);
        fitting_19=(EditText) vg.findViewById(R.id.fitting_h19);
        fitting_20=(EditText) vg.findViewById(R.id.fitting_h20);
        fitting_21=(EditText) vg.findViewById(R.id.fitting_h21);
        fitting_22=(EditText) vg.findViewById(R.id.fitting_h22);
        fitting_23=(EditText) vg.findViewById(R.id.fitting_h23);
        fitting_24=(EditText) vg.findViewById(R.id.fitting_h24);
        fitting_25=(EditText) vg.findViewById(R.id.fitting_h25);
        fitting_26=(EditText) vg.findViewById(R.id.fitting_h26);
        fitting_27=(EditText) vg.findViewById(R.id.fitting_h27);
        fitting_28=(EditText) vg.findViewById(R.id.fitting_h28);
        fitting_29=(EditText) vg.findViewById(R.id.fitting_h29);
        fitting_30=(EditText) vg.findViewById(R.id.fitting_h30);
        fitting_31=(EditText) vg.findViewById(R.id.fitting_h31);
        fitting_32=(EditText) vg.findViewById(R.id.fitting_h32);
        fitting_33=(EditText) vg.findViewById(R.id.fitting_h33);
        fitting_34=(EditText) vg.findViewById(R.id.fitting_h34);
        fitting_35=(EditText) vg.findViewById(R.id.fitting_h35);
        fitting_36=(EditText) vg.findViewById(R.id.fitting_h36);
        fitting_37=(EditText) vg.findViewById(R.id.fitting_h37);


        bd.putString("fitting_h1", String.valueOf(fitting_1));
        bd.putString("fitting_h2", String.valueOf(fitting_2));

        hydraulic_frag1.setArguments(bd);

        return vg;
    }

}
