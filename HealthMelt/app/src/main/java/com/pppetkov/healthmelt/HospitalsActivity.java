package com.pppetkov.healthmelt;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;


public class HospitalsActivity extends AppCompatActivity {

    WebView hospitalMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospitals);

        hospitalMap = findViewById(R.id.hospitalMap);
        hospitalMap.loadUrl("https://www.google.com/maps/search/%D0%B1%D0%BE%D0%BB%D0%BD%D0%B8%D1%86%D0%B0/@42.6707883,23.2884611,13.87z?entry=ttu");
    }
}