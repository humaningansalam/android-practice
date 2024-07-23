package com.example.test2017_02;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    EditText editText1;
    EditText editText2;

    String id;
    int password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        id = intent.getStringExtra("id");
        password = intent.getIntExtra("password" , 20);


        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);

    }

    public void onButton1Clicked(View v){
        String data = editText1.getText().toString();

        if(data.equals(id)){
            Intent intent = new Intent(getApplicationContext(), ExamActivity1.class);
            startActivity(intent);
        }
        else{
            AlertDialog.Builder dialog = new AlertDialog.Builder(this);
            dialog.setIcon(R.mipmap.ic_launcher);
            dialog.setTitle("Dialog");
            dialog.setMessage("비로그인으로 진행하시겠습니까?");
            dialog.setPositiveButton("네", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = new Intent(getApplicationContext(), ExamActivity1.class);
                    startActivity(intent);
                }
            });
            dialog.setNegativeButton("아니오" , null);
            dialog.show();
        }
    }

    public void onButton2Clicked(View v){

        Intent intent = new Intent(getApplicationContext(), MenuActivity1.class);
        startActivity(intent);

    }
}