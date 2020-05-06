package com.example.computershop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class LaptopTypes extends AppCompatActivity {
    public RecyclerView rvtypeslist;
    final TypesRepo typesRepo=TypesRepo.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laptop_types);
        rvtypeslist = findViewById(R.id.rvtypes);
        rvtypeslist.setLayoutManager((new GridLayoutManager(this,2)));
        LaptopTypesAdapter typesAdapter = new LaptopTypesAdapter(getApplicationContext());
        rvtypeslist.setAdapter(typesAdapter);
    }
}
