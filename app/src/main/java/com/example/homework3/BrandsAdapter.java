package com.example.homework3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BrandsAdapter extends RecyclerView.Adapter <BrandsViewHolder> {
    private ArrayList<String> brandsList;
    public BrandsAdapter (ArrayList<String>brandsList){this.brandsList=brandsList;}
    @NonNull
    @Override
    public BrandsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BrandsViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_brands,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull BrandsViewHolder holder, int position) {
        holder.bind(brandsList.get(position));

    }

    @Override
    public int getItemCount() {
        return brandsList.size();
    }
}
