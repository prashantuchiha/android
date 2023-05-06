package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText firstNumber,secondNumber;
    TextView firstText;
    Button Add,subtact,multiply,divide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNumber=findViewById(R.id.etFirst);
        secondNumber=findViewById(R.id.etSecond);
        firstText=findViewById(R.id.tvFirst);
        Add=findViewById(R.id.btnAdd);
        subtact=findViewById(R.id.btnSubtract);
        multiply=findViewById(R.id.btnMultiply);
        divide=findViewById(R.id.btnDivide);

        Add.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                int FirstNumber,SecondNumber;double add;
                FirstNumber=Integer.parseInt(firstNumber.getText().toString());
                SecondNumber=Integer.parseInt(secondNumber.getText().toString());
                add=FirstNumber+SecondNumber;
                firstText.setText("Ans is = "+add);
            }
        });
        subtact.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                int FirstNumber,SecondNumber;double add;
                FirstNumber=Integer.parseInt(firstNumber.getText().toString());
                SecondNumber=Integer.parseInt(secondNumber.getText().toString());
                add=FirstNumber-SecondNumber;
                firstText.setText("Ans is = "+add);
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                int FirstNumber,SecondNumber;double add;
                FirstNumber=Integer.parseInt(firstNumber.getText().toString());
                SecondNumber=Integer.parseInt(secondNumber.getText().toString());
                add=FirstNumber*SecondNumber;
                firstText.setText("Ans is = "+add);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                int FirstNumber,SecondNumber;double add;
                FirstNumber=Integer.parseInt(firstNumber.getText().toString());
                SecondNumber=Integer.parseInt(secondNumber.getText().toString());
                add=(double) FirstNumber/SecondNumber;
                firstText.setText("Ans is = "+add);
            }
        });
    }
}