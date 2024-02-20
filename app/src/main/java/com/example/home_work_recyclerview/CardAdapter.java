package com.example.home_work_recyclerview;

import android.content.Context;
import android.media.Image;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.MyViewHolder> {


    Context context;
    ArrayList<CardModel> models;

    public CardAdapter(Context context, ArrayList<CardModel> models) {
        this.context = context;
        this.models = models;
    }
    @NonNull
    @Override
    public CardAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row_layout, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardAdapter.MyViewHolder holder, int position) {
    holder.Text.setText(models.get(position).text);
    holder.iv.setImageResource(models.get(position).image);
    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView Text;
        ImageView iv;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            Text = itemView.findViewById(R.id.textView2);
            iv = itemView.findViewById(R.id.imageView);
        }
    }
}
