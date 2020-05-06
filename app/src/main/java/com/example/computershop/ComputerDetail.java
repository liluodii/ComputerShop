package com.example.computershop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ComputerDetail extends AppCompatActivity {
  TextView Cname,model,price,rating,Display,memory,os,videocard,wireless,keyboard,mouse,harddrive;
    ImageView Cimage,Star;
    Button Buy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer_detail);

        Cname=findViewById(R.id.txtdescription);
        model=findViewById(R.id.txtmodel);
        price=findViewById(R.id.txtprice);
        rating=findViewById(R.id.txtrating);
        Display=findViewById(R.id.txtdisplaydata);
        memory=findViewById(R.id.txtmemorydata);
        os=findViewById(R.id.txtosdata);
        videocard=findViewById(R.id.txtvideocarddata);
        wireless=findViewById(R.id.txtwirelessdata);
        keyboard=findViewById(R.id.txtkeyboarddata);
        mouse=findViewById(R.id.txtmousedata);
        harddrive=findViewById(R.id.txtharddrivedata);
        Cimage=findViewById(R.id.imgcmp);
        Star=findViewById(R.id.imgstar);
        Buy=findViewById(R.id.buttonbuy);

        final Intent intent=getIntent();
        Cname.setText(intent.getStringExtra("description"));
        model.setText("Model No : "+intent.getStringExtra("model"));
        price.setText(intent.getStringExtra("price"));
        rating.setText(intent.getStringExtra("rating"));
        Display.setText(intent.getStringExtra("display"));
        memory.setText(intent.getStringExtra("memory"));
        os.setText(intent.getStringExtra("os"));
        videocard.setText(intent.getStringExtra("videocard"));
        wireless.setText(intent.getStringExtra("wireless"));
        keyboard.setText(intent.getStringExtra("keyboard"));
        mouse.setText(intent.getStringExtra("mouse"));
        harddrive.setText((intent.getStringExtra("harddrive")));
        Cimage.setImageResource(intent.getExtras().getInt("cImage"));
        Star.setImageResource(intent.getExtras().getInt("cstar"));

        Buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(ComputerDetail.this,Payment.class);
                intent1.putExtra("itemimage",intent.getExtras().getInt("cImage"));
                intent1.putExtra("itemname",Cname.getText().toString());
                intent1.putExtra("price",price.getText().toString());
                startActivity(intent1);
            }
        });

    }
}
