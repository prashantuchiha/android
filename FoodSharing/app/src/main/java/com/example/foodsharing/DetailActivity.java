package com.example.foodsharing;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.foodsharing.databinding.ActivityDetailBinding;
import com.example.foodsharing.databinding.ActivityOrdersBinding;

public class DetailActivity extends AppCompatActivity {
ActivityDetailBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int image=getIntent().getIntExtra("image",0);
        int price=Integer.parseInt(getIntent().getStringExtra("price"));
        String name=getIntent().getStringExtra("name");
        String description=getIntent().getStringExtra("desc");
        binding.detailImage.setImageResource(image);
        binding.priceLbl.setText(String.format("%d",price));
        binding.nameBox.setText(name);
        binding.detailDescription.setText(description);
        final DBHelper helper=new DBHelper(this);

        binding.insertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean isInserted=helper.insertOrder(binding.nameBox.getText().toString(),
                       binding.phoneBox.getText().toString(),
                        price,image,name,description,Integer.parseInt(binding.quantity.getText().toString()));

                if(isInserted){
                    Toast.makeText(DetailActivity.this, "data success", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(DetailActivity.this, "error", Toast.LENGTH_SHORT).show();

                }
            }
            
        });
       
    }
}