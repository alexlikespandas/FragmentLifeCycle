package com.example.fragmentlifecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Toast;

import com.blankj.utilcode.util.ToastUtils;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class TabLayoutActivity extends AppCompatActivity {

    private String[] titles = new String[]{
            "测试1",
            "测试2",
            "测试3"
    };

    String[] channels = getResources().getStringArray(R.array.channel);

    private TabLayout mTabLayout;
    private ViewPager mVpContent;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);

        initView();

        TabLayout tabLayout = findViewById(R.id.tab);
//        for (int i = 0; i < titles.length; i++) {
//            TabLayout.Tab tab = tabLayout.newTab();//创建tab
//            tab.setIcon(R.mipmap.ic_launcher);//设置图标
//            tab.setText(titles[i]);//设置文字
//            tabLayout.addTab(tab);//添加到tabLayout中
//        }
//        for (int i = 0; i < channels.length; i++) {
//            TabLayout.Tab tab = tabLayout.newTab();//创建tab
//            tab.setIcon(R.mipmap.ic_launcher);//设置图标
//            tab.setText(channels[i]);//设置文字
//            tabLayout.addTab(tab);//添加到tabLayout中
//        }

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                ToastUtils.showShort(tab.getText());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }


    private void initView() {
        mTabLayout = (TabLayout) findViewById(R.id.tab);
        mVpContent = (ViewPager) findViewById(R.id.vp_content);
    }
}
