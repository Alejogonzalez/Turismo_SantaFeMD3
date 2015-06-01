package com.alejandrogonzalezv.turismo_santafemd3;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class mapa extends Fragment {

    private GoogleMap map;
    private CameraUpdate cameraUpdate;

    private final LatLng LOCATION_SANTAFE = new LatLng(6.551936,-75.822755);


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_mapa, container,
                false);

        map = ((MapFragment)getFragmentManager().findFragmentById(R.id.map)).getMap();

        map.addMarker(new MarkerOptions()
                .position(LOCATION_SANTAFE)
                .title("SANTA FÉ de ANTIOQUIA")
                .snippet("CIUDAD MADRE")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        Button btnlocation = (Button) rootView.findViewById(R.id.btnlocat);
        btnlocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                map.setMapType(GoogleMap.MAP_TYPE_HYBRID);
                cameraUpdate = CameraUpdateFactory.newLatLngZoom(LOCATION_SANTAFE, 16);
                map.animateCamera(cameraUpdate);
            }
        });

        return rootView;
    }


}
