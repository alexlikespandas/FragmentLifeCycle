package com.example.fragmentlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LaunchActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
        findViewById(R.id.btn_NormalViewPager).setOnClickListener(this);
        findViewById(R.id.btn_TabLayoutViewPager).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_NormalViewPager:
                startActivity(new Intent(LaunchActivity.this, NormalViewPageActivity.class));
                break;
            case R.id.btn_TabLayoutViewPager:
                startActivity(new Intent(LaunchActivity.this, TabLayoutActivity.class));
                break;

        }
    }
}
