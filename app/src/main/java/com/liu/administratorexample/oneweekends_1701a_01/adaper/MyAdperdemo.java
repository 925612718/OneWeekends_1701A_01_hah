package com.liu.administratorexample.oneweekends_1701a_01.adaper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.liu.administratorexample.oneweekends_1701a_01.Bean.Student;
import com.liu.administratorexample.oneweekends_1701a_01.R;

import java.util.List;

public class MyAdperdemo extends BaseAdapter {
    private final Context context;
    private final List<Student> list1;

    public MyAdperdemo(Context context, List<Student> list1) {
        this.context = context;
        this.list1 = list1;
    }

    @Override
    public int getCount() {
        return list1.size();
    }

    @Override
    public Object getItem(int position) {
        return list1.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHordle hordle;
        if (convertView == null) {
            hordle = new ViewHordle();
            convertView = LayoutInflater.from(context).inflate(R.layout.liebiao, null);
            hordle.name= (TextView) convertView.findViewById(R.id.name);
            convertView.setTag(hordle);

        } else {
            hordle = (ViewHordle) convertView.getTag();
        }
        hordle.name.setText(list1.get(position).getName());

        return convertView;
    }

    class ViewHordle {
        TextView name;
    }
}