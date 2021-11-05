package com.group7.astrobuff;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class NewsDataModel {
//    Your API key is: 022fe3fd32334e498ec0bafaa47487e
//    Consume from here: https://newsapi.org/s/us-science-news-api
    private String name;
    private String author;
    private  String title;
    private String description;
    private String url;
    private String urlToImage;
    private String published_time;

    public NewsDataModel(String name, String author, String title, String description, String url, String urlToImage, String published_time) {
        this.name = name;
        this.author = author;
        this.title = title;
        this.description = description;
        this.url = url;
        this.urlToImage  = urlToImage;
        this.published_time = published_time;
    }

    public  NewsDataModel(){}

    //Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPublished_time() {
        return published_time;
    }

    public void setPublished_time(String published_time) {
        this.published_time = published_time;
    }
}