package com.example.projek;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Masjid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masjid);
        getSupportActionBar().setTitle("Masjid");
    }
}
