package com.example.homework3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SportsAdapter extends RecyclerView.Adapter <SportsViewHolder> {
    private ArrayList<String> sportsList;
    public SportsAdapter(ArrayList<String>sportsList){this.sportsList=sportsList;}
    @NonNull
    @Override
    public SportsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SportsViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_spors,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull SportsViewHolder holder, int position) {
        holder.bind(sportsList.get(position));

    }

    @Override
    public int getItemCount() {
        return sportsList.size();
    }
}
