package com.group7.astrobuff;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SpaceNewsUpdates extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_space_news_updates);

        //set page title
        getSupportActionBar().setTitle("Space News/Updates");

        //Article 1
        Button article_a = (Button) findViewById(R.id.link_a);
        article_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url_a = "https://cosmoquest.org/x/dailyspace/2021/10/27/searching-for-planets-new-mission-goes-rogue-possible-extragalactic-planet-found/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url_a));
                startActivity(i);
            }
        });

        //Article 2
        Button article_b = (Button) findViewById(R.id.link_b);
        article_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url_b = "https://cosmoquest.org/x/dailyspace/2021/10/22/early-universe-star-formation-came-in-bursts/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url_b));
                startActivity(i);
            }
        });

        //Article 3
        Button article_c = (Button) findViewById(R.id.link_c);
        article_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url_c = "https://cosmoquest.org/x/dailyspace/2021/10/21/rocket-roundup-for-october-20-2021/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url_c));
                startActivity(i);
            }
        });

        //Article 4
        Button article_d = (Button) findViewById(R.id.link_d);
        article_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url_d= "https://cosmoquest.org/x/dailyspace/2021/10/20/news-roundup-a-post-hiatus-look-at-stories-we-missed/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url_d));
                startActivity(i);
            }
        });

        //Article 5
        Button article_e = (Button) findViewById(R.id.link_e);
        article_e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url_e = "https://cosmoquest.org/x/dailyspace/2021/10/12/perseverance-images-confirm-jezero-crater-as-ancient-lake/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url_e));
                startActivity(i);
            }
        });

        //Article more
        Button article_more = (Button) findViewById(R.id.link_more);
        article_more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url_more = "https://cosmoquest.org/x/dailyspace/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url_more));
                startActivity(i);
            }
        });
    }


}