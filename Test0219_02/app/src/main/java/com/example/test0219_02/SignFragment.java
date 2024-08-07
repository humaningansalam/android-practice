package com.example.test0219_02;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class SignFragment extends Fragment {

    ViewGroup rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = (ViewGroup)  inflater.inflate(R.layout.fragment_sign, container, false);


        EditText editText1 = rootView.findViewById(R.id.editText1);
        EditText editText2 = rootView.findViewById(R.id.editText2);

        Button button1 = rootView.findViewById(R.id.button1);  //로그인 버튼


        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                MainActivity activity = (MainActivity)getActivity();
                String id = editText1.getText().toString();
                String pwd = editText2.getText().toString();
                activity.loginChecked(id, pwd);
            }
        });


        return rootView;
    }
}