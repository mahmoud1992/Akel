package com.example.akel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.akel.fragment.RestaurantDetailFragment;
import com.example.akel.model.Location;
import com.example.akel.model.Restaurant_;
import com.example.akel.model.UserRating;

import butterknife.ButterKnife;

public class DetailActivity extends AppCompatActivity {

    private Restaurant_ restaurant;
    private UserRating userRating;
    private Location location;
    private boolean isTablet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ButterKnife.bind(this);

        isTablet = this.getResources().getBoolean(R.bool.isTablet);
        if(isTablet) {
            finish();
        }
        setFragment();
    }

    private void setFragment() {
        RestaurantDetailFragment fragment = new RestaurantDetailFragment();
        if(getIntent()!=null)
            fragment.setArguments(getIntent().getExtras());
        getSupportFragmentManager().beginTransaction().replace(R.id.restaurantDetailContainer, fragment).commit();
    }
}
