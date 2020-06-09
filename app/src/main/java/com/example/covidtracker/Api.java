package com.example.covidtracker;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;

public class Api {
    private RequestQueue mRequestQueue;
    private StringRequest mStringRequest;
    private static final String TAG = MainActivity.class.getName();
    private  String url="https://hpb.health.gov.lk/api/get-current-statistical";
}
