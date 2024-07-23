package com.example.test0217_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        Intent intent = getIntent();

        String name = intent.getStringExtra("name");
        int age = intent.getIntExtra("age" , 20);

        Toast.makeText(this, name + "," + age, Toast.LENGTH_LONG).show();
    }
}