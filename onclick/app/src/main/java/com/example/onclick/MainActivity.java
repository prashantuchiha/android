package com.example.onclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView first, second, third,forth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first=findViewById(R.id.textView);
        second=findViewById(R.id.textView2);
        third=findViewById(R.id.textView4);
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "firstway", Toast.LENGTH_SHORT).show();
            }
        });
        second.setOnClickListener(this);
        third.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.textView2:
                Toast.makeText(this, "secondway", Toast.LENGTH_SHORT).show();
                break;
            case R.id.textView4:
                Toast.makeText(this, "second way 2", Toast.LENGTH_SHORT).show();
                break;
        }



    }

    public void forth(View view) {
        Toast.makeText(this, "third way", Toast.LENGTH_SHORT).show();
    }
}