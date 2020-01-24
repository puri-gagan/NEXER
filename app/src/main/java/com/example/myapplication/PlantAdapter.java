package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

public class PlantAdapter extends RecyclerView.Adapter<PlantAdapter.MyCardHolder> {


    //this context we will use to inflate the layout
    private Context mCtx;

    //we are storing all the products in a list
    private List<Plant> PlantList;

    public PlantAdapter(Context mCtx, List<Plant> PlantList) {
        this.mCtx = mCtx;
        this.PlantList = PlantList;
    }

    @NonNull
    @Override
    public MyCardHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.card, null);
        return new MyCardHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyCardHolder holder, final int position) {
       holder.Image1.setImageDrawable(mCtx.getResources().getDrawable(PlantList.get(position).getImage2()));
        holder.Image.setImageDrawable(mCtx.getResources().getDrawable(PlantList.get(position).getImage()));
        holder.Txt1.setText(PlantList.get(position).getTxt1());
        holder.Txt2.setText(PlantList.get(position).getTxt2());
        holder.Txt3.setText(PlantList.get(position).getTxt3());

       holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mCtx, ForAllActivity.class);
                intent.putExtra("image2",PlantList.get(position).getImage());
                intent.putExtra("image", PlantList.get(position).getImage2());
                intent.putExtra("title",PlantList.get(position).getTxt1());
                intent.putExtra("title1",PlantList.get(position).getTxt2());
                intent.putExtra("title2",PlantList.get(position).getTxt3());

                mCtx.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return PlantList.size();
    }



    public static class MyCardHolder extends  RecyclerView.ViewHolder {
        TextView Txt1,Txt2,Txt3;
        ImageView Image, Image1;
        RelativeLayout relativeLayout;
        public MyCardHolder(@NonNull View itemView) {
            super(itemView);
            Txt1=(TextView)itemView.findViewById(R.id.celeName);
            Txt2=(TextView)itemView.findViewById(R.id.Selfie);
            Txt3=(TextView)itemView.findViewById(R.id.description);
            Image1=(ImageView) itemView.findViewById(R.id.imagelogo);
            Image = (ImageView)itemView.findViewById(R.id.CelImage);
            relativeLayout=(RelativeLayout)itemView.findViewById(R.id.relative);
        }
    }


}
