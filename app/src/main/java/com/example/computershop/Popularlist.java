package com.example.computershop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

public class Popularlist extends AppCompatActivity {

    public RecyclerView rvcomplist;
    final ComputerTypeRepo computerTypeRepo=ComputerTypeRepo.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popularlist);
        rvcomplist = findViewById(R.id.rvcomplist);
        rvcomplist.setLayoutManager((new LinearLayoutManager(this)));


        PopularAdapter popularAdapter = new PopularAdapter(getApplicationContext());
        rvcomplist.setAdapter(popularAdapter);
    }
}
