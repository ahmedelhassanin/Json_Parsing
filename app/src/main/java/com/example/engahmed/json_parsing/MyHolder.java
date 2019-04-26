package com.example.engahmed.json_parsing;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class MyHolder extends RecyclerView.ViewHolder {

    TextView textFishName;
    TextView textSize;
    TextView textType;
    TextView textPrice;

    public MyHolder(@NonNull View itemView) {
        super(itemView);

        textFishName=(TextView) itemView.findViewById(R.id.textFishName);
        textSize=(TextView) itemView.findViewById(R.id.textSize);
        textType=(TextView) itemView.findViewById(R.id.textType);
        textPrice=(TextView)  itemView.findViewById(R.id.textPrice);

    }
}
