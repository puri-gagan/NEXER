package com.example.myapplication;

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

import com.example.e_prashasan.ForAllActivity;

import java.util.List;

public class PBC extends RecyclerView.Adapter<PBC.MyCardHolder> {


    //this context we will use to inflate the layout
    private Context mCtx;

    //we are storing all the products in a list
    private List<PBCCARD> MeatList;

    public PBC(Context mCtx, List<PBCCARD> MeatList) {
        this.mCtx = mCtx;
        this.MeatList = MeatList;
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
        holder.Image2.setImageDrawable(mCtx.getResources().getDrawable(MeatList.get(position).getThumbnail()));
        holder.Title.setText(MeatList.get(position).getTitle());
        holder.Image.setImageDrawable(mCtx.getResources().getDrawable(MeatList.get(position).getThumbnail()));
        holder.relativeLayoutmeat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mCtx, ForAllActivity.class);
                intent.putExtra("image2",MeatList.get(position).getImage());
                intent.putExtra("image", MeatList.get(position).getThumbnail());
                intent.putExtra("title",MeatList.get(position).getTitle());
                intent.putExtra("prices",MeatList.get(position).getPrice());
                mCtx.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return MeatList.size();
    }



    public static class MyCardHolder extends  RecyclerView.ViewHolder {
        TextView Title,Price;
        ImageView Image, Image2;
        RelativeLayout relativeLayoutmeat;
        public MyCardHolder(@NonNull View itemView) {
            super(itemView);
            Image2=(ImageView) itemView.findViewById(R.id.secondimg);
            Title = (TextView) itemView.findViewById(R.id.nrmMeat);
            Image = (ImageView)itemView.findViewById(R.id.nrmlckn);
            relativeLayoutmeat=(RelativeLayout)itemView.findViewById(R.id.relativeMeat);
        }
    }


}
