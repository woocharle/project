package com.ict.eng_support;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Spinner;

import java.util.ArrayList;

public class Hydraulic extends AppCompatActivity {
    ViewPager pager;
    Hydraulic_frag1 hydraulic_frag1;
    Hydraulic_frag2 hydraulic_frag2;
    ImageView back;
    Button calculate;
    EditText lineno, flow,
             fitting_1, fitting_2, fitting_3, fitting_4, fitting_5, fitting_6, fitting_7, fitting_8,
             fitting_9, fitting_10, fitting_11, fitting_12, fitting_13, fitting_14, fitting_15, fitting_16,
             fitting_17, fitting_18, fitting_19, fitting_20, fitting_21, fitting_22, fitting_23, fitting_24,
             fitting_25, fitting_26, fitting_27, fitting_28, fitting_29, fitting_30, fitting_31, fitting_32,
             fitting_33, fitting_34, fitting_35, fitting_36, fitting_37, fitting_38;

    Spinner spinner1, spinner2, spinner3, spinner4;
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hydraulic);
        pager = findViewById(R.id.pager1);
        pager.setOffscreenPageLimit(2);
        back = findViewById(R.id.back_hydraulic);

        MyPagerAdapter adapter = new MyPagerAdapter(getSupportFragmentManager(), 0);

        hydraulic_frag1 = new Hydraulic_frag1();
        hydraulic_frag2 = new Hydraulic_frag2();

        adapter.addItem(hydraulic_frag1);
        adapter.addItem(hydraulic_frag2);


        pager.setAdapter(adapter);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

    class MyPagerAdapter extends FragmentStatePagerAdapter{
        ArrayList<Fragment> items = new ArrayList<>();

        public MyPagerAdapter(@NonNull FragmentManager fm, int behavior) { super(fm, behavior); }

        public void addItem(Fragment item){items.add(item);}

        @Nullable
        @Override
        public String getPageTitle(int position) {
            String page=null;

            if(position == 0){
                page = "General";
            } else if(position == 1){
                page =  "Fitting";
            }
            return page;
        }

        @NonNull
        @Override
        public Fragment getItem(int position) { return items.get(position); }

        @Override
        public int getCount() { return items.size(); }
    }

}