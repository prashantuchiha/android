package com.example.wechat;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.Toolbar;

import com.example.wechat.databinding.ActivitySettingsBinding;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

public class SettingsActivity extends AppCompatActivity {
ActivitySettingsBinding binding;
FirebaseStorage storage;
FirebaseAuth auth;
    FirebaseDatabase database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySettingsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();

        storage=FirebaseStorage.getInstance();
        auth=FirebaseAuth.getInstance();
        database=FirebaseDatabase.getInstance();
        binding.backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SettingsActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        binding.plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                 intent.setAction(Intent.ACTION_GET_CONTENT);
                 intent.setType("image/*");// */* is used to get every type of data
                startActivityForResult(intent,33);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(data.getData()!=null){
            Uri sFile=data.getData();
            binding.profileImage.setImageURI(sFile);
            final StorageReference reference=storage.getReference().child("profile pictures")
                    .child(FirebaseAuth.getInstance().getUid());
            reference.putFile(sFile).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                @Override
                public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                    Toast.makeText(SettingsActivity.this, "Uploaded", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}