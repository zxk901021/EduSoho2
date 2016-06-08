package com.zhy_9.edusoho.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by ZHY_9 on 2016/6/8.
 */
public class TabPagerAdapter extends FragmentPagerAdapter{

    private List<Fragment> tabs;

    public TabPagerAdapter(FragmentManager fm, List<Fragment> tabs) {
        super(fm);
        this.tabs = tabs;
    }

    @Override
    public Fragment getItem(int position) {
        return tabs.get(position);
    }

    @Override
    public int getCount() {
        return tabs.size();
    }
}
