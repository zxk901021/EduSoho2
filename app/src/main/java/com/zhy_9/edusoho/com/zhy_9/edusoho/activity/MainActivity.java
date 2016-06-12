package com.zhy_9.edusoho.com.zhy_9.edusoho.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.widget.ImageView;
import android.widget.TextView;

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
    private ImageView homePageImg, courseImg, evaluationImg, personImg;
    private TextView homePageTv, courseTv, evaluationTv, personTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initAdapter();
    }

    public void initView(){
        homePager = (ViewPager) findViewById(R.id.homepage_pager);
        homePageImg = (ImageView) findViewById(R.id.home_img);
        homePageTv = (TextView) findViewById(R.id.home_tv);
        courseImg = (ImageView) findViewById(R.id.course_img);
        courseTv = (TextView) findViewById(R.id.course_tv);
        evaluationImg = (ImageView) findViewById(R.id.evaluation_img);
        evaluationTv = (TextView) findViewById(R.id.evaluation_tv);
        personImg = (ImageView) findViewById(R.id.person_img);
        personTv = (TextView) findViewById(R.id.person_tv);
        homePager.setCurrentItem(0);
        homePager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                setHomeBottomMenuSelected(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
    public void setHomeBottomMenuSelected(int position){
        switch (position) {
            case 0:
                homePageImg.setImageResource(R.drawable.home_icon);
                homePageTv.setTextColor(getResources().getColor(R.color.home_munu_text_selected));
                courseImg.setImageResource(R.drawable.course_icon);
                evaluationImg.setImageResource(R.drawable.evaluate_icon);
                personImg.setImageResource(R.drawable.member_center_icon);
                courseTv.setTextColor(getResources().getColor(R.color.home_menu_text));
                evaluationTv.setTextColor(getResources().getColor(R.color.home_menu_text));
                personTv.setTextColor(getResources().getColor(R.color.home_menu_text));
                break;
            case 1:
                homePageImg.setImageResource(R.drawable.home_icon_unselected);
                homePageTv.setTextColor(getResources().getColor(R.color.home_menu_text));
                courseImg.setImageResource(R.drawable.course_icon_selected);
                evaluationImg.setImageResource(R.drawable.evaluate_icon);
                personImg.setImageResource(R.drawable.member_center_icon);
                courseTv.setTextColor(getResources().getColor(R.color.home_munu_text_selected));
                evaluationTv.setTextColor(getResources().getColor(R.color.home_menu_text));
                personTv.setTextColor(getResources().getColor(R.color.home_menu_text));
                break;
            case 2:
                homePageImg.setImageResource(R.drawable.home_icon_unselected);
                homePageTv.setTextColor(getResources().getColor(R.color.home_menu_text));
                courseImg.setImageResource(R.drawable.course_icon);
                evaluationImg.setImageResource(R.drawable.evaluate_icon_selected);
                personImg.setImageResource(R.drawable.member_center_icon);
                courseTv.setTextColor(getResources().getColor(R.color.home_menu_text));
                evaluationTv.setTextColor(getResources().getColor(R.color.home_munu_text_selected));
                personTv.setTextColor(getResources().getColor(R.color.home_menu_text));
                break;
            case 3:
                homePageImg.setImageResource(R.drawable.home_icon_unselected);
                homePageTv.setTextColor(getResources().getColor(R.color.home_menu_text));
                courseImg.setImageResource(R.drawable.course_icon);
                evaluationImg.setImageResource(R.drawable.evaluate_icon);
                personImg.setImageResource(R.drawable.member_center_icon_selected);
                courseTv.setTextColor(getResources().getColor(R.color.home_menu_text));
                evaluationTv.setTextColor(getResources().getColor(R.color.home_menu_text));
                personTv.setTextColor(getResources().getColor(R.color.home_munu_text_selected));
                break;
        }

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
