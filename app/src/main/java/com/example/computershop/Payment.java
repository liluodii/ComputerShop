package com.example.computershop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Payment extends AppCompatActivity {
    TextView itemname,price,cardno,month,year,cvv;
    Button Pay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        itemname=findViewById(R.id.txtitemnamedata);
        price=findViewById(R.id.txtitempricedata);
        cardno=findViewById(R.id.edtpaymentmethod);
        month=findViewById(R.id.edtmonth);
        year=findViewById(R.id.edtyear);
        cvv=findViewById(R.id.edtcvv);
        final Intent intent=getIntent();
        itemname.setText(intent.getStringExtra("itemname"));
        price.setText(intent.getStringExtra("price"));
        Pay=findViewById(R.id.btnpay);
        Pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(cardno.getText().toString()))
                {
                        cardno.setError("Card number Cannot be empty");
                        cardno.requestFocus();
                }else if(TextUtils.isEmpty(month.getText().toString()))
                {
                    month.setError("Month cannot be empty");
                    month.requestFocus();
                }else if(TextUtils.isEmpty(year.getText().toString()))
                {
                    year.setError("Year cannot be empty");
                    year.requestFocus();
                }else if(TextUtils.isEmpty(cvv.getText().toString()))
                {
                    cvv.setError("Cvv cannot be empty");
                    cvv.requestFocus();
                }
                else
                {
                    Intent intent1=new Intent(Payment.this,Orderplaced.class);
                    intent1.putExtra("Itemimage",intent.getExtras().getInt("itemimage"));
                    intent1.putExtra("Itemname",intent.getStringExtra("itemname"));
                    intent1.putExtra("price",intent.getStringExtra("price"));
                    startActivity(intent1);
                }
            }
        });
    }

}
