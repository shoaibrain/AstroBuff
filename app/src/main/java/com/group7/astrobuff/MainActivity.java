package com.group7.astrobuff;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class MainActivity extends AppCompatActivity {
//    Button space_news,pic_of_the_day,iss_loc
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
        //Create news class
        // final NewsDataService News = new NewsDataService(MainActivity.this);

        //At this point, News object should have all the attributes filled
        //Work on UI

    }

    //activate Picture of the Day button
    public void openPictureOfTheDay(View view) {
        startActivity(new Intent(this, PictureOfTheDay.class));
<<<<<<< HEAD
        System.out.println("Pic of the day!!!!");
=======
        //final PictureOfTheDayService POD = new PictureOfTheDayService();
        //At this point, PIC_OF_THE_DAY object should have all the attributes filled
        //Work on UI


    //Toast.makeText(MainActivity.this, "you clicked Picture", Toast.LENGTH_SHORT).show();
>>>>>>> 3f87355b4efa7e221e79d7be3ef7e97723fd088e
    }

    //activate ISS Location Tracking button
    public void openISSLocationTracking(View view) {
<<<<<<< HEAD
        startActivity(new Intent(this, ISSLocationTracking.class));

        //final IssService ISS = new IssService();
        //At this point, ISS object should have all the attributes filled
        //Work on UI
        Toast.makeText(MainActivity.this, "you clicked ISS", Toast.LENGTH_SHORT).show();
=======
        startActivity(new Intent(this, ISS_Location.class));
>>>>>>> b89e84ef1ff88957af52fb46065cd2ef9f19dca2
    }
}