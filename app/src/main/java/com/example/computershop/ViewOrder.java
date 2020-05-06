package com.example.computershop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ViewOrder extends AppCompatActivity {
    public RecyclerView rvorderlis;
    final OrderRepo orderRepo=OrderRepo.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_order);

        rvorderlis = findViewById(R.id.rvorder);
        rvorderlis.setLayoutManager((new LinearLayoutManager(this)));


        OrderAdapter orderAdapter= new OrderAdapter(getApplicationContext());
        rvorderlis.setAdapter(orderAdapter);

    }
}
