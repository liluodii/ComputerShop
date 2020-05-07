package com.example.computershop;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class LaptopList extends AppCompatActivity {
    public RecyclerView rvcomplist;
    final DesktopRepo computerTypeRepo=DesktopRepo.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popularlist);
        rvcomplist = findViewById(R.id.rvcomplist);
        rvcomplist.setLayoutManager((new LinearLayoutManager(this)));
        Intent intent=getIntent();
        int id= intent.getExtras().getInt("id");
        if(id==R.drawable.applelogo) {
            AppleLaptopAdapter appleLaptopAdapter= new AppleLaptopAdapter(getApplicationContext());
            rvcomplist.setAdapter(appleLaptopAdapter);
        }else if(id==R.drawable.delllogo)
        {
            DellLaptopAdapter dellLaptopAdapter=new DellLaptopAdapter(getApplicationContext());
            rvcomplist.setAdapter(dellLaptopAdapter);
        }
        else if(id==R.drawable.hplogo1)
        {
            HpLaptopAdapter hpLaptopAdapter=new HpLaptopAdapter(getApplicationContext());
            rvcomplist.setAdapter(hpLaptopAdapter);
        }
        else if(id==R.drawable.lenovologo)
        {
            LenovoLaptopAdapter lenovoLaptopAdapter=new LenovoLaptopAdapter(getApplicationContext());
            rvcomplist.setAdapter(lenovoLaptopAdapter);
        }
        else
        {
            AppleLaptopAdapter appleLaptopAdapter= new AppleLaptopAdapter(getApplicationContext());
            rvcomplist.setAdapter(appleLaptopAdapter);
        }
    }

}
