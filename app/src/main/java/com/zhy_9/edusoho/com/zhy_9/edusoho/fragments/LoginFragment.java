package com.zhy_9.edusoho.com.zhy_9.edusoho.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.zhy_9.edusoho.R;
import com.zhy_9.edusoho.com.zhy_9.edusoho.activity.MainActivity;

/**
 * Created by ZHY_9 on 2016/6/8.
 */
public class LoginFragment extends Fragment implements View.OnClickListener{

    private Button submit;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.login_layout, null);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        submit = (Button) getActivity().findViewById(R.id.login_submit);
        submit.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.login_submit:
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
                break;
        }

    }
}
