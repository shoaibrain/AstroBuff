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

        //create IssModel object
        IssModel ISS = new IssModel();
        //Update IssModel object's attributes with setters
        //We'll dynamically change these attributes once we fetch live data from the API
        ISS.setLatitude("123456");
        ISS.setLongitude("6789965");
        ISS.setTimestamp(1636917881); //this is epoch time; can be changed later
        ISS.setMessage("Message");

        //Print Model attribute values for confirmation
        System.out.println(ISS.getLatitude());
        System.out.println(ISS.getLongitude());
        System.out.println(ISS.getTimestamp());
        System.out.println(ISS.getMessage());

        // We'll show these data values on Google Map later

    }
}