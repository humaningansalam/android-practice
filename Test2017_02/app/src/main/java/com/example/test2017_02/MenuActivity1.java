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

public class MenuActivity1 extends AppCompatActivity {


    EditText editText4;
    EditText editText5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);

        editText4 = findViewById(R.id.editText4);
        editText5 = findViewById(R.id.editText5);

    }
    public void onButton3Clicked(View v){
        String data1 = editText4.getText().toString();
        String data2 = editText5.getText().toString();

        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setIcon(R.mipmap.ic_launcher);
        dialog.setTitle("Message");
        dialog.setMessage("아이디" + data1 + "비밀번호" + data2);

        dialog.setPositiveButton("네", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);

                intent.putExtra("id", data1);
                intent.putExtra("password", data2);

                startActivity(intent);
            }
        });
        dialog.setNegativeButton("아니오" , null);
        dialog.show();
    }

    public void onButton4Clicked(View v){
        Snackbar.make(v, "취소하시겠습니까?", Snackbar.LENGTH_INDEFINITE).setAction("취소", new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        }).setActionTextColor(Color.RED).show();
    }

}