package com.example.test0218_01;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class JoinFragment extends Fragment {

    EditText editText3;
    EditText editText4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

                ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_join, container, false);
        editText3 = rootView.findViewById(R.id.editText3);
        editText4 = rootView.findViewById(R.id.editText4);

        Button button3 = rootView.findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data1 = editText3.getText().toString();
                String data2 = editText4.getText().toString();
                MainActivity activity = (MainActivity) getActivity();
                activity.joinOk(data1, data2);
                activity.onFragmentChanged(1);
            }
        });



        return rootView;


    }
}