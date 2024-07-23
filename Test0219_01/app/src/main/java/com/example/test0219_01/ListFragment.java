package com.example.test0219_01;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class ListFragment extends Fragment {

    public static  interface SelectionCallback{
        public void onSelected(int button);
    }

    public SelectionCallback callback;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        if(context  instanceof SelectionCallback){
            callback = (SelectionCallback) context;
        }
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_list, container, false);

        Button button = rootView.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(callback != null){
                    callback.onSelected(0);
                }
            }
        });

        Button button2 = rootView.findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(callback != null){
                    callback.onSelected(1);
                }
            }
        });

        Button button3 = rootView.findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(callback != null){
                    callback.onSelected(2);
                }
            }
        });

        return rootView;
    }
}