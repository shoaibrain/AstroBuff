package com.group7.astrobuff;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class SpaceNewsUpdates extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_space_news_updates);

        //set page title
        getSupportActionBar().setTitle("Space News/Updates");

        //sample data fetched from api
        //leave this for now
        JSONObject obj = new JSONObject();

        // create NewsDataModel object and store in a list
        //news1
        NewsDataModel news1 = new NewsDataModel();
        news1.setName("Space.com");
        news1.setAuthor("Tariq Malik");
        news1.setTitle("SpaceX shows off epic photo of Starship SN20 engine test - Space.com");
        news1.setDescription("Starship SN20 will be SpaceX's first to reach orbit.");
        news1.setUrl("https://www.space.com/spacex-starship-sn20-engine-test-epic-photo");
        news1.setUrlToImage("https://cdn.mos.cms.futurecdn.net/vucCw93dY9xmpiuoVfjwLT-1200-80.jpg");
        news1.setPublished_time("2021-11-14T13:39:54Z");

        //news2
        NewsDataModel news2 = new NewsDataModel();
        news2.setName("ScienceAlert");
        news2.setAuthor("David Nield");
        news2.setTitle("Dark Matter Birthed More of Itself From Regular Matter, Claims Wild New Paper - ScienceAlert");
        news2.setDescription("There's a lot we still don't know about dark matter – that mysterious, invisible mass that could make up as much as 85 percent of everything around us – but a new paper outlines a rather unusual hypothesis about the very creation of the stuff");
        news2.setUrl("https://www.sciencealert.com/weird-new-theory-suggests-dark-matter-creates-more-of-itself-from-regular-matter");
        news2.setUrlToImage("https://www.sciencealert.com/images/2021-11/processed/BrightOrangeDotsOnPurpleBackground_1024.jpg");
        news2.setPublished_time("2021-11-14T06:01:20Z");
        //news3
        NewsDataModel news3 = new NewsDataModel();
        news3.setName("ScienceAlert");
        news3.setAuthor("David Nield");
        news3.setTitle("Scientists Finally Understand What Some Mysterious 'Hotspots' on Brain Cells Do - ScienceAlert");
        news3.setDescription("85 percent of everything around us – but a new paper outlines a rather unusual hypothesis about the very creation of the stuff");
        news3.setUrl("https://www.sciencealert.com/weird-new-theory-suggests-dark-matter-creates-more-of-itself-from-regular-matter");
        news3.setUrlToImage("https://www.sciencealert.com/images/2021-11/processed/BrightOrangeDotsOnPurpleBackground_1024.jpg");
        news3.setPublished_time("2021-11-14T06:01:20Z");
        //news4
        NewsDataModel news4 = new NewsDataModel();
        news4.setName("ScienceAlert");
        news4.setAuthor("David Nield");
        news4.setTitle("Scientists Finally Understand What Some Mysterious 'Hotspots' on Brain Cells Do - ScienceAlert");
        news4.setDescription("85 percent of everything around us – but a new paper outlines a rather unusual hypothesis about the very creation of the stuff");
        news4.setUrl("https://www.sciencealert.com/weird-new-theory-suggests-dark-matter-creates-more-of-itself-from-regular-matter");
        news4.setUrlToImage("https://www.sciencealert.com/images/2021-11/processed/BrightOrangeDotsOnPurpleBackground_1024.jpg");
        news4.setPublished_time("2021-11-14T06:01:20Z");
        //news5
        NewsDataModel news5 = new NewsDataModel();
        news5.setName("ScienceAlert");
        news5.setAuthor("David Nield");
        news5.setTitle("Scientists Finally Understand What Some Mysterious 'Hotspots' on Brain Cells Do - ScienceAlert");
        news5.setDescription("85 percent of everything around us – but a new paper outlines a rather unusual hypothesis about the very creation of the stuff");
        news5.setUrl("https://www.sciencealert.com/weird-new-theory-suggests-dark-matter-creates-more-of-itself-from-regular-matter");
        news5.setUrlToImage("https://www.sciencealert.com/images/2021-11/processed/BrightOrangeDotsOnPurpleBackground_1024.jpg");
        news5.setPublished_time("2021-11-14T06:01:20Z");

        //store these objects in a list
        ArrayList<NewsDataModel> Allnews = new ArrayList<NewsDataModel>();
        Allnews.add(news1);
        Allnews.add(news2);
        Allnews.add(news3);
        Allnews.add(news4);
        Allnews.add(news5);

        //print some news for confirmation;
        //upon clicking news button, all these values should be printed on console; later
        //we will use all these values to show in UI
        for (int i = 0; i < 5; i++){
            System.out.println(Allnews.get(i).getName());
            System.out.println(Allnews.get(i).getAuthor());
            System.out.println(Allnews.get(i).getTitle());
            System.out.println(Allnews.get(i).getDescription());
            System.out.println(Allnews.get(i).getUrl());
            System.out.println(Allnews.get(i).getUrlToImage());
            System.out.println(Allnews.get(i).getPublished_time());
        }


        //use object model to update the UI with object.getter method

    }
}