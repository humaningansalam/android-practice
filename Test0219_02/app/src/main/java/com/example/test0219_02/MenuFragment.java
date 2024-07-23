package com.example.test0219_02;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MenuFragment extends Fragment {

    ViewGroup rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
                rootView = (ViewGroup)  inflater.inflate(R.layout.fragment_menu, container, false);

                Button button3 = rootView.findViewById(R.id.button3);  //로그인 버튼
                Button button4 = rootView.findViewById(R.id.button4);
                Button button5 = rootView.findViewById(R.id.button5);

                button3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MainActivity activity = (MainActivity) getActivity();
                        activity.onProbChanged(0);
                    }
                });

                button4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MainActivity activity = (MainActivity) getActivity();
                activity.onProbChanged(1);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity activity = (MainActivity) getActivity();
                activity.onFragmentChanged(0);
            }
        });
        return rootView;
    }
}