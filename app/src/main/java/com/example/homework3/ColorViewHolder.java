package com.example.homework3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ColorViewHolder extends RecyclerView.ViewHolder {
    private TextView tv_color;
    public ColorViewHolder(@NonNull View itemView) {
        super(itemView);

        tv_color=itemView.findViewById(R.id.tv_color);
    }
    public void bind(String color ){
        tv_color.setText(color);

    }
}
