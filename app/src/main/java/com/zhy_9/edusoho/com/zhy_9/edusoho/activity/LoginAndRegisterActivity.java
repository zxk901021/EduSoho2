package com.zhy_9.edusoho.com.zhy_9.edusoho.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.zhy_9.edusoho.R;
import com.zhy_9.edusoho.adapter.TabPagerAdapter;
import com.zhy_9.edusoho.com.zhy_9.edusoho.fragments.LoginFragment;
import com.zhy_9.edusoho.com.zhy_9.edusoho.fragments.RegisterFragment;

import java.util.ArrayList;
import java.util.List;

public class LoginAndRegisterActivity extends FragmentActivity {

    private ViewPager tabPager;
    private List<Fragment> tabs;
    private TabPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        initTabs();

    }

    public void initView(){
        tabPager = (ViewPager) findViewById(R.id.tabs_exchange_pager);
    }

    public void initTabs(){
        tabs = new ArrayList<Fragment>();
        LoginFragment login = new LoginFragment();
        RegisterFragment register = new RegisterFragment();
        tabs.add(login);
        tabs.add(register);
        adapter = new TabPagerAdapter(getSupportFragmentManager(),tabs);
        tabPager.setAdapter(adapter);
    }

}
