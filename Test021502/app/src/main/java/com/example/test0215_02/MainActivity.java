package com.example.test0215_02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView2;

    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;

    int imageIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);

        textView2 = findViewById(R.id.textView2);
    }

    public void onButton1Clicked(View v){
        textView2.append("사진1이 눌렸습니다 \n");
        imageIndex = 0;
        changeImage();
    }

    public void onButton2Clicked(View v){
        textView2.append("사진2이 눌렸습니다 \n");
        imageIndex = 1;
        changeImage();
    }

    public void onButton3Clicked(View v){
        textView2.append("사진3이 눌렸습니다 \n");
        imageIndex = 2;
        changeImage();
    }

    private void changeImage(){
        if(imageIndex  == 0 ){
            imageView2.setVisibility(View.VISIBLE);
            imageView3.setVisibility(View.INVISIBLE);
            imageView4.setVisibility(View.INVISIBLE);
        }else if(imageIndex == 1) {
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.VISIBLE);
            imageView4.setVisibility(View.INVISIBLE);
        }else if(imageIndex == 2){
            imageView2.setVisibility(View.INVISIBLE);
            imageView3.setVisibility(View.INVISIBLE);
            imageView4.setVisibility(View.VISIBLE);

        }
    }
}