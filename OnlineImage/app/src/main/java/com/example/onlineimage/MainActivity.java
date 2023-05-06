package com.example.onlineimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
ImageView online1,online2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        online1=findViewById(R.id.imageView);
        online2=findViewById(R.id.imageView2);

        String uri="https://static-ca-cdn.eporner.com/gallery/oe/o2/MXdL3Fco2oe/24064-never-seen-a-better-use-of-landscape-orientation.jpg";
        Picasso.get().load(uri).placeholder(R.drawable.download).into(online1);
        String uri2="https://thumbs.dreamstime.com/z/elegant-woman-outdoor-pretty-brunette-girl-face-green-spring-background-natural-beauty-elegant-woman-outdoor-pretty-brunette-139102437.jpg";
        Picasso.get().load(uri2).placeholder(R.drawable.download).into(online2);

    }
}