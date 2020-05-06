package com.example.computershop;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ComputerTypes extends AppCompatActivity {
    public RecyclerView rvtypeslist;
    final TypesRepo typesRepo=TypesRepo.getInstance();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computertypes);
        rvtypeslist = findViewById(R.id.rvtypes);
        rvtypeslist.setLayoutManager((new GridLayoutManager(this,2)));
        TypesAdapter typesAdapter = new TypesAdapter(getApplicationContext());
        rvtypeslist.setAdapter(typesAdapter);
    }
}
