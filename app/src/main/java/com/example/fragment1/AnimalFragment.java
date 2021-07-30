package com.example.fragment1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class AnimalFragment extends Fragment {

    private RecyclerView recyclerView;
    private ArrayList<Animal> animallist=new ArrayList<>();

    @Override
    public void onCreate(@Nullable  Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
    }

    private void buildlist() {
        for (int i=0;i<100;i++){
            Animal animal=new Animal("Chetak",R.drawable.horse);
            animallist.add(animal);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_animal, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
        buildlist();
        setRecyclerview();
    }

    private void setRecyclerview() {
        AnimalAdapter animalAdapter=new AnimalAdapter(animallist);
        GridLayoutManager linearLayoutManager=new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(animalAdapter);
    }

    private void initView(View view) {
        recyclerView=view.findViewById(R.id.recycler);
    }
}