package com.example.test0218_02;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class MainFragment extends Fragment {

    ViewGroup rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = (ViewGroup) inflater.inflate(R.layout.fragment_main, container, false);

        EditText editText1 = rootView.findViewById(R.id.editText1);
        EditText editText2 = rootView.findViewById(R.id.editText2);

        Button button1 = rootView.findViewById(R.id.button1);  //로그인 버튼
        Button button2 = rootView.findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                MainActivity activity = (MainActivity)getActivity();
                String id = editText1.getText().toString();
                String pwd = editText2.getText().toString();
                activity.loginChecked(id, pwd);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                MainActivity activity = (MainActivity) getActivity();
                activity.onFragmentChanged(0);
            }
        });
        return rootView;
    }
}