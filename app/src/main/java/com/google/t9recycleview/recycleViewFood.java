package com.google.t9recycleview;

import java.util.List;


public class recycleViewFood {

    private String nameCategory;
    private List<FOOD> foods;

    public recycleViewFood(String nameCategory, List<FOOD> foods) {
        this.nameCategory = nameCategory;
        this.foods = foods;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public List<FOOD> getFoods() {
        return foods;
    }

    public void setFoods(List<FOOD> foods) {
        this.foods = foods;
    }
}
