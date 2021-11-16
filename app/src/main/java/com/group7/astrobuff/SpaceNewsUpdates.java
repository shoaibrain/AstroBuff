package com.group7.astrobuff;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONArray;
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
        //load data
        ArrayList<NewsDataModel> NEWS = new ArrayList<NewsDataModel>();
        //five news object
        NewsDataModel news1 = new NewsDataModel();
        NewsDataModel news2 = new NewsDataModel();
        NewsDataModel news3 = new NewsDataModel();
        NewsDataModel news4 = new NewsDataModel();
        NewsDataModel news5 = new NewsDataModel();
        NEWS.add(news1);
        NEWS.add(news2);
        NEWS.add(news3);
        NEWS.add(news4);
        NEWS.add(news5);

        //api
        String URL = "https://newsdata.io/api/1/news?apikey=pub_22544cddd426c9e1e21c47b670b0617983c0&category=science&language=en";
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
                (Request.Method.GET, URL, null, new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            String status = response.getString("status");
                            JSONArray results = response.getJSONArray("results");

                            //get first five news from JsonArray
                            for (int i = 0; i< 5; i++){
                                JSONObject current = results.getJSONObject(i);

                                String name = current.getString("source_id");
                                String title = current.getString("title");
                                String url = current.getString("link");
                                String urlToImage = current.getString("image_url");
                                String description = current.getString("description");
                                String published_time = current.getString("pubDate");

                                //Update news object
                                NEWS.get(i).setTitle(title);
                                NEWS.get(i).setName(name);
                                NEWS.get(i).setDescription(description);
                                NEWS.get(i).setUrl(url);
                                NEWS.get(i).setUrlToImage(urlToImage);
                                NEWS.get(i).setPublished_time(published_time);

                            }

                            //Update UI here
                            Toast.makeText(SpaceNewsUpdates.this, "Status:"+status + "\nURL:"+NEWS.get(0).getUrl()+"\nTitle:"+NEWS.get(0).getTitle(), Toast.LENGTH_LONG).show();


                        } catch (JSONException e) {
                            e.printStackTrace();
                            Toast.makeText(SpaceNewsUpdates.this, "Error on GET", Toast.LENGTH_LONG).show();
                        }
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // TODO: Handle error
                        System.out.println("error");

                    }
                });
        MySingleton.getInstance(this).addToRequestQueue(jsonObjectRequest);
    }
}