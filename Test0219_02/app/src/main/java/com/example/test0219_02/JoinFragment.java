package com.example.test0219_02;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class JoinFragment extends Fragment {

    ViewGroup rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
                rootView = (ViewGroup)  inflater.inflate(R.layout.fragment_join, container, false);

        EditText editText3 = rootView.findViewById(R.id.editText3);
        EditText editText4 = rootView.findViewById(R.id.editText4);

        Button button2 = rootView.findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity activity = (MainActivity) getActivity();
                String id = editText3.getText().toString();
                String pwd = editText4.getText().toString();
                activity.joinOk(id, pwd);
                activity.onFragmentChanged(0);
            }
        });


        return rootView;
    }
}