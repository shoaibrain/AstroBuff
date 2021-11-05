package com.group7.astrobuff;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set page title
        getSupportActionBar().setTitle("Home");
    }

    //activate Setting button
    public void openSetting(View view) {
        startActivity(new Intent(this, Setting.class));
        System.out.println("settings Button clicked!!!!");
    }

    //activate Space News/Updates button
    public void openSpaceNewsUpdates(View view) {
        startActivity(new Intent(this, SpaceNewsUpdates.class));
        System.out.println("News Button clicked!!!!");
    }

    //activate Picture of the Day button
    public void openPictureOfTheDay(View view) {
        startActivity(new Intent(this, PictureOfTheDay.class));
        System.out.println("Pic ofthe day!!!!");
    }

    //activate ISS Location Tracking button
    public void openISSLocationTracking(View view) {
        startActivity(new Intent(this, ISS_Location.class));
    }
}