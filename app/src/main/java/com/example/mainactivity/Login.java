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

public class Login extends AppCompatActivity {
    EditText Email, Password;
    Button Button;
    TextView Signup;
    ProgressBar progressBar;
    FirebaseAuth fAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Email = findViewById(R.id.Email);
        Password  = findViewById(R.id.Password);
        progressBar = (ProgressBar) findViewById(R.id.progressBar1);
        fAuth = FirebaseAuth.getInstance();
        Button = findViewById(R.id.Button);
        Signup = findViewById(R.id.Signup);

        Button.setOnClickListener(view -> {

            String  email = Email.getText().toString().trim();
            String password = Password.getText().toString().trim();

            if(TextUtils.isEmpty(email)){
                Email.setError("Email is required");
                return ;
            }

            if(TextUtils.isEmpty(password)){
                Email.setError("Password is required");
                return ;
            }

            if(password.length() < 6){
                Password.setError("Password must be >= 6  characters !");
                return;
            }
            progressBar.setVisibility(View.INVISIBLE);

            //authenticate the user.!!

            fAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(task -> {
                if(task.isSuccessful()){
                    Toast.makeText(Login.this, "Logged in Successfully !", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(getApplicationContext(), Uttrakhand_Tourism.class));
                }
                else{
                    Toast.makeText(Login.this, "Error ! " +  Objects.requireNonNull(task.getException()).getMessage(), Toast.LENGTH_SHORT).show();
                    progressBar.setVisibility(View.GONE);
                }
            });
        });

        Signup.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), Register.class)));
    }
}