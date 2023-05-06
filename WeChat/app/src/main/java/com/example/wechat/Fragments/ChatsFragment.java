package com.example.wechat.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wechat.Adapters.UsersAdapter;
import com.example.wechat.R;
import com.example.wechat.databinding.FragmentChatsBinding;
import com.example.wechat.models.Users;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;


public class ChatsFragment extends Fragment {


    public ChatsFragment() {
        // Required empty public constructor
    }
FragmentChatsBinding binding;
ArrayList<Users> list=new ArrayList<>();
FirebaseDatabase database;
FirebaseAuth auth;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentChatsBinding.inflate(inflater, container, false);
        UsersAdapter adapter=new UsersAdapter(list,getContext());
        binding.chatRecyclerView.setAdapter(adapter);
database=FirebaseDatabase.getInstance();
        LinearLayoutManager layoutManager=new LinearLayoutManager(getContext());
        binding.chatRecyclerView.setLayoutManager(layoutManager);

        auth=FirebaseAuth.getInstance();
        database.getReference().child("Users").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                list.clear();Users users;
                for (DataSnapshot dataSnapshot: snapshot.getChildren()){

                    users=dataSnapshot.getValue(Users.class);
                    users.setUserId(dataSnapshot.getKey());
                    if (!(users.getUserId().equals(auth.getUid()))){
                        list.add(users);
                    }


//                    users=dataSnapshot.getValue(Users.class);
//                    users.setUserId(dataSnapshot.getKey());
//                    list.add(users);
                }
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });





        return binding.getRoot();
    }
}