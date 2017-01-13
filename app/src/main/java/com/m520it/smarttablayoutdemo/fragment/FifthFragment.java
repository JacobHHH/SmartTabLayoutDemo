package com.m520it.smarttablayoutdemo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.m520it.smarttablayoutdemo.R;

/**
 * @author Jacob.Huang
 * @time 2017/1/10  14:17
 * @desc ${TODD}
 */
public class FifthFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fifth, container, false);
        return view;
    }
}
