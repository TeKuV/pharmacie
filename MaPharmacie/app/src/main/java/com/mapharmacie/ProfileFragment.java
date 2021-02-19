package com.mapharmacie;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ProfileFragment extends Fragment implements View.OnClickListener {

    private ImageView setting_btn, iv_list_prod;
    private LinearLayout iv_profile;

    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =  inflater.inflate(R.layout.fragment_profile, container, false);
        setting_btn = view.findViewById(R.id.iv_settings);
        iv_profile = view.findViewById(R.id.iv_profile);
        iv_list_prod = view.findViewById(R.id.iv_list_prod);

        setting_btn.setOnClickListener(this);
        iv_profile.setOnClickListener(this);
        iv_list_prod.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv_settings:
                Intent intent1 = new Intent(getActivity(), Settings.class);
                startActivity(intent1);
                break;
            case R.id.iv_profile:
                Intent intent2 = new Intent(getActivity(), SigninActivity.class);
                startActivity(intent2);
                break;
            case R.id.iv_list_prod:
                Intent intent3 = new Intent(getActivity(), Category.class);
                startActivity(intent3);
                break;
        }
    }
}
