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

    final String tag = getClass().getSimpleName();
    TextView textView;
    String s;

    public FragmentA(String s) {
        super();
        this.s = s;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e("Test", tag + " onAttach:" + s);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("Test", tag + " onCreate:" + s);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_a, null);
        textView = view.findViewById(R.id.tv_frag_a);
        Log.e("Test", tag + " onCreateView:" + s);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.e("Test", tag + " onViewCreated:" + s);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e("Test", tag + " onActivityCreated:" + s);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e("Test", tag + " onStart:" + s);
    }

    @Override
    public void onResume() {
        super.onResume();
        textView.setText(s);
        Log.e("Test", tag + " onResume:" + s);
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("Test", tag + " onPause:" + s);
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("Test", tag + " onStop:" + s);
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e("Test", tag + " onSaveInstanceState:" + s);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("Test", tag + " onDestroyView:" + s);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("Test", tag + " onDestroy:" + s);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("Test", tag + " onDetach:" + s);
    }

    /**
     * 当滑动ViewPage时调用该方法，注意先于onAttach方法执行
     * true，表示ViewPage滑入该Fragment界面
     * false，表示ViewPage滑出该Fragment界面
     * @param isVisibleToUser
     */
    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        Log.e("Test", tag + " setUserVisibleHint:" + s + " "+isVisibleToUser);
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        Log.e("Test", tag + " onHiddenChanged:" + s + " "+hidden);
    }
}