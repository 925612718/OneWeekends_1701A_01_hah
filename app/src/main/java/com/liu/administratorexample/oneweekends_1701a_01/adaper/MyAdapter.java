package com.liu.administratorexample.oneweekends_1701a_01.adaper;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.liu.administratorexample.oneweekends_1701a_01.Bean.Bean;
import com.liu.administratorexample.oneweekends_1701a_01.R;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolders> {
    private Context context;
    List<Bean.CardBean> list = new ArrayList();
    private int mCurrentItemId = 0;

    public MyAdapter(Context context, List<Bean.CardBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public ViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {

        ViewHolders holders;



        View view = View.inflate(context, R.layout.item1, null);
        holders = new ViewHolders(view);
        return holders;

    }

    @Override
    public void onBindViewHolder(ViewHolders holder, int position) {
        holder.title.setText(list.get(position).getName());
       holder.name1.setText(list.get(position).getValue().get(0));


    }

    @Override
    public int getItemCount() {
        return list.size();


    }

    public class ViewHolders extends RecyclerView.ViewHolder {
        TextView title;
        TextView name1;

        public ViewHolders(View itemView) {
            super(itemView);
            title= (TextView) itemView.findViewById(R.id.title);
            name1= (TextView) itemView.findViewById(R.id.name1);

        }
    }


}
