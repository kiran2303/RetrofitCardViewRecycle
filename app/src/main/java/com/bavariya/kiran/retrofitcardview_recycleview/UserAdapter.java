package com.bavariya.kiran.retrofitcardview_recycleview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


public class UserAdapter extends RecyclerView.Adapter<UserAdapter.MyViewHolder> {

    private List<User.ItemsEntity> itemsEntities;


    public UserAdapter(List<User.ItemsEntity> itemsEntities) {
        this.itemsEntities = itemsEntities;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.each_row_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        final MyViewHolder holder1 = holder;

        holder1.title.setText(itemsEntities.get(position).getGists_url());
        holder1.year.setText(itemsEntities.get(position).getLogin());
    }

    @Override
    public int getItemCount() {
        return itemsEntities.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, year;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            year = (TextView) view.findViewById(R.id.count);
        }
    }

}
