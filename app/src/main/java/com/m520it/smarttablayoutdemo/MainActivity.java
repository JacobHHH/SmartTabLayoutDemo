package com.m520it.smarttablayoutdemo;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.m520it.smarttablayoutdemo.fragment.FristFragment;
import com.ogaclejapan.smarttablayout.SmartTabLayout;

import java.util.ArrayList;
//在Xml配置stl_customTabTextLayoutId引入一个layout-textView布局设置id
//再在Xml配置stl_customTabTextViewId引入textView的id
//文字样色在colorXml里面设置selected
//文字在strings里面配置stringArray
//FragmentStatePagerAdapter覆写getPagerTTitle方法

public class MainActivity extends AppCompatActivity {
    private ArrayList<FragmentInfo> pages;
    private SmartTabLayout smartTablayout;
    private ViewPager viewPager;
    private FragmentInfo mInfo;
    private MyAdapter viewPagerAdater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();


        viewPagerAdater= new MyAdapter(getSupportFragmentManager(),pages);
        viewPager.setAdapter(viewPagerAdater);
        smartTablayout.setViewPager(viewPager);
        viewPagerAdater.notifyDataSetChanged();

    }

    private void initView() {
        smartTablayout = (SmartTabLayout) findViewById(R.id.smarttab);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
    }

    private void initData() {
         String[] titles = getResources().getStringArray(R.array.my_titles);
        pages=new ArrayList<>();

                for (int i=0;i<titles.length;i++){
                    mInfo = new FragmentInfo(new FristFragment(),titles[i]);
                    pages.add(mInfo);
                }



    }
}
