package com.group7.astrobuff;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ISSLocationTracking extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isslocattion_tracking);

        //set page title
        getSupportActionBar().setTitle("ISS Location Tracking");
    }
}