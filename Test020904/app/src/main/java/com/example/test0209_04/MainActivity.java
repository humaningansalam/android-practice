package com.example.test0209_04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {
    ScrollView scrollView;
    ImageView imageView;
    BitmapDrawable bitmap;


    ScrollView scrollView2;
    ImageView imageView2;
    BitmapDrawable bitmap2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scrollView = findViewById(R.id.scrollView);
        imageView = findViewById(R.id.imageView);
        scrollView.setHorizontalScrollBarEnabled(true);

        scrollView2 = findViewById(R.id.scrollView2);
        imageView2 = findViewById(R.id.imageView2);
        scrollView2.setHorizontalScrollBarEnabled(true);


    }

    public void onButton1Clicked(View v) {
        changeImage();
    }

    public void onButton2Clicked(View v) {
        changeImage2();
    }

    private void changeImage(){
        Resources res = getResources();
        bitmap = (BitmapDrawable) res.getDrawable(R.drawable.image01);
        int bitmapWidth = bitmap.getIntrinsicWidth();
        int bitmapHeight = bitmap.getIntrinsicHeight();

        imageView.setImageDrawable(bitmap);
        imageView.getLayoutParams().width = bitmapWidth;
        imageView.getLayoutParams().height = bitmapHeight;
    }

    private void changeImage2(){
        Resources res = getResources();
        bitmap2 = (BitmapDrawable) res.getDrawable(R.drawable.image02);
        int bitmapWidth = bitmap2.getIntrinsicWidth();
        int bitmapHeight = bitmap2.getIntrinsicHeight();

        imageView2.setImageDrawable(bitmap2);
        imageView2.getLayoutParams().width = bitmapWidth;
        imageView2.getLayoutParams().height = bitmapHeight;
    }
}