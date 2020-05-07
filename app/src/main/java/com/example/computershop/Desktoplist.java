package com.example.computershop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

public class Desktoplist extends AppCompatActivity {
    public RecyclerView rvcomplist;
    final DesktopRepo computerTypeRepo=DesktopRepo.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popularlist);
        rvcomplist = findViewById(R.id.rvcomplist);
        rvcomplist.setLayoutManager((new LinearLayoutManager(this)));
        Intent intent=getIntent();
        int imgid= intent.getExtras().getInt("imageid");
        String id=intent.getStringExtra("id");



        if(imgid==R.drawable.applelogo) {
        DesktopAdapter desktopAdapter= new DesktopAdapter(getApplicationContext());
        rvcomplist.setAdapter(desktopAdapter);
        }else if(imgid==R.drawable.delllogo)
        {
             DellAdapter dellAdapter = new DellAdapter(getApplicationContext());
            rvcomplist.setAdapter(dellAdapter);
        }
        else if(imgid==R.drawable.hplogo1)
        {
            HpAdapter hpAdapter= new HpAdapter(getApplicationContext());
            rvcomplist.setAdapter(hpAdapter);
        }
        else if(imgid==R.drawable.lenovologo)
        {
            LenovoAdapter lenovoAdapter= new LenovoAdapter(getApplicationContext());
            rvcomplist.setAdapter(lenovoAdapter);
        }
        else if(imgid==R.drawable.acerlogo)
        {
            AcerAdapter acerAdapter= new AcerAdapter(getApplicationContext());
            rvcomplist.setAdapter(acerAdapter);
        }
    }

}
