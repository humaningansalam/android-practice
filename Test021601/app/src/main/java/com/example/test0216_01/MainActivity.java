package com.example.test0216_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        View view = findViewById(R.id.view);
        view.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int action = event.getAction();

                float x = event.getX();
                float y = event.getY();

                if(action == MotionEvent.ACTION_DOWN){
                    textView.append("손가락 눌림 : " + x + "," + y + "\n");
                }else if(action == MotionEvent.ACTION_MOVE){
                    textView.append("손가락 이동 : " + x + "," + y + "\n");
                }else if(action == MotionEvent.ACTION_UP){
                    textView.append("손가락 껨 : " + x + "," + y + "\n");
                }
                return false;
            }
        });
    }
}