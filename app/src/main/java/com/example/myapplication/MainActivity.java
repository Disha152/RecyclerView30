package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    ArrayList<Model> data = new ArrayList<>();
    AdapterClass adapter = new AdapterClass(data);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.recyclerview);

        // Manual Data Entry
        data.add(new Model("Iron Man", 50));
        data.add(new Model("Captain", 150));
        data.add(new Model("Thor", 1000));
        data.add(new Model("Hulk", 50));
        data.add(new Model("Clint", 40));
        data.add(new Model("Black Widow", 36));
        data.add(new Model("Falcon", 35));
        data.add(new Model("Bucky", 37));
        data.add(new Model("War Machine", 55));
        data.add(new Model("Spider Man", 20));
        mRecyclerView.setAdapter(adapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
    }
}