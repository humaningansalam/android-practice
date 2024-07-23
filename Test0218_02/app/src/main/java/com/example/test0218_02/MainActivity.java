package com.example.test0218_02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    MainFragment mainFragment;
    JoinFragment joinFragment;

    String id = "id";
    String pwd = "pwd";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainFragment = new MainFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.container, mainFragment).commit();
        joinFragment = new JoinFragment();

    }

    public void onFragmentChanged(int index){
        if(index == 0)  {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, joinFragment).commit();
        }else if(index == 1){
            getSupportFragmentManager().beginTransaction().replace(R.id.container, mainFragment).commit();
        }
    }

    public void joinOk(String id, String pwd){
        this.id = id;
        this.pwd = pwd;
    }

    public void loginChecked(String id, String pwd){

        if(this.id.equals(id) && this.pwd.equals(pwd)){
            Toast.makeText(getApplicationContext(), "성공" , Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(getApplicationContext(), "실패", Toast.LENGTH_SHORT).show();
        }
    }
}