package com.example.self14_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    Button btnStart, btnStop;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.music2);
        setTitle("서비스 테스트 예제(개선)");

        intent = new Intent(this, MusicService.class);
        btnStart = (Button) findViewById(R.id.btnStart);
        btnStop = (Button) findViewById(R.id.btnStop);

        btnStart.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startService(intent);
                Toast.makeText(getApplicationContext(), "startService()",
                        Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                stopService(intent);
                Toast.makeText(getApplicationContext(), "stopService()",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
