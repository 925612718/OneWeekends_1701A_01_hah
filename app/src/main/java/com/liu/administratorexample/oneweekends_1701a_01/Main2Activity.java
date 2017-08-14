package com.liu.administratorexample.oneweekends_1701a_01;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.liu.administratorexample.oneweekends_1701a_01.Bean.Student;
import com.liu.administratorexample.oneweekends_1701a_01.adaper.MyAdperdemo;
import com.liu.administratorexample.oneweekends_1701a_01.fragment.AFragment;
import com.liu.administratorexample.oneweekends_1701a_01.fragment.BFragment;
import com.liu.administratorexample.oneweekends_1701a_01.fragment.CFragment;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {
    private ListView listview;
    private ViewPager pager;
    private List<Fragment> list = new ArrayList<>();
    private List<Student> list1 = new ArrayList<>();
    private MyAdperdemo adperdemo;
    private MyAdper myAdper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
    }

    private void initDate() {
        Student student1 = new Student("个人简介");
        Student student2 = new Student("个人照片");
        Student student3 = new Student("加载更多");
        list1.add(student1);
        list1.add(student2);
        list1.add(student3);
        list.add(new AFragment());
        list.add(new BFragment());
        list.add(new CFragment());
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        pager.setCurrentItem(0);

                        break;
                    case 1:
                        pager.setCurrentItem(1);
                        break;
                    case 2:
                        pager.setCurrentItem(2);
                        break;
                }
            }
        });
    }

    private void initView() {
        listview = (ListView) findViewById(R.id.listview);
        pager = (ViewPager) findViewById(R.id.pager);
    }

    private class MyAdper extends FragmentPagerAdapter {


        public MyAdper(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return list.get(position);
        }

        @Override
        public int getCount() {
            return list.size();
        }
    }
}
