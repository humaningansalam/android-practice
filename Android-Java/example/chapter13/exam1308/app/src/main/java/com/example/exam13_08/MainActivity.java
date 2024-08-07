package com.example.exam13_08;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ProgressBar pb1;
        Button btnInc, btnDec;

        pb1 = (ProgressBar) findViewById(R.id.progressBar1);
        btnInc = (Button) findViewById(R.id.btnInc);
        btnDec = (Button) findViewById(R.id.btnDec);

        btnInc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                pb1.incrementProgressBy(10);
            }
        });

        btnDec.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                pb1.incrementProgressBy(-10);
            }
        });

        final TextView tvSeek = (TextView) findViewById(R.id.tvSeek);
        SeekBar seekBar1 = (SeekBar) findViewById(R.id.seekBar1);

        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onStopTrackingTouch(SeekBar seekBar) {
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                tvSeek.setText("진행률 : " + progress + " %");
            }
        });
    }
}
