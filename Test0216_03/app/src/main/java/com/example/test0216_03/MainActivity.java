package com.example.test0216_03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout container;
    LayoutInflater inflater;

                @Override
                protected void onCreate(Bundle savedInstanceState) {
                    super.onCreate(savedInstanceState);
                    setContentView(R.layout.activity_main);

                    container = findViewById(R.id.container);
                    inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    public void onButton1Clicked(View v){

                    container.removeAllViews();
                inflater.inflate(R.layout.sub1,  container, true);


    }

    public void onButton2Clicked(View v){
        container.removeAllViews();
        inflater.inflate(R.layout.sub2,  container, true);

    }

    public void onButton3Clicked(View v){
        Button button4 = findViewById(R.id.button4);
        container.removeAllViews();
        inflater.inflate(R.layout.sub3,  container, true);
    }

}