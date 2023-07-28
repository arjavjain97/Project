package com.example.mainactivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

import java.util.Objects;

public class Register extends AppCompatActivity {
    EditText fName,Email,Password,MobileNo;
    Button button;
    TextView Loginbttn;
    FirebaseAuth fAuth;
    ProgressBar progressbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        fName = findViewById(R.id.fName);
        Email = findViewById(R.id.Email);
        Password  = findViewById(R.id.Password);
        MobileNo = findViewById(R.id.editTextPhone);
        button = findViewById(R.id.button);
        Loginbttn = findViewById(R.id.Loginbttn);

        fAuth = FirebaseAuth.getInstance();
        progressbar = findViewById(R.id.progressBar1);

        if(fAuth.getCurrentUser() != null){
            startActivity(new Intent(getApplicationContext() , Uttrakhand_Tourism.class));
            finish();
        }

        button.setOnClickListener(v -> {
            String  email = Email.getText().toString().trim();
            String password = Password.getText().toString().trim();

            if(TextUtils.isEmpty(email)){
                Email.setError("Email is required");
                return ;
            }

            if(TextUtils.isEmpty(password)){
                Password.setError("Password is required");
                return ;
            }

            if(password.length() < 6){
                Password.setError("Password must be >= 6  characters !");
                return;
            }

            if(MobileNo.length() < 10){
                MobileNo.setError("Mobile Number must be of 10 Digits !");
                return;
            }

            progressbar.setVisibility(View.VISIBLE);

            //register the user in firebase

            fAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(task -> {
                if(task.isSuccessful()){
                    Toast.makeText(Register.this, "User Created", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(getApplicationContext() , Uttrakhand_Tourism.class));
                }
                else{
                    Toast.makeText(Register.this, "Error !  " + Objects.requireNonNull(task.getException()).getMessage(), Toast.LENGTH_SHORT).show();
                    progressbar.setVisibility(View.GONE);
                }
            });
        });

        Loginbttn.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), Login.class)));
    }
}