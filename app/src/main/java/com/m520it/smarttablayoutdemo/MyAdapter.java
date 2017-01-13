package com.m520it.smarttablayoutdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

/**
 * @author Jacob.Huang
 * @time 2017/1/10  13:53
 * @desc ${TODD}
 */
//FragmentPagerAdapter 会把所有所的Fragment都加载进内存
//FragmentStatePagerAdapter 只会把需要显示的加载，不需要的会移除

public class MyAdapter extends FragmentStatePagerAdapter {
    ArrayList<FragmentInfo> mFragments;
    public MyAdapter(FragmentManager fm,ArrayList<FragmentInfo> fragments) {
        super(fm);
        mFragments=fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position).getFragment();
    }

    @Override
    public int getCount() {
        if(mFragments!=null) {
            return mFragments.size();
        }
        return 0;

    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mFragments.get(position).getTitile();
    }
}
