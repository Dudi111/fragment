package com.example.fragment1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalViewHolder> {
    private ArrayList<Animal> animallist;

    public AnimalAdapter(ArrayList<Animal> animallist) {
        this.animallist = animallist;
    }

    @NonNull

    @Override
    public AnimalViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.itemlayout,parent,false);

        return new AnimalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  AnimalViewHolder holder, int position) {
        Animal animal=animallist.get(position);
        holder.setdata(animal);

    }

    @Override
    public int getItemCount() {
        return animallist.size();
    }
}
