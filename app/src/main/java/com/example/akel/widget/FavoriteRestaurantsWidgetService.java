package com.example.akel.widget;

import android.content.Intent;
import android.widget.RemoteViewsService;

public class FavoriteRestaurantsWidgetService extends RemoteViewsService {

    @Override
    public RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new FavoriteRestaurantsRemoteViewFactory(this.getApplicationContext(), intent);
    }
}
