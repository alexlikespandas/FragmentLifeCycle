package com.example.fragmentlifecycle;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentA extends Fragment {
    TextView textView;
    String s;

    public FragmentA(String s) {
        super();
        this.s = s;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e("Test", "onAttach:" + s);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("Test", "onCreate:" + s);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_a, null);
        textView = view.findViewById(R.id.tv_frag_a);
        Log.e("Test", "onCreateView:" + s);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e("Test", "onActivityCreated:" + s);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e("Test", "onStart:" + s);
    }

    @Override
    public void onResume() {
        super.onResume();
        textView.setText(s);
        Log.e("Test", "onResume:" + s);
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("Test", "onPause:" + s);
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("Test", "onStop:" + s);
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e("Test", "onSaveInstanceState:" + s);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("Test", "onDestroyView:" + s);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("Test", "onDestroy:" + s);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("Test", "onDetach:" + s);
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        Log.e("Test", "setUserVisibleHint:" + s + ", isVisibleToUser = "+isVisibleToUser);
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        Log.e("Test", "onHiddenChanged:" + s + ", hidden = "+hidden);
    }
}