package com.zhy_9.edusoho.com.zhy_9.edusoho.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zhy_9.edusoho.R;

/**
 * Created by ZHY_9 on 2016/5/30.
 */
public class PersonCenterFragment extends Fragment{
    @Override
    @Nullable
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_person_center, null);
    }
}
