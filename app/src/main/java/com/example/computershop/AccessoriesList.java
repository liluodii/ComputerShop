package com.example.computershop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class AccessoriesList extends AppCompatActivity {
    public RecyclerView rvcomplist;
    final AccessoriesRepo accessoriesRepo=AccessoriesRepo.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accessories_list);
        rvcomplist = findViewById(R.id.rvacclist);
        rvcomplist.setLayoutManager((new LinearLayoutManager(this)));
       AccessoriesAdapter accessoriesAdapter= new AccessoriesAdapter(getApplicationContext());
        rvcomplist.setAdapter(accessoriesAdapter);
    }
}
