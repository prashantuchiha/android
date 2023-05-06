package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {
    LottieAnimationView a,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=findViewById(R.id.lips);
        b=findViewById(R.id.animation);
        getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b.setVisibility(View.VISIBLE);
                a.setVisibility(View.INVISIBLE);
                b.playAnimation();

                Thread td=new Thread(){

                    public void run(){

                        try {
                            sleep(1000);
                        }catch (Exception e){
                            e.printStackTrace();
                        }finally {
                            Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                            startActivity(intent);
                            finish();
                        }

                    }

                };
                td.start();

            }
        });
    }
}