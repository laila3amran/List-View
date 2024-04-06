package com.example.listviewproject;

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

public class DishRecyclerViewAdapter extends RecyclerView.Adapter<DishRecyclerViewAdapter.ViewHolder> {
    private final List<Dish> arr ;
    private final LayoutInflater inflater ;
    public Context context ;
    public DishRecyclerViewAdapter(Context context, List<Dish> data){
        this.inflater=LayoutInflater.from(context);
        this.arr=data;
        this.context = context ;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.awnitem_dish,parent,false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Dish d = arr.get(position);
        holder.imgDish.setImageResource(d.image);
        holder.txvNameDish.setText(d.name);
        holder.txvNameItem.setText(d.numItem+" Items");
        holder.rllayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context , Information.class);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return arr.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView imgDish;
        public TextView txvNameDish,txvNameItem;
        public RelativeLayout rllayout ;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgDish= itemView.findViewById(R.id.imgDish);
            txvNameDish = itemView.findViewById(R.id.txvNameDish);
            txvNameItem = itemView.findViewById(R.id.txvNameItem);
            rllayout = itemView.findViewById(R.id.rcview);
        }
       /* public void onBindViewHolder(@NonNull ViewHolder holder,int position){
            Dish d = arr.get(position);
            holder.imgDish.setImageResource(d.image);
            holder.txvNameDish.setText(d.name);
            holder.txvNameItem.setText(d.numItem+" Items");
        }
        public int getItemCount(){
            return arr.size();
        }*/

    }
}
