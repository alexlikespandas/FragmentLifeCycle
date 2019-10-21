package com.example.fragmentlifecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    final String tag = MainActivity.class.getSimpleName();
    ViewPager viewPager;
    ArrayList<Fragment> fragments;
    String[] strings = new String[]{"a", "b", "c", "d", "e"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("Test",  "onCreate:"+tag);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewpager);

        fragments = new ArrayList<>();
        for (String s : strings) {
            fragments.add(new FragmentA(s));
        }
        FragmentManager fm = getSupportFragmentManager();
        FragmentPagerAdapter fragmentPagerAdapter = new FragmentPagerAdapter(fm) {
            @Override
            public Fragment getItem(int position) {
                return fragments.get(position);
            }

            @Override
            public int getCount() {
                return fragments.size();
            }
        };
        viewPager.setAdapter(fragmentPagerAdapter);
//        viewPager.setOffscreenPageLimit(5);
//        viewPager.setCurrentItem(1);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("Test",  "onRestart:" + tag);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Test", "onStart:" + tag);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Test", "onResume:" + tag);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Test", "onPause:" + tag);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Test", "onDestroy:" + tag);
    }
}
