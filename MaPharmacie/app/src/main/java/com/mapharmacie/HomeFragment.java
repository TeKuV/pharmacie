package com.mapharmacie;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageClickListener;
import com.synnapps.carouselview.ImageListener;

public class HomeFragment extends Fragment implements View.OnClickListener {
    private int[] nImages = new int[]{
            R.drawable.ic_medicine_bro, R.drawable.ic_pharmacist, R.drawable.ic_medicine_amico
    };

    private View view;
    LinearLayout ll_category;
    RelativeLayout recent_btn1;
    CarouselView carouselView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =  inflater.inflate(R.layout.fragment_home, container, false);

        ll_category = view.findViewById(R.id.ll_category);
        recent_btn1 = view.findViewById(R.id.recent_item1);
        carouselView = view.findViewById(R.id.carousel);

        recent_btn1.setOnClickListener(this);
        ll_category.setOnClickListener(this);

        carouselView.setPageCount(nImages.length);
        carouselView.setImageListener(new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                imageView.setImageResource(nImages[position]);
            }
        });
        return view;

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.recent_item1:
                Intent intent1 = new Intent(getActivity(), SingleProduct.class);
                startActivity(intent1);
                break;
            case R.id.ll_category:
                Intent intent2 = new Intent(getActivity(), Category.class);
                startActivity(intent2);
                break;
        }
    }
}
