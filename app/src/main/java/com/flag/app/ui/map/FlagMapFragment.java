package com.flag.app.ui.map;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.flag.app.R;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.maps.MapboxMap;

public class FlagMapFragment extends Fragment {

    private MapView mapView;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_flag_map, container, false);

        Mapbox.getInstance(Mapbox.getApplicationContext(), getString(R.string.mapbox_access_token));

        Log.d("here", "here");



        //mapView = (MapView) view.findViewById(R.id.mapView);
        //mapView.onCreate(savedInstanceState);
        /*
        mapView.getMapAsync(new
        });
         */
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}