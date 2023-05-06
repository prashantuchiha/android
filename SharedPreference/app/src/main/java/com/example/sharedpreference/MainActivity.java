package com.example.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.sharedpreference.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnMoveText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.textView.setText(binding.editTextTextPersonName.getText().toString());
            }
        });

        binding.save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveText();

            }
        });
        againloadtext();
    }

    private void saveText() {
        SharedPreferences preferences=getSharedPreferences("sharedprefs",MODE_PRIVATE);
        SharedPreferences.Editor editor=preferences.edit();
        editor.putString("text",binding.textView.getText().toString());
        editor.putBoolean("switch",binding.switch1.isChecked());
        editor.apply();
        Toast.makeText(this, "data is saved", Toast.LENGTH_SHORT).show();
    }

    private void againloadtext(){
        String TEXT;Boolean SWITCH;
        SharedPreferences preferences=getSharedPreferences("sharedprefs",MODE_PRIVATE);
        TEXT=preferences.getString("text","");
        SWITCH=preferences.getBoolean("switch",false);
        binding.textView.setText(TEXT);
        binding.switch1.setChecked(SWITCH);


    }


}