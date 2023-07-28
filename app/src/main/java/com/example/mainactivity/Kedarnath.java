package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.squareup.picasso.Picasso;

public class Kedarnath extends AppCompatActivity {

    LinearLayout kedarnathhotel ;
    LinearLayout kedarnathhotel2 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedarnath);
        kedarnathhotel = findViewById(R.id.llh1);
        kedarnathhotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Kedarnath.this, KedarnathHotel.class);
                startActivity(intent);
            }
        });

        kedarnathhotel2 = findViewById(R.id.llh2);
        kedarnathhotel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Kedarnath.this, Kedarnathhotel2.class);
                startActivity(intent);
            }
        });

        ImageView i1 = findViewById(R.id.imageView3);
        Picasso
                .get()
                .load("https://firebasestorage.googleapis.com/v0/b/mainactivity-29b9d.appspot.com/o/kedarnath%20hotel%2Fkedhview.webp?alt=media&token=8b1b07f8-5196-46dc-834a-b1e2bbd2caf3")
                .into(i1);

        ImageView i2 = findViewById(R.id.view22);
        Picasso
                .get()
                .load("https://firebasestorage.googleapis.com/v0/b/mainactivity-29b9d.appspot.com/o/kedarnath%20hotel%201%2Fkedh22.jpg?alt=media&token=02282f28-62be-4d83-8744-541e7b6ec488")
                .into(i2);
    }
}