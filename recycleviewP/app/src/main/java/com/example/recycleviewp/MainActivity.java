package com.example.recycleviewp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.example.recycleviewp.Adapters.RecipeAdapter;
import com.example.recycleviewp.models.RecipeModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycle);

        ArrayList<RecipeModel>list=new ArrayList<>();
        list.add(new RecipeModel(R.drawable.a1,"fuck"));
        list.add(new RecipeModel(R.drawable.a2,"fuck"));
        list.add(new RecipeModel(R.drawable.a3,"fuck"));
        list.add(new RecipeModel(R.drawable.a4,"fuck"));
        list.add(new RecipeModel(R.drawable.a5,"fuck"));
        list.add(new RecipeModel(R.drawable.a6,"fuck"));
        list.add(new RecipeModel(R.drawable.a7,"fuck"));
        list.add(new RecipeModel(R.drawable.a8,"fuck"));


        RecipeAdapter adapter=new RecipeAdapter(list,this);
        recyclerView.setAdapter(adapter);


//        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(layoutManager );
//        LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
//        recyclerView.setLayoutManager(layoutManager );


//        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
//        recyclerView.setLayoutManager(gridLayoutManager);


        StaggeredGridLayoutManager staggered=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggered);




    }
}