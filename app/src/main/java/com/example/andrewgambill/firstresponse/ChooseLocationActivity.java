package com.example.andrewgambill.firstresponse;

import android.content.Intent;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class ChooseLocationActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ArrayList<LatLng>points;
    private Button doneButton;
    private Button usePhoneLocationButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_location);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        points = new ArrayList<>();
        doneButton = (Button)findViewById(R.id.doneButton);
        usePhoneLocationButton = (Button)findViewById(R.id.usePhoneLocationButton);



        doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LatLng chosenLocation = points.get(0);
                Intent intent = new Intent(ChooseLocationActivity.this,CheckInActivity.class);
                intent.putExtra("lat",chosenLocation.latitude);
                intent.putExtra("long",chosenLocation.longitude);
                startActivity(intent);
            }
        });

        usePhoneLocationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }
        });
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        mMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() {
            @Override
            public void onMapClick(LatLng latLng) {
                if(points.isEmpty()){
                    MarkerOptions marker = new MarkerOptions().position(
                            new LatLng(latLng.latitude, latLng.longitude)).title("Location");
                    mMap.addMarker(marker);
                    points.add(latLng);
                }
                else{
                    points.remove(0);
                    mMap.clear();
                    MarkerOptions marker = new MarkerOptions().position(
                            new LatLng(latLng.latitude, latLng.longitude)).title("Location");
                    mMap.addMarker(marker);
                    points.add(latLng);

                }


            }
        });

    }


}
