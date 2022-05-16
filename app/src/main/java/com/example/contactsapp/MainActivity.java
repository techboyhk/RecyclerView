package com.example.contactsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
private RecyclerView recyclerView;
private RecyclerView.LayoutManager layoutManager;
private MyAdapter myAdapter;
private String name[] = {
        "8828189767","9928169767","7728169767","6628169767","5528169767","8828169767","8828169767","8828169767","8828169767","8828169767",
        "8828169767","8828169767","8828169767","8828169767","8828169767","8828169767","8828169767"," 8828169767","8828169767","8828169767",
        "8828169767","8828169767","8828169767","8828169767","8828169767","8828169767","8828169767","8828169767","8828169767","8828169767",
        "8828169767"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.myrecyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        myAdapter = new MyAdapter(name,this);
        recyclerView.setAdapter(myAdapter);
    }
}