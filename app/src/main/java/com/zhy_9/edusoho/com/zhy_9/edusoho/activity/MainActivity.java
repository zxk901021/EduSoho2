package com.zhy_9.edusoho.com.zhy_9.edusoho.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.zhy_9.edusoho.R;
import com.zhy_9.edusoho.adapter.HomePagerAdapter;
import com.zhy_9.edusoho.com.zhy_9.edusoho.fragments.CourseFragment;
import com.zhy_9.edusoho.com.zhy_9.edusoho.fragments.EvaluationFragment;
import com.zhy_9.edusoho.com.zhy_9.edusoho.fragments.HomeFragment;
import com.zhy_9.edusoho.com.zhy_9.edusoho.fragments.PersonCenterFragment;

import java.util.ArrayList;

public class MainActivity extends FragmentActivity {

    private ViewPager homePager;
    private HomePagerAdapter adapter;
    private ArrayList<Fragment> fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initAdapter();
    }

    public void initView(){
        homePager = (ViewPager) findViewById(R.id.homepage_pager);
    }

    public void initAdapter(){
        fragments = new ArrayList<Fragment>();
        HomeFragment homeFragment = new HomeFragment();
        CourseFragment courseFragment = new CourseFragment();
        EvaluationFragment evaluationFragment = new EvaluationFragment();
        PersonCenterFragment personCenterFragment = new PersonCenterFragment();
        fragments.add(homeFragment);
        fragments.add(courseFragment);
        fragments.add(evaluationFragment);
        fragments.add(personCenterFragment);
        adapter = new HomePagerAdapter(getSupportFragmentManager(), fragments);
        homePager.setAdapter(adapter);
    }




}
