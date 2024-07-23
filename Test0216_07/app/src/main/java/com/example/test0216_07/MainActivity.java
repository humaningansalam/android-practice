package com.example.test0216_07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText1;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);

                Button button = findViewById(R.id.button);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String data = editText1.getText().toString();

                if(data.equals("aa")){
                    Intent intent = new Intent(getApplicationContext(), MenuActivity1.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(), "틀립니다.", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}