package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Yamunotri extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yamunotri);

        ImageView i1 = findViewById(R.id.imageView3);
        Picasso
                .get()
                .load("https://firebasestorage.googleapis.com/v0/b/mainactivity-29b9d.appspot.com/o/yamuh1.jpg?alt=media&token=e9f54ea2-0822-4475-a183-8fdd62210339")
                .into(i1);

        ImageView i2 = findViewById(R.id.vv11);
        Picasso
                .get()
                .load("https://firebasestorage.googleapis.com/v0/b/mainactivity-29b9d.appspot.com/o/yamuh2.jpg?alt=media&token=16f19251-836f-4d27-b47d-0dcecb43030c")
                .into(i2);
    }
}