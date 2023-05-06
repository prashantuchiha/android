package com.example.photoalbum;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int[] imgArr={R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e};
    int imgCount=0;


    public void show(View view){
        if(imgCount==4){
            return;
        }
        imgCount+=1;
        ImageView img = findViewById(R.id.phon);

        img.setImageResource(imgArr[imgCount]);

    }
    public void show2(View view){
        if(imgCount==0){
            return;
        }
        imgCount-=1;
        ImageView img = findViewById(R.id.phon);

        img.setImageResource(imgArr[imgCount]);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}