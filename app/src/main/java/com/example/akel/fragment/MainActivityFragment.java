package com.example.akel.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.akel.R;
import com.example.akel.adapters.RestaurantAdapter;
import com.example.akel.model.Restaurant;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainActivityFragment extends Fragment {

    @BindView(R.id.recyclerView)
    RecyclerView restaurantsList;

    RestaurantAdapter restaurantAdapter;

    public MainActivityFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        restaurantAdapter = new RestaurantAdapter(this.getContext());
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main_activity, container, false);
        ButterKnife.bind(this, view);
        restaurantsList.setLayoutManager(new LinearLayoutManager(getActivity()));
        restaurantsList.setHasFixedSize(true);
        restaurantsList.setAdapter(restaurantAdapter);
        return view;
    }

    public void setRestaurantArrayList(ArrayList<Restaurant> restaurantArrayList) {
        restaurantAdapter.setRestaurantList(restaurantArrayList);
    }

}
