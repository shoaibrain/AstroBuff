package com.group7.astrobuff;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class PictureOfTheDay extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture_of_the_day);

        //set page title
        getSupportActionBar().setTitle("Picture of the Day");

        imageView = findViewById(R.id.imageview);

        String url = "https://apod.nasa.gov/apod/image/2110/OrionStreams_Saukkonen_2048.jpg";

        Picasso.get().load(url).fit().into(imageView);

    }
}