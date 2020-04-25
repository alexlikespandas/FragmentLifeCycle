package com.example.fragmentlifecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class NormalViewPageActivity extends AppCompatActivity {

    final String tag = getClass().getSimpleName();
    ViewPager viewPager;
    ArrayList<Fragment> fragments;
    String[] strings = new String[]{"a", "b", "c", "d", "e"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("test",  tag + " onCreate:");
        setContentView(R.layout.activity_normal_view_pager);
        viewPager = findViewById(R.id.viewpager);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                Log.e("test",  tag + " positionOffset: " + positionOffset+"， positionOffsetPixels： " + positionOffsetPixels);
            }

            @Override
            public void onPageSelected(int position) {
                Log.e("test",  tag + " position: " + position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                Log.e("test",  tag + " state: " + state);
            }
        });
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
        viewPager.setOffscreenPageLimit(5);
//        viewPager.setCurrentItem(2);


    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("test",  tag + " onRestart:");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("test", tag + " onStart:");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("test", tag + " onResume:");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("test", tag + " onPause:");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("test", "onStop:" + tag);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e("test", "onSaveInstanceState:" + tag);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("test", "onDestroy:" + tag);
    }
}
