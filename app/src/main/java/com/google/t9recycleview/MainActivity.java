package com.google.t9recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcvcategory;
    private recycleViewFoodAdapter mcategoryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvcategory = findViewById(R.id.rcv_category);
        mcategoryAdapter= new recycleViewFoodAdapter(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        rcvcategory.setLayoutManager(linearLayoutManager);
        mcategoryAdapter.setData(getListCategory());
        rcvcategory.setAdapter(mcategoryAdapter);
    }

    private List<recycleViewFood> getListCategory() {
        List<recycleViewFood>list = new ArrayList<>();

        List<FOOD> foodList = new ArrayList<>();
        foodList.add(new FOOD(R.drawable.food,"Món 1"));
        foodList.add(new FOOD(R.drawable.banhkep,"Món 2"));
        foodList.add(new FOOD(R.drawable.banhmique,"Món 3"));
        foodList.add(new FOOD(R.drawable.bundaumamtom,"Món 4"));
        foodList.add(new FOOD(R.drawable.banhkep,"Món 5"));
        foodList.add(new FOOD(R.drawable.bundaumamtom,"Món 6"));
        foodList.add(new FOOD(R.drawable.banhmique,"Món 7"));
        foodList.add(new FOOD(R.drawable.banhkep,"Món 8"));
        foodList.add(new FOOD(R.drawable.banhkep,"Món 9"));

        list.add(new recycleViewFood("Recycleview Món Ăn 1",foodList));
        list.add(new recycleViewFood("Recycleview Món Ăn 2",foodList));
        list.add(new recycleViewFood("Recycleview Món Ăn 3",foodList));

        return list;
    }
}