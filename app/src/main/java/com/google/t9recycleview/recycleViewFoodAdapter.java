package com.google.t9recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class recycleViewFoodAdapter extends RecyclerView.Adapter<recycleViewFoodAdapter.categoryViewHolder>{
    private Context mContext;
    private List<recycleViewFood> mListCategory;

    public recycleViewFoodAdapter(Context mContext){
        this.mContext = mContext;

    }
    public void setData(List<recycleViewFood> list){
        this.mListCategory= list;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public categoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycleviewfood,parent,false);

        return new categoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull categoryViewHolder holder, int position) {
    recycleViewFood category = mListCategory.get(position);
    if(category == null){
        return;
    }
    holder.txt_name_category.setText(category.getNameCategory());

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mContext,RecyclerView.HORIZONTAL,false);
        holder.rcv_food.setLayoutManager(linearLayoutManager);

    foodAdapter foodadapter = new foodAdapter();
    foodadapter.setData(category.getFoods());
    holder.rcv_food.setAdapter(foodadapter);


    }

    @Override
    public int getItemCount() {

        if (mListCategory != null){
            return mListCategory.size();
        }
        return 0;
    }

    public class categoryViewHolder extends RecyclerView.ViewHolder{
        private TextView txt_name_category;
        private RecyclerView rcv_food;

        public categoryViewHolder(@NonNull View itemView) {

            super(itemView);
            txt_name_category = itemView.findViewById(R.id.txt_name_category);
            rcv_food = itemView.findViewById(R.id.rcv_food);
        }
    }
}
