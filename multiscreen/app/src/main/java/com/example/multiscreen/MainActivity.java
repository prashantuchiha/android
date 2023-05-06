package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String MSG="COM.EXAMPLE.MULTISCREEN.ORDER";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void placeOrder(View view){
        Intent intent=new Intent(this,orderActivity.class);
        EditText editText1=findViewById(R.id.a1);
        EditText editText2=findViewById(R.id.a2);
        EditText editText3=findViewById(R.id.a3);
        String message="order for "+editText1.getText().toString()+", "+editText2.getText().toString()+" and "+editText3.getText().toString()+"has been placed.";
        intent.putExtra(MSG,message);
        startActivity(intent);
    }
}