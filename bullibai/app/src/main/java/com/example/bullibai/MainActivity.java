package com.example.bullibai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView cat= findViewById(R.id.videoView);
        cat.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.cat);
        MediaController mediaController=new MediaController(this);
        cat.setMediaController(mediaController);
        mediaController.setAnchorView(cat);
        cat.start();
    }
}