package com.example.akel.network;

import com.example.akel.model.CuisineSearch;
import com.example.akel.model.RestaurantSearch;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface RestaurantAPIService {
    String apiKey = "012da218721a7f4e1b67fd0698da9ed7";

    @Headers({
            "Accept: application/json",
            "user-key: " + apiKey
    })
    @GET("search")
    Call<RestaurantSearch> getRestaurants(@Query("lat") String lat, @Query("lon") String lon, @Query("radius") String radius, @Query("cuisines") String cuisineIds, @Query("sort") String sortBy, @Query("order") String sortOrder);

    @Headers({
            "Accept: application/json",
            "user-key: " + apiKey
    })
    @GET("cuisines")
    Call<CuisineSearch> getCuisines(@Query("lat") String lat, @Query("lon") String lon);
}
