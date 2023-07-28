package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Gangotri extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gangotri);

        ImageView i1 = findViewById(R.id.imageView3);
        Picasso
                .get()
                .load("https://firebasestorage.googleapis.com/v0/b/mainactivity-29b9d.appspot.com/o/gangotrih1.jpg?alt=media&token=3256ef15-a6e3-4463-8ba2-06e678315550")
                .into(i1);

        ImageView i2 = findViewById(R.id.vv);
        Picasso
                .get()
                .load("https://firebasestorage.googleapis.com/v0/b/mainactivity-29b9d.appspot.com/o/gangotrih2.jpg?alt=media&token=1cdfbcf9-3942-4b81-9521-5b5fa34b74b1")
                .into(i2);
    }
}