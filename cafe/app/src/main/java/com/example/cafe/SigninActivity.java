//package com.example.cafe;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.TextView;
//
//public class SigninActivity extends AppCompatActivity {
//    TextView tvregister;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_signin);
//        getSupportActionBar().setTitle("Sign In");
//        tvregister=findViewById(R.id.tvregister);
//        tvregister.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(SigninActivity.this,SignupActivity.class);
//                startActivity(intent);
//            }
//
//        });
//
//    }
//
//}