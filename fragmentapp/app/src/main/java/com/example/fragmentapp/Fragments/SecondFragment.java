package com.example.fragmentapp.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fragmentapp.MainActivity2;
import com.example.fragmentapp.R;


public class SecondFragment extends Fragment {



    public SecondFragment() {
        // Required empty public constructor
    }

    TextView textView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_second, container, false);

        textView=view.findViewById(R.id.tvsec);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(), MainActivity2.class);
                startActivity(intent);
            }
        });

        return view;
    }
}