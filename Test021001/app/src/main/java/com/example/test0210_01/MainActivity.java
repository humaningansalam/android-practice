package com.example.test0210_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButton1clicked(View v){
        Toast.makeText(this, "이름 버튼이 눌렸어요.", Toast.LENGTH_LONG).show();
    }

    public void onButton2clicked(View v){
        Toast.makeText(this, "나이 버튼이 눌렸어요.", Toast.LENGTH_LONG).show();
    }

    public void onButton3clicked(View v){
        Toast.makeText(this, "번호 버튼이 눌렸어요.", Toast.LENGTH_LONG).show();
    }
}