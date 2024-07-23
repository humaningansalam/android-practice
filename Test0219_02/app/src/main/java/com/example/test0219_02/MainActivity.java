package com.example.test0219_02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    MainFragment mainFragment;
    JoinFragment joinFragment;
    SignFragment signFragment;
    MenuFragment menuFragment;


    ProbFragment1 probFragment1;
    ProbFragment2 probFragment2;
    ProbFragment3 probFragment3;

    String id = "id";
    String pwd = "pwd";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainFragment = new MainFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.container, mainFragment).commit();
        joinFragment = new JoinFragment();
        signFragment = new SignFragment();
        menuFragment = new MenuFragment();

        probFragment1 = new ProbFragment1();
        probFragment2 = new ProbFragment2();
        probFragment3 = new ProbFragment3();
    }

    public void onFragmentChanged(int index){
        if(index == 0)  {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, mainFragment).commit();
        }else if(index == 1){
            getSupportFragmentManager().beginTransaction().replace(R.id.container, menuFragment).commit();
        }
    }

    public void onProbChanged(int index){
        if(index == 0)  {
            getSupportFragmentManager().beginTransaction().replace(R.id.container3, probFragment1).commit();
        }else if(index == 1){
            getSupportFragmentManager().beginTransaction().replace(R.id.container3, probFragment2).commit();
        }
    }

    public void joinOk(String id, String pwd){
        this.id = id;
        this.pwd = pwd;
    }

    public void loginChecked(String id, String pwd){

        if(this.id.equals(id) && this.pwd.equals(pwd)){
            Toast.makeText(getApplicationContext(), "성공" , Toast.LENGTH_SHORT).show();
            onFragmentChanged(1);
        }
        else{
            Toast.makeText(getApplicationContext(), "실패", Toast.LENGTH_SHORT).show();
            onFragmentChanged(0);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int curId = item.getItemId();
        switch (curId){
            case R.id.menu_login:
                Toast.makeText(this, "로그인", Toast.LENGTH_SHORT).show();
                getSupportFragmentManager().beginTransaction().replace(R.id.container, signFragment).commit();
                break;
            case  R.id.menu_sign:
                Toast.makeText(this, "회원가입", Toast.LENGTH_SHORT).show();
                getSupportFragmentManager().beginTransaction().replace(R.id.container, joinFragment).commit();
                break;
            default:
                break;
        }

        return super.onOptionsItemSelected(item);
    }

}