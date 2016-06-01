package com.zhy_9.edusoho.com.zhy_9.edusoho.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.zhy_9.edusoho.R;
import com.zhy_9.edusoho.adapter.LaunchPagerAdapter;
import com.zhy_9.edusoho.com.zhy_9.edusoho.util.EduSohoUtil;

import java.util.ArrayList;
import java.util.List;

import me.relex.circleindicator.CircleIndicator;

public class LaunchActivity extends Activity implements View.OnClickListener {

    private ViewPager launchPager;
    private List<View> views;
    private static final int[] imgs = new int[]{R.drawable.edu_launcher_1, R.drawable.edu_launcher_2, R.drawable.edu_launcher_3};
    private LaunchPagerAdapter adapter;
    private CircleIndicator indicator;
    private Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
        initView();
        initAdapter();
        addPagerChangedListener();
    }

    public void initView() {
        launchPager = (ViewPager) findViewById(R.id.launch_pager);
        indicator = (CircleIndicator) findViewById(R.id.launch_indicator);
        start = (Button) findViewById(R.id.launch_start);
    }

    public void initAdapter() {
        int j = imgs.length;
        views = new ArrayList<>();
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);
        for (int i = 0; i < j; i++) {
            ImageView img = new ImageView(this);
            img.setLayoutParams(params);
            Bitmap bitmap = EduSohoUtil.readBitmap(this,imgs[i]);
            img.setImageBitmap(bitmap);
//            img.setImageResource(imgs[i]);
            img.setScaleType(ImageView.ScaleType.FIT_XY);
            views.add(img);
        }
        adapter = new LaunchPagerAdapter(views);
        launchPager.setAdapter(adapter);
        indicator.setViewPager(launchPager);
    }

    public void addPagerChangedListener() {
        launchPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (position == (views.size() - 1)) {
                    start.setVisibility(View.VISIBLE);
                    start.setClickable(true);
                    start.setOnClickListener(LaunchActivity.this);
                } else {
                    start.setVisibility(View.INVISIBLE);
                    start.setClickable(false);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(LaunchActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
