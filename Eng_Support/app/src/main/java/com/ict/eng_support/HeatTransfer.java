package com.ict.eng_support;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;

public class HeatTransfer extends AppCompatActivity {
    ViewPager pager;
    HeatTransfer_frag1 heatTransfer_frag1;
    HeatTransfer_frag2 heatTransfer_frag2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heat_transfer);
        pager = findViewById(R.id.pager2);
        pager.setOffscreenPageLimit(2);

        MyPagerAdapter adapter = new MyPagerAdapter(getSupportFragmentManager(), 0);

        heatTransfer_frag1 = new HeatTransfer_frag1();
        heatTransfer_frag2 = new HeatTransfer_frag2();

        adapter.addItem(heatTransfer_frag1);
        adapter.addItem(heatTransfer_frag2);


    }


    class MyPagerAdapter extends FragmentStatePagerAdapter {
        ArrayList<Fragment> items = new ArrayList<>();

        public MyPagerAdapter(@NonNull FragmentManager fm, int behavior) { super(fm, behavior); }

        public void addItem(Fragment item){items.add(item);}

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) { return super.getPageTitle(position); }

        @NonNull
        @Override
        public Fragment getItem(int position) { return items.get(position); }

        @Override
        public int getCount() { return items.size(); }
    }


}