package com.example.homework3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;


public class CarBrandsFragment extends Fragment {
    Button bnt_next;
    private RecyclerView recyclerView;
    private ArrayList<String> brandsList = new ArrayList<>();
    private BrandsAdapter adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_car_brands, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        brandsList.add("Mercedes Benz");
        brandsList.add("BMW");
        brandsList.add("Rolls-Royce");
        brandsList.add("Aston Martin");
        brandsList.add("VAZ 2106");
        brandsList.add("Land Rover");
        brandsList.add("Toyota");
        adapter= new BrandsAdapter(brandsList);
        recyclerView = view.findViewById(R.id.car_brands);
        recyclerView.setAdapter(adapter);
        bnt_next=view.findViewById(R.id.btn_next);
        bnt_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SportsFragment sportsFragment = new SportsFragment();
                requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container1,sportsFragment).addToBackStack(null).commit();
            }
        });
    }

}