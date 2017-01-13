package com.m520it.smarttablayoutdemo;

import android.support.v4.app.Fragment;

/**
 * @author Jacob.Huang
 * @time 2017/1/10  14:05
 * @desc ${TODD}
 */
public class FragmentInfo {
    Fragment mFragment;
    String titile;

    public FragmentInfo(Fragment fragment, String titile) {
        mFragment = fragment;
        this.titile = titile;
    }

    public Fragment getFragment() {
        return mFragment;
    }

    public void setFragment(Fragment fragment) {
        mFragment = fragment;
    }

    public String getTitile() {
        return titile;
    }

    public void setTitile(String titile) {
        this.titile = titile;
    }
}
