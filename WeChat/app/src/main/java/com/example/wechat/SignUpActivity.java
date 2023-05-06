package com.example.wechat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.wechat.databinding.ActivitySignUpBinding;
import com.example.wechat.models.Users;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class SignUpActivity extends AppCompatActivity {
ActivitySignUpBinding binding;
    private FirebaseAuth mAuth;
    FirebaseDatabase database;
    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
        mAuth=FirebaseAuth.getInstance();
        database=FirebaseDatabase.getInstance();
        progressDialog=new ProgressDialog(SignUpActivity.this);
        progressDialog.setTitle("creating account");
        progressDialog.setMessage("we're creating your account");

        binding.btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressDialog.show();
                mAuth.createUserWithEmailAndPassword
                        (binding.etEmail.getText().toString(),binding.etPassword.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        progressDialog.dismiss();
                        if(task.isSuccessful()){
                            Users user= new Users(binding.etUserName.getText().toString(),binding.etEmail.getText().toString(),binding.etPassword.getText().toString());
                            String id=task.getResult().getUser().getUid();
                            database.getReference().child("Users").child(id).setValue(user);
                            Toast.makeText(SignUpActivity.this, "User Created Successfully", Toast.LENGTH_SHORT).show();
                        }else{
                            Toast.makeText(SignUpActivity.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });

        binding.tvalreadyaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SignUpActivity.this,SignInActivity.class);
                startActivity(intent);
            }
        });

    }
}