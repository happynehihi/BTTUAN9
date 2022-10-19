package com.google.t9recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class foodAdapter extends RecyclerView.Adapter<foodAdapter.foodViewHolder>{
    private List<FOOD> mfood;

    public void setData(List<FOOD> list) {
        this.mfood = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public foodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_food,parent,false);
        return new foodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull foodViewHolder holder, int position) {
        FOOD food = mfood.get(position) ;
        if (food == null){
            return;
        }
        holder.img_food.setImageResource(food.getResourceId());
        holder.txt_title.setText(food.getTitle());
    }

    @Override
    public int getItemCount() {
        if(mfood != null){
            return mfood.size();
        }else{
            return 0;
        }

    }

    public class foodViewHolder extends RecyclerView.ViewHolder{
        private ImageView img_food;
        private TextView txt_title;
        public foodViewHolder(@NonNull View itemView) {
            super(itemView);

            img_food = itemView.findViewById(R.id.img_food);
            txt_title = itemView.findViewById(R.id.txt_title);
        }
    }
}
