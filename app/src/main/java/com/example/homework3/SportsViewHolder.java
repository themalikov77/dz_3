package com.example.homework3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SportsViewHolder extends RecyclerView.ViewHolder {
    private TextView tv_sports;
    public SportsViewHolder(@NonNull View itemView) {
        super(itemView);
        tv_sports=itemView.findViewById(R.id.item_sports);

    }
    public void bind(String sports){
        tv_sports.setText(sports);

    }

}
