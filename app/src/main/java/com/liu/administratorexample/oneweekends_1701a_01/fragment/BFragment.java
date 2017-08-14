package com.liu.administratorexample.oneweekends_1701a_01.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.liu.administratorexample.oneweekends_1701a_01.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class BFragment extends Fragment {

    private ImageView src;

    public BFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        initView(view);
        return view;
    }
    String url="http://c.hiphotos.baidu.com/baike/pic/item/c8ea15ce36d3d539b4f769863f87e950342ab0a8.jpg";
    private void initView(View view) {
        src = (ImageView) view.findViewById(R.id.src);
        Glide.with(getActivity()).load(url).into(src);
    }
}
