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
        holder.Txt01.setText(PlantList.get(position).getTxt01());
        holder.Txt02.setText(PlantList.get(position).getTxt02());
        holder.Txt03.setText(PlantList.get(position).getTxt03());
        holder.Txt04.setText(PlantList.get(position).getTxt04());
        holder.Txt05.setText(PlantList.get(position).getTxt05());
        holder.Txt06.setText(PlantList.get(position).getTxt06());
        holder.Txt07.setText(PlantList.get(position).getTxt07());
        holder.Txt08.setText(PlantList.get(position).getTxt08());
        holder.Txt09.setText(PlantList.get(position).getTxt09());
        holder.Txt10.setText(PlantList.get(position).getTxt10());


       holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mCtx, ForAllActivity.class);
                intent.putExtra("image2",PlantList.get(position).getImage());
                intent.putExtra("image", PlantList.get(position).getImage2());
                intent.putExtra("title",PlantList.get(position).getTxt1());
                intent.putExtra("title1",PlantList.get(position).getTxt2());
                intent.putExtra("title2",PlantList.get(position).getTxt3());
                intent.putExtra("title3",PlantList.get(position).getTxt01());
                intent.putExtra("title4",PlantList.get(position).getTxt02());
                intent.putExtra("title5",PlantList.get(position).getTxt03());
                intent.putExtra("title6",PlantList.get(position).getTxt04());
                intent.putExtra("title7",PlantList.get(position).getTxt05());
                intent.putExtra("title8",PlantList.get(position).getTxt06());
                intent.putExtra("title9",PlantList.get(position).getTxt07());
                intent.putExtra("title10",PlantList.get(position).getTxt08());
                intent.putExtra("title12",PlantList.get(position).getTxt09());
                intent.putExtra("title13",PlantList.get(position).getTxt10());


                mCtx.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return PlantList.size();
    }



    public static class MyCardHolder extends  RecyclerView.ViewHolder {
        TextView Txt1,Txt2,Txt3,Txt01,Txt02,Txt03,Txt04,Txt05,Txt06,Txt07,Txt08,Txt09,Txt10;
        ImageView Image, Image1;
        RelativeLayout relativeLayout;
        public MyCardHolder(@NonNull View itemView) {
            super(itemView);
            Txt1=(TextView)itemView.findViewById(R.id.celeName);
            Txt2=(TextView)itemView.findViewById(R.id.Selfie);
            Txt3=(TextView)itemView.findViewById(R.id.description);
            Txt01=(TextView)itemView.findViewById(R.id.desc1);
            Txt02=(TextView)itemView.findViewById(R.id.desc2);
            Txt03=(TextView)itemView.findViewById(R.id.desc3);
            Txt04=(TextView)itemView.findViewById(R.id.rew1);
            Txt05=(TextView)itemView.findViewById(R.id.rew2);
            Txt06=(TextView)itemView.findViewById(R.id.rew3);
            Txt07=(TextView)itemView.findViewById(R.id.rul1);
            Txt08=(TextView)itemView.findViewById(R.id.rul2);
            Txt09=(TextView)itemView.findViewById(R.id.rul3);
            Txt10=(TextView)itemView.findViewById(R.id.rul4);


            Image1=(ImageView) itemView.findViewById(R.id.imagelogo);
            Image = (ImageView)itemView.findViewById(R.id.CelImage);
            relativeLayout=(RelativeLayout)itemView.findViewById(R.id.relative);
        }
    }


}
