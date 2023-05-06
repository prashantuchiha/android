package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bydefault,simple,nested;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bydefault=findViewById(R.id.button);
        simple=findViewById(R.id.button2);
        nested=findViewById(R.id.button3);
        bydefault.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "by default", Toast.LENGTH_SHORT).show();
            }
        });
        simple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast=Toast.makeText(MainActivity.this, "by default", Toast.LENGTH_SHORT);

                toast.setGravity(Gravity.CENTER_VERTICAL,0,0);

                toast.show();

            }
        });
        nested.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast=Toast.makeText(MainActivity.this, "by default", Toast.LENGTH_SHORT);
                toast.setGravity( Gravity.RIGHT,100,100);
                toast.show();
            }
        });
    }
}