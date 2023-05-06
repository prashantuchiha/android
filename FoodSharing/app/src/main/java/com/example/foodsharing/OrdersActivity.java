package com.example.foodsharing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.foodsharing.Adapters.OrdersAdapter;
import com.example.foodsharing.Models.OrdersModel;
import com.example.foodsharing.databinding.ActivityOrdersBinding;

import java.util.ArrayList;

public class OrdersActivity extends AppCompatActivity {

    ActivityOrdersBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding=ActivityOrdersBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        DBHelper helper=new DBHelper(this);
        ArrayList<OrdersModel> list=helper.getOrders();
//        list.add(new OrdersModel(R.drawable.love,"love","4","1234567"));
//        list.add(new OrdersModel(R.drawable.love,"love","4","1234567"));
//        list.add(new OrdersModel(R.drawable.love,"love","4","1234567"));
//        list.add(new OrdersModel(R.drawable.love,"love","4","1234567"));
//        list.add(new OrdersModel(R.drawable.love,"love","4","1234567"));
//        list.add(new OrdersModel(R.drawable.love,"love","4","1234567"));
//        list.add(new OrdersModel(R.drawable.love,"love","4","1234567"));
//        list.add(new OrdersModel(R.drawable.love,"love","4","1234567"));
//        list.add(new OrdersModel(R.drawable.love,"love","4","1234567"));





        OrdersAdapter adapter=new OrdersAdapter(list,this);
        binding.orderRecyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        binding.orderRecyclerView.setLayoutManager(layoutManager);

    }
}