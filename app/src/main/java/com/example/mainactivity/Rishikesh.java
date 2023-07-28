package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.squareup.picasso.Picasso;

public class Rishikesh extends AppCompatActivity {
    LinearLayout rishikeshhotel1;
    LinearLayout rishikeshhotel2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rishikesh);
        rishikeshhotel1 = findViewById(R.id.llr1);
        rishikeshhotel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Rishikesh.this, rishikeshHotel.class);
                startActivity(intent);
            }
        });

        rishikeshhotel2 = findViewById(R.id.llr2);
        rishikeshhotel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Rishikesh.this, rishikeshHotel2.class);
                startActivity(intent);
            }
        });

        ImageView i1 = findViewById(R.id.imageView3);
        Picasso
                .get()
                .load("https://firebasestorage.googleapis.com/v0/b/mainactivity-29b9d.appspot.com/o/Rishikesh%20Hotel%201%2FrishiH1.jpg?alt=media&token=e1aa2567-0af5-42ab-9fd1-402a598d4576")
                .into(i1);

        ImageView i2 = findViewById(R.id.vv5);
        Picasso
                .get()
                .load("https://firebasestorage.googleapis.com/v0/b/mainactivity-29b9d.appspot.com/o/Rishikesh%20hotel%202%2Frishihh4.jpg?alt=media&token=02d75995-a8bf-4e34-b8fe-40f9296b333e")
                .into(i2);
    }
}