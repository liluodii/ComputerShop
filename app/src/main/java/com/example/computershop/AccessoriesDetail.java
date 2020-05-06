package com.example.computershop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AccessoriesDetail extends AppCompatActivity {
  TextView Price,name,modelno,connectivity,compability,color,rating;
    ImageView Aimage,star;
    Button Buy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accessories_detail);

        name=findViewById(R.id.txtdescription);
        modelno=findViewById(R.id.txtmodel);
        Price=findViewById(R.id.txtprice);
        rating=findViewById(R.id.txtrating);
        Aimage=findViewById(R.id.imgcmp);
        star=findViewById(R.id.imgstar);
        Buy=findViewById(R.id.buttonbuy);
        connectivity=findViewById(R.id.txtconnectivity);
        compability=findViewById(R.id.txtcompatibility);
        color=findViewById(R.id.txtcolordata);
        final Intent intent=getIntent();
        name.setText(intent.getStringExtra("description"));
        modelno.setText("Model No : "+intent.getStringExtra("modelno"));
        Price.setText(intent.getStringExtra("price"));
        rating.setText(intent.getStringExtra("rating"));
        Aimage.setImageResource(intent.getExtras().getInt("aimage"));
        star.setImageResource(intent.getExtras().getInt("star"));
        connectivity.setText(intent.getStringExtra("conn"));
        compability.setText(intent.getStringExtra("compatibility"));
        color.setText(intent.getStringExtra("color"));

        Buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(AccessoriesDetail.this,Payment.class);
                intent1.putExtra("itemimage",intent.getExtras().getInt("aimage"));
                intent1.putExtra("itemname",name.getText().toString());
                intent1.putExtra("price",Price.getText().toString());
                startActivity(intent1);
            }
        });


    }
}
