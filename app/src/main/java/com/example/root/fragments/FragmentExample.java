package com.example.root.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by root on 8/31/17.
 */


public class FragmentExample extends Fragment {
    private static String LAYOUT_ID = "LAYOUT_ID";
    private static int layout_id;

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    public static Fragment newInstance(int layoutID) {
        FragmentExample example = new FragmentExample();
        Bundle args = new Bundle();
        args.putInt(LAYOUT_ID, layout_id);
        return example;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
