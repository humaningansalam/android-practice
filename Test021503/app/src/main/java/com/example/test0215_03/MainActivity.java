package com.example.test0215_03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

            TextView textView3;

            ImageView imageView;

            int imageIndex = 0;
            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                imageView = findViewById(R.id.imageView);

                textView3 = findViewById(R.id.textView3);
    }

    public void onButton1Clicked(View v){
        textView3.append("이름 : 윤상훈 \n");
    }

    public void onButton2Clicked(View v){
        textView3.append("나이 : 26살 \n");
    }

    public void onButton3Clicked(View v){
        textView3.append("전화번호 : 01040359634 \n");
    }

        public void onButton4Clicked(View v){
            Toast.makeText(this, "사진 보이기", Toast.LENGTH_LONG).show();
            imageIndex = 0;
            changeImage();
        }

        public void onButton5Clicked(View v){
            Toast.makeText(this, "사진 숨기기", Toast.LENGTH_LONG).show();
        imageIndex = 1;
        changeImage();
    }

    private void changeImage(){
        if(imageIndex  == 0 ){
            imageView.setVisibility(View.VISIBLE);
        }else if(imageIndex == 1) {
            imageView.setVisibility(View.INVISIBLE);
        }
    }
}