package com.liu.administratorexample.oneweekends_1701a_01.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.liu.administratorexample.oneweekends_1701a_01.Bean.Bean;
import com.liu.administratorexample.oneweekends_1701a_01.R;
import com.liu.administratorexample.oneweekends_1701a_01.adaper.MyAdapter;
import com.liu.administratorexample.oneweekends_1701a_01.https.Fengzhuang;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class AFragment extends Fragment {


    private RecyclerView recycle;
    private List<Bean.CardBean> list=new ArrayList<>();
    private String url="http://baike.baidu.com/api/openapi/BaikeLemmaCardApi?scope=103&format=json&appid=379020&bk_key=%E9%AB%98%E6%99%93%E6%9D%BE&bk_length=600";

    public AFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        initView(view);
        initDate();

        return view;
    }

    private void initDate() {
        Fengzhuang.getFengzhuang().jiexi(url, new Fengzhuang.GetBeantu() {
            @Override
            public void showtu(Bean bean) {
                list.addAll(bean.getCard());
                MyAdapter myAdapter=new MyAdapter(getActivity(),list);
                recycle.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
                recycle.setAdapter(myAdapter);
                myAdapter.notifyDataSetChanged();

            }
        });
    }

    private void initView(View view) {
        recycle = (RecyclerView) view.findViewById(R.id.recycle);
    }
}
