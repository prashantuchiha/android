package com.example.foodsharing;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.foodsharing.Adapters.MainAdapter;
import com.example.foodsharing.Models.MainModel;
import com.example.foodsharing.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding binding ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<MainModel> list =new ArrayList<>();

        list.add(new MainModel(R.drawable.love,"love","5","my love 2D girlfriend"));
        list.add(new MainModel(R.drawable.love,"setting","5","my love 2D girlfriend"));
        list.add(new MainModel(R.drawable.love,"naruto","5","my love 2D girlfriend"));
        list.add(new MainModel(R.drawable.love,"itachi","5","my love 2D girlfriend"));


        MainAdapter adapter= new MainAdapter(list ,this);
        binding.recyclerview.setAdapter(adapter);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        binding.recyclerview.setLayoutManager(layoutManager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.orders:
                startActivity(new Intent(MainActivity.this,OrdersActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}