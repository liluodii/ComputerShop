package com.example.computershop;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    public RadioGroup radioGroup;
    private FirebaseAuth fAuth;
    FirebaseUser curUser;
    EditText edt_email, edt_pass;
    TextView txt_reg;
    Button btn_log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fAuth = FirebaseAuth.getInstance();
       // final Intent myintent3=new Intent(MainActivity.this,Adminmenu.class);
        final Intent myIntent2 = new Intent(MainActivity.this, usersignup.class);
        final Intent myintent=new Intent(MainActivity.this, Category.class);

        edt_email = findViewById(R.id.edt_logemail);
        edt_pass = findViewById(R.id.edt_logpasswrod);
        txt_reg = findViewById(R.id.txt_register);

        btn_log = findViewById(R.id.btn_login);


        btn_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int id = v.getId();
                //String value = ((RadioButton)findViewById(radioGroup.getCheckedRadioButtonId())).getText().toString();
                if (id == R.id.btn_login) {
                    if (TextUtils.isEmpty(edt_email.getText().toString())) {
                        edt_email.setError("Email can not be blank!");
                        edt_email.requestFocus();
                    } else if (TextUtils.isEmpty(edt_pass.getText().toString()))
                    {
                        edt_pass.setError("Password can not be blank!");
                        edt_pass.requestFocus();
                    } else {
                        String email = edt_email.getText().toString();
                        String pass = edt_pass.getText().toString();

                        loginUser(email, pass);
                        startActivity(myintent);

                    }


                } else if (id == R.id.txt_register) {

                    Intent intent=new Intent(MainActivity.this,usersignup.class);
                }

            }


        });
        txt_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(myIntent2);
            }
        });
    }
    public void loginUser(String email, String password)
    {
        fAuth.signInWithEmailAndPassword(email,password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if (task.isSuccessful())
                        {
                            curUser = fAuth.getCurrentUser();
                            Toast.makeText(getApplicationContext(),"Login Success!",Toast.LENGTH_LONG).show();
                        }


                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_LONG).show();

            }
        });
    }
}