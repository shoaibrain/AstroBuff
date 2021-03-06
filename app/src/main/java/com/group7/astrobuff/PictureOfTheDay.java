package com.group7.astrobuff;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.squareup.picasso.Picasso;

import org.json.JSONException;
import org.json.JSONObject;

public class PictureOfTheDay extends AppCompatActivity {
    //create PictureOfTheDay object
    PictureOfTheDayModel pic = new PictureOfTheDayModel();

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture_of_the_day);
        //set page title
        getSupportActionBar().setTitle("Picture of the Day");

        //load the data
        String URL = "https://api.nasa.gov/planetary/apod?api_key=Z6MmKdvGYkuc84Ecrwyw3IVHERWISk6z7gYasW16";
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
                (Request.Method.GET, URL, null, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            //Use setters to update attributes
                            pic.setCopyright(response.getString("copyright"));
                            pic.setDate(response.getString("date"));
                            pic.setExplanation(response.getString("explanation"));
                            pic.setHdurl(response.getString("hdurl"));
                            pic.setMedia_type(response.getString("media_type"));
                            pic.setTitle(response.getString("title"));
                            pic.setUrl(response.getString("url"));

                            //Update UI here
                            //Toast.makeText(PictureOfTheDay.this, "image url:"+pic.getUrl() + "\nDescription:"+pic.getExplanation(), Toast.LENGTH_LONG).show();
                            imageView = findViewById(R.id.imageview);
                            Picasso.get().load(pic.getUrl()).fit().into(imageView);
                            TextView pictText = (TextView)findViewById(R.id.pict);
                            pictText.setText(pic.getExplanation());

                        } catch (JSONException e) {
                            e.printStackTrace();
                            Toast.makeText(PictureOfTheDay.this, "Error on GET", Toast.LENGTH_LONG).show();
                        }
                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // TODO: Handle error
                        System.out.println("error");
                        Toast.makeText(PictureOfTheDay.this, "Error on Get", Toast.LENGTH_SHORT).show();

                    }
                });

        // Access the RequestQueue through singleton class
        MySingleton.getInstance(this).addToRequestQueue(jsonObjectRequest);
    }
}