package com.example.test0217_01;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButton1Clicked(View v){
        Toast.makeText(this, R.string.person_name, Toast.LENGTH_LONG).show();
    }

    public void onButton2Clicked(View v){
        Snackbar.make(v, R.string.person_name, Snackbar.LENGTH_INDEFINITE).setAction("닫기", new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        }).setActionTextColor(Color.RED).show();
    }

    public void onButton3Clicked(View v){
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setIcon(R.mipmap.ic_launcher);
        dialog.setTitle("Dialog");
        dialog.setMessage("메세지를 보여줍니다.");
        dialog.setNeutralButton("닫기", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "닫기 선택함", Toast.LENGTH_LONG).show();
            }
        });
        dialog.setPositiveButton("넨", null);
        dialog.setNegativeButton("아니오" , null);
        dialog.show();
    }

    public void onButton4Clicked(View v){
        Intent intent =new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("tel:01000001111"));

        startActivity(intent);
    }

    public void onButton5Clicked(View v){
        Intent intent =new Intent();
        intent.setAction(Intent.ACTION_WEB_SEARCH);
        intent.putExtra(SearchManager.QUERY, "한나미디어");

        startActivity(intent);
    }

    public void onButton6Clicked(View v){
        Intent intent =new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:0,0?q=서울"));

        startActivity(intent);
    }

    public void onButton7Clicked(View v){
        Intent intent =new Intent(this, NewActivity.class);
        intent.putExtra("name", "hanna");
        intent.putExtra("age", 29);


        startActivity(intent);
    }

}