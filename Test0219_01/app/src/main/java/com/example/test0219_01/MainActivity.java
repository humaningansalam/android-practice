package com.example.test0219_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ListFragment.SelectionCallback {

    ListFragment listFragment;
    ViewFragment viewFragment;
    ViewFragment2 viewFragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listFragment = new ListFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.container1, listFragment).commit();
        viewFragment = new ViewFragment();
        viewFragment2 = new ViewFragment2();

    }

    @Override
    public void onSelected(int index) {
        if(index == 0)  {
            getSupportFragmentManager().beginTransaction().replace(R.id.container2, viewFragment).commit();
        }else if(index == 1){
            getSupportFragmentManager().beginTransaction().replace(R.id.container2, viewFragment2).commit();
        }
        else if(index == 2){

        }
    }

}