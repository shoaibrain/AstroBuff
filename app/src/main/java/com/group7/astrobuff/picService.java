package com.group7.astrobuff;

import android.content.Context;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class picService {
public static String PIC_URL = "https://api.nasa.gov/planetary/apod?api_key=Z6MmKdvGYkuc84Ecrwyw3IVHERWISk6z7gYasW16";

Context context;
String description;
public picService(Context context) {this.context=context;}



}
