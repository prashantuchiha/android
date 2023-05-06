package com.example.fragmentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.fragmentapp.Fragments.FristFragment;
import com.example.fragmentapp.Fragments.SecondFragment;

public class MainActivity extends AppCompatActivity {
    Button btnfirst,btnsecond;
    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnfirst=findViewById(R.id.btnFirst);
        btnsecond=findViewById(R.id.btnSecond);
        linearLayout=findViewById(R.id.linearLayout);

        btnfirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FristFragment firstFragment=new FristFragment();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearLayout,firstFragment);
                transaction.commit();
            }
        });
        btnsecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SecondFragment firstFragment=new SecondFragment();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearLayout,firstFragment);
                transaction.commit();
            }
        });
    }
}