package com.group7.astrobuff;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SpaceNewsUpdates extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_space_news_updates);

        //set page title
        getSupportActionBar().setTitle("Space News/Updates");
    }
}