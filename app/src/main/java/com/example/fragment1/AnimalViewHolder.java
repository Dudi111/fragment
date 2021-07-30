package com.example.fragment1;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AnimalViewHolder extends RecyclerView.ViewHolder {
    private TextView tvname;
    private ImageView ivimage;



    public AnimalViewHolder(@NonNull View itemView) {
        super(itemView);
        initview(itemView);
    }

    private void initview(View itemview) {
        tvname=itemview.findViewById(R.id.tvnaam);
        ivimage=itemview.findViewById(R.id.ivanimals);
    }
    public void setdata(Animal animal){
        tvname.setText(animal.getName());
        ivimage.setImageResource(animal.getImage());
    }
}
