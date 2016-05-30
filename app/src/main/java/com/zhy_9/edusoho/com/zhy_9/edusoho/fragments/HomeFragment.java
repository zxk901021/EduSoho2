package com.zhy_9.edusoho.com.zhy_9.edusoho.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zhy_9.edusoho.R;

/**
 * Created by ZHY_9 on 2016/5/30.
 */
public class HomeFragment extends Fragment{

    private Toolbar topBar;

    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, null);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
    }

    public void initView(){
        topBar = (Toolbar) getActivity().findViewById(R.id.home_toolbar);
        topBar.setTitle("万科集团");

        topBar.setNavigationIcon(R.mipmap.ic_launcher);
    }



}
