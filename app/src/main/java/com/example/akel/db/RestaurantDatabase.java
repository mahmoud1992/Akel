package com.example.akel.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.example.akel.model.Restaurant_;


@Database(entities = {Restaurant_.class}, version = 1, exportSchema = false)
public abstract class RestaurantDatabase extends RoomDatabase {

    private static RestaurantDatabase restaurantDatabaseInstance;
    private static final Object LOCK = new Object();
    private static final String DATABASE_NAME = "restaurantdb";

    public static RestaurantDatabase getInstance(Context context) {
        if(restaurantDatabaseInstance==null) {
            synchronized (LOCK) {
                restaurantDatabaseInstance = Room.databaseBuilder(context.getApplicationContext(),RestaurantDatabase.class, RestaurantDatabase.DATABASE_NAME).build();
            }
        }
        return restaurantDatabaseInstance;
    }

    public abstract RestaurantDao restaurantDao();
}
