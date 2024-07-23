package com.example.test0209_06;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    int imageIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
    }

    public void onButton1Clicked(View v){
        Toast.makeText(this, "누름", Toast.LENGTH_LONG).show();

        if(imageIndex == 0){
            imageView.setVisibility(View.INVISIBLE);

            imageIndex = 1;
        }
        else if(imageIndex == 1){
            imageView.setVisibility(View.VISIBLE);

            imageIndex = 0;
        }

    }

    public void onButton2Clicked(View v){
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http:/m.naver.com"));
        startActivity(myIntent);

    }

    public void onButton3Clicked(View v){
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http:/m.google.com"));
        startActivity(myIntent);

    }
}