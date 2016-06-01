package com.zhy_9.edusoho.adapter;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by ZHY_9 on 2016/6/1.
 */
public class LaunchPagerAdapter extends PagerAdapter{

    private List<View> views;

    public LaunchPagerAdapter(List<View> views) {
        this.views = views;
    }

    @Override
    public int getCount() {
        if (views != null){
            return views.size();
        }
        else return 0;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager)container).removeView(views.get(position));
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(views.get(position), 0);
        return views.get(position);
    }
}
