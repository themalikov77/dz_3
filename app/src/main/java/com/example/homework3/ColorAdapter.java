package com.example.homework3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ColorAdapter extends RecyclerView.Adapter<ColorViewHolder> {
    private ArrayList<String> colorList;

    public ColorAdapter(ArrayList<String> colorList) {
        this.colorList = colorList;
    }

    @NonNull
    @Override
    public ColorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ColorViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_color,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ColorViewHolder holder, int position) {
        holder.bind(colorList.get(position));

    }

    @Override
    public int getItemCount() {
        return colorList.size();
    }
}
