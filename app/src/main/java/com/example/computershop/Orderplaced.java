package com.example.computershop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Orderplaced extends AppCompatActivity {
    TextView orderno;
    Button vieworder,shopmore;
    ImageView exit;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orderplaced);
        vieworder=findViewById(R.id.btnshoworder);
        shopmore=findViewById(R.id.btnshopmore);
        orderno=findViewById(R.id.txtorderid);
        exit=findViewById(R.id.imgexit);
        final int min = 20;
        final int max = 1000;
        final int random = new Random().nextInt((max - min) + 1) + min;

        orderno.setText("YOUR ORDER ID IS : "+random);
        Intent intent1=getIntent();
        Integer itemimage= intent1.getExtras().getInt("Itemimage");
        String itemname=intent1.getStringExtra("Itemname");
        String itemprice=intent1.getStringExtra("price");

        Order order=new Order(itemimage,random,itemname,itemprice);
        OrderRepo.getInstance().addOrder(order);

        vieworder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Orderplaced.this,ViewOrder.class);
                startActivity(intent);
            }
        });
        shopmore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Orderplaced.this,Category.class);
                startActivity(intent);
            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                moveTaskToBack(true);
            }
        });
    }
}
