package com.ict.eng_support;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class Hydraulic_frag2 extends Fragment {
    EditText fitting_1, fitting_2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup vg
                = (ViewGroup)inflater.inflate(R.layout.hydraulic_frag2, container, false);

        fitting_1 = vg.findViewById(R.id.fitting_h1);
        fitting_2 = vg.findViewById(R.id.fitting_h2);

        return vg;
    }

    public String[] getFitting(){
        String[] data = new String[38];

        data[0] = fitting_1.getText().toString();
        data[1] = fitting_2.getText().toString();

        return data;
    }
}
