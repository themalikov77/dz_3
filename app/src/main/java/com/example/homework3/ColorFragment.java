package com.example.homework3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;

public class ColorFragment extends Fragment {
    Button buttonForNext;
    private RecyclerView recyclerViewNext2;
    private ArrayList<String> colorList = new ArrayList<>();
    private ColorAdapter colorAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_color, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        colorList.add("Red");
        colorList.add("Purple");
        colorList.add("Green");
        colorList.add("Blue");
        colorList.add("Orange");
        colorList.add("Black");
        colorList.add("White");
        colorAdapter = new ColorAdapter(colorList);
        recyclerViewNext2= view.findViewById(R.id.recycler_color);
        recyclerViewNext2.setAdapter(colorAdapter);
    }
}