package com.example.akel.utils;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.example.akel.db.RestaurantDatabase;
import com.example.akel.model.Restaurant_;

public class RestaurantViewModel extends ViewModel {

    private LiveData<Restaurant_> restaurantLiveData;

    public LiveData<Restaurant_> getRestaurantLiveData() {
        return restaurantLiveData;
    }

    public RestaurantViewModel(RestaurantDatabase restaurantDatabase, String id) {
        restaurantLiveData = restaurantDatabase.restaurantDao().loadSingleRestaurant(id);
    }
}
