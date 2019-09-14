package com.example.akel.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CuisineSearch {
    @SerializedName("cuisines")
    @Expose
    private List<Cuisine> cuisines = null;

    public List<Cuisine> getCuisines() {
        return cuisines;
    }

    public void setCuisines(List<Cuisine> cuisines) {
        this.cuisines = cuisines;
    }
}
