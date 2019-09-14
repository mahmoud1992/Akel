package com.example.akel.utils;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import com.example.akel.db.RestaurantDatabase;
import com.example.akel.model.Restaurant_;

import java.util.List;

public class RestaurantsViewModel extends AndroidViewModel {

    private LiveData<List<Restaurant_>> restaurants;

    public RestaurantsViewModel(@NonNull Application application) {
        super(application);
        RestaurantDatabase restaurantDatabase = RestaurantDatabase.getInstance(getApplication());
        restaurants = restaurantDatabase.restaurantDao().loadFavoriteRestaurants();
    }

    public LiveData<List<Restaurant_>> getRestaurants() {
        return restaurants;
    }
}
