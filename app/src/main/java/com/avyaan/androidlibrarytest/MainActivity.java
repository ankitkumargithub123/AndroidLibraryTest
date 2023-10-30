package com.avyaan.androidlibrarytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import com.avyaan.redsoslibrary.LibraryActivity;
import com.avyaan.redsoslibrary.Toaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Toaster.show();

        //setContentView(com.avyaan.redsoslibrary.R.layout.mainlayout);

        //Button button=(Button) findViewById(com.avyaan.redsoslibrary.R.id.btn_click);
        //button.setOnClickListener(v -> Toaster.show());


        Intent intent=new Intent(this, LibraryActivity.class);
        startActivity(intent);


    }
}