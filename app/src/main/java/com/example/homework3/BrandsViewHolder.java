package com.example.homework3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BrandsViewHolder extends RecyclerView.ViewHolder {
    private TextView tv_brands;
    public BrandsViewHolder(@NonNull View itemView) {
        super(itemView);
        tv_brands = itemView.findViewById(R.id.brand_item);

    }
    public void bind (String brands){
        tv_brands.setText(brands);

    }
}
