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

    private String copyright;
    private String date;
    private String explanation;
    private String hdurl;
    private String media_type;
    private String title;
    private String url;

    public PictureOfTheDay(String copyright,String date, String explanation, String hdurl, String media_type, String title, String url){
        this.copyright = copyright;
        this.date = date;
        this.explanation = explanation;
        this.hdurl = hdurl;
        this.media_type = media_type;
//        this.title = title;
        this.url = url;
    }
    public  PictureOfTheDay(){}

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public String getHdurl() {
        return hdurl;
    }

    public void setHdurl(String hdurl) {
        this.hdurl = hdurl;
    }

    public String getMedia_type() {
        return media_type;
    }

    public void setMedia_type(String media_type) {
        this.media_type = media_type;
    }
//
//    public String getTitle(){
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}