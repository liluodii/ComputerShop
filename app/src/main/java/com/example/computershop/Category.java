package com.example.computershop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Category extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        ImageView desktop=findViewById(R.id.imgdesktop);
        ImageView laptop=findViewById(R.id.imglaptop);
        ImageView acs=findViewById(R.id.imgacs);
        ImageView popular=findViewById(R.id.imgmostpopular);
        desktop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Category.this,ComputerTypes.class);
                startActivity(intent);
            }
        });
        laptop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Category.this,LaptopTypes.class);
                startActivity(intent);
            }
        });
        acs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Category.this,AccessoriesList.class);
                startActivity(intent);
            }
        });
        popular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Category.this,Popularlist.class);
                startActivity(intent);
            }
        });
    }
}
