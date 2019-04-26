package com.example.engahmed.json_parsing;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Collections;
import java.util.List;

public class AdapterFish extends RecyclerView.Adapter<MyHolder> {
    Context context;
    private LayoutInflater layoutInflater;
    List<DataFish> data= Collections.emptyList();
    DataFish current;
    int currentPos=0;

    public AdapterFish(Context context,List<DataFish> data){

        this.context=context;
        this.data=data;
        layoutInflater=LayoutInflater.from(context);


    }


    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewtype) {
        View view=layoutInflater.inflate(R.layout.rowlayout,viewGroup,false);
        MyHolder myHolder=new MyHolder(view);
        return myHolder;

        }


    public void onBindViewHolder(@NonNull MyHolder viewHolder, int possion) {

        MyHolder myHolder=(MyHolder) viewHolder;
        DataFish cuurent=data.get(possion);
        myHolder.textFishName.setText(cuurent.fishName);
        myHolder.textSize.setText("size :"+cuurent.sizeName);
        myHolder.textType.setText("Category :"+cuurent.catName);
        myHolder.textPrice.setText("Rs. " + cuurent.price + "\\Kg");
        myHolder.textPrice.setTextColor(ContextCompat.getColor(context, R.color.colorAccent));


    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
