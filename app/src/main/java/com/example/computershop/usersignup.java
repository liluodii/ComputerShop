package com.example.computershop;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class usersignup extends AppCompatActivity {
    EditText edt_remail,edt_rname,edt_rpass,edt_cpass;
    Button btn_reg;
    private FirebaseAuth fAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usersignup);
        fAuth = FirebaseAuth.getInstance();
        final Intent intent=new Intent(this,MainActivity.class);


        edt_remail = findViewById(R.id.edt_regemail);
        edt_rpass = findViewById(R.id.edt_regpassword);
        edt_cpass = findViewById(R.id.edt_regcpassword);
        edt_rname = findViewById(R.id.edt_regname);
        btn_reg = findViewById(R.id.btn_register);

        btn_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!checkEmptyFields())
                {
                    if (edt_rpass.getText().length()<6)
                    {
                        edt_rpass.setError("Invalid Password, Password Should be at least 6 Characters");
                        edt_rpass.requestFocus();
                    }else
                    {
                        if (!edt_rpass.getText().toString().equals(edt_cpass.getText().toString()))
                        {
                            edt_cpass.setError("Password not Match!");
                            edt_cpass.requestFocus();
                        }else {
                            String email = edt_remail.getText().toString();
                            String pass = edt_rpass.getText().toString();
                            String name = edt_rname.getText().toString();

                            createUser(email,pass,name);
                            startActivity(intent);
                        }
                    }
                }
            }
        });

    }
    public boolean checkEmptyFields()
    {
        if (TextUtils.isEmpty(edt_remail.getText().toString()))
        {
            edt_remail.setError("Email cannot be blank!");
            edt_remail.requestFocus();
            return true;

        }else if(TextUtils.isEmpty(edt_rpass.getText().toString()))
        {
            edt_rpass.setError("Password cannot be blank!");
            edt_rpass.requestFocus();
            return true;
        }else if(TextUtils.isEmpty(edt_cpass.getText().toString()))
        {
            edt_cpass.setError("Confirm Password cannot be blank!");
            edt_cpass.requestFocus();
            return true;
        }else if(TextUtils.isEmpty(edt_rname.getText().toString()))
        {
            edt_rname.setError("Name cannot be blank!");
            edt_rname.requestFocus();
            return true;
        }


        return false;
    }

    public void createUser(final String email, String pass, final String name)
    {
        fAuth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if (task.isSuccessful())
                {

                    FirebaseUser user = fAuth.getCurrentUser();
                    FirebaseFirestore db = FirebaseFirestore.getInstance();

                    Map<String,Object> usermap = new HashMap<>();
                    usermap.put("Name",name);
                    usermap.put("Email",email);


                    db.collection("user").document(user.getUid()).set(usermap).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {

                            Toast.makeText(getApplicationContext(),"Registration Success!",Toast.LENGTH_LONG).show();
                        }
                    });
                }else
                {
                    System.out.println("Error "+task.getException());
                }

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
