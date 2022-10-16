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


public class SportsFragment extends Fragment {
    Button buttonNext;
    private RecyclerView recyclerViewNext;
    private ArrayList<String> sportsList = new ArrayList<>();
    private SportsAdapter sportsAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sports, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        sportsList.add("Wrestling");
        sportsList.add("Judo");
        sportsList.add("Football");
        sportsList.add("Волейбол");
        sportsList.add("Баскетбол");
        sportsList.add("Шахматы");
        sportsList.add("Бокс");
        sportsList.add("UFC");
        sportsList.add("Легкая Атлетика");
        sportsAdapter = new SportsAdapter(sportsList);
        recyclerViewNext=view.findViewById(R.id.recycler_sports);
        recyclerViewNext.setAdapter(sportsAdapter);
        buttonNext = view.findViewById(R.id.next2);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ColorFragment colorFragment = new ColorFragment();
                requireActivity().getSupportFragmentManager().beginTransaction().replace
                        (R.id.container1,colorFragment).addToBackStack(null).commit();

            }
        });
    }
}