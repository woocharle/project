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
    Button caluculate;
    EditText lineno, flow, over, temp, vis, den, mol, comp, cpcv, pin, pout, dp1, dp2, dp3, eqlen, din, wall,
            pipelen, elechange;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup vg
                = (ViewGroup)inflater.inflate(R.layout.hydraulic_frag1, container, false);


        return vg;
    }

}
