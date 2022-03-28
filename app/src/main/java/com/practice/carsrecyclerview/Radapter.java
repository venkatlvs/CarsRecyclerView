package com.practice.carsrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Radapter extends RecyclerView.Adapter<Radapter.RviewHolder> {
    Context context;
    int[] images;
    String[] data2, data1;
    public Radapter(Context ct, String[] s1, String[] s2, int[] img) {
        context=ct;
        data1=s1;
        data2=s2;
        images=img;
    }

    @NonNull
    @Override
    public RviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
     View vw=   inflater.inflate(R.layout.rrow,parent,false);

        return new RviewHolder(vw);
    }

    @Override
    public void onBindViewHolder(@NonNull RviewHolder holder, int position) {
        holder.t1.setText(data1[position]);
        holder.t2.setText(data2[position]);
        holder.i1.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class RviewHolder extends RecyclerView.ViewHolder{
        TextView t1,t2;
        ImageView i1;
        public RviewHolder(@NonNull View itemView) {
            super(itemView);
            t1=itemView.findViewById(R.id.textView3);
            t2=itemView.findViewById(R.id.textView4);
            i1=itemView.findViewById(R.id.imageView2);
        }
    }
}
