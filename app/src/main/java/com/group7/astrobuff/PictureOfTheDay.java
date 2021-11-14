package com.group7.astrobuff;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PictureOfTheDay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture_of_the_day);

        //set page title
        getSupportActionBar().setTitle("Picture of the Day");
        //raw data
         String copyright = "The League of Lost Causes";
         String date = "2021-11-14";
         String explanation = "What is that light in the sky? Perhaps one of humanity's more common questions, an answer may result from a few quick observations. For example -- is it moving or blinking? If so, and if you live near a city, the answer is typically an airplane, since planes are so numerous and so few stars and satellites are bright enough to be seen over the din of artificial city lights. If not, and if you live far from a city, that bright light is likely a planet such as Venus or Mars -- the former of which is constrained to appear near the horizon just before dawn or after dusk. Sometimes the low apparent motion of a distant airplane near the horizon makes it hard to tell from a bright planet, but even this can usually be discerned by the plane's motion over a few minutes. Still unsure? The featured chart gives a sometimes-humorous but mostly-accurate assessment. Dedicated sky enthusiasts will likely note -- and are encouraged to provide -- polite corrections. Chart translations: Spanish, Italian, Polish, Kannada, Latvian, Norwegian, and Turkish";
         String hdurl = "https://apod.nasa.gov/apod/image/2111/astronomy101_hk_750.jpg";
         String media_type = "image";
         String title = "How to Identify that Light in the Sky";
         String url = "https://apod.nasa.gov/apod/image/2111/astronomy101_hk_960.jpg";

         //create PictureOfTheDay object
        PictureOfTheDayModel pic = new PictureOfTheDayModel();
        //Use setters to update attributes
        pic.setCopyright(copyright);
        pic.setDate(date);
        pic.setExplanation(explanation);
        pic.setHdurl(hdurl);
        pic.setMedia_type(media_type);
        pic.setTitle(title);
        pic.setUrl(url);

        //test with getter
        //when picoftheday is clicked, these values should be printed on the console
        System.out.println(pic.getDate());
        System.out.println(pic.getExplanation());
        System.out.println(pic.getHdurl());
        System.out.println(pic.getMedia_type());
        System.out.println(pic.getTitle());
        System.out.println(pic.getUrl());

        //update the UI with these values



    }
}