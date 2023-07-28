package com.example.mainactivity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.firebase.auth.FirebaseAuth;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class Uttrakhand_Tourism extends AppCompatActivity {
    LinearLayout kedarnath ;
    LinearLayout gangotri;
    LinearLayout Yamunotri;
    LinearLayout Badrinath;
    LinearLayout nainital;
    LinearLayout dehradun;
    LinearLayout mussoorie;
    LinearLayout rishikesh;

    private ImageSlider imageSlider1;

    Button button2;
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getSupportActionBar().hide();//This line hides the action bar
        button2 = (Button) findViewById(R.id.button2);
        builder = new AlertDialog.Builder(this);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                builder.setMessage("Do you want to Logout ?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                FirebaseAuth.getInstance().signOut();
                                startActivity(new Intent(getApplicationContext(), Login.class));
                                finish();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.setTitle("Logout");
                alert.show();
            }
        });


        imageSlider1 = findViewById(R.id.imageSlider1);
        //now we will create a list for images
        ArrayList<SlideModel> slideModels1 = new ArrayList<>();
        slideModels1.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/mainactivity-29b9d.appspot.com/o/MainActivitySlideImages%2Fpankaj-kumar-FgqUjsVp_l8-unsplash.jpg?alt=media&token=21e01444-90cd-4646-a1c4-ac4bee2bdbc5", ScaleTypes.FIT));
        slideModels1.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/mainactivity-29b9d.appspot.com/o/MainActivitySlideImages%2Fanubhav-rana-58E1ZA9CXBA-unsplash.jpg?alt=media&token=d5a23757-eaa7-45cc-9f9e-15805379bff1", ScaleTypes.FIT));
        slideModels1.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/mainactivity-29b9d.appspot.com/o/MainActivitySlideImages%2Fkartik-swami-temple-1.webp?alt=media&token=694262b4-5f3e-4619-b265-dd19b075eaa4", ScaleTypes.FIT));

        imageSlider1.setImageList(slideModels1, ScaleTypes.FIT);

        ImageView i1 = findViewById(R.id.gangotriimage);
        Picasso
                .get()
                .load("https://firebasestorage.googleapis.com/v0/b/mainactivity-29b9d.appspot.com/o/destination%20images%2Fgangotri.jpg?alt=media&token=82a18483-7f09-4746-a3ed-a9172dc80759")
                .into(i1);
        ImageView i2 = findViewById(R.id.kedarnathimage);
        Picasso
                .get()
                .load("https://firebasestorage.googleapis.com/v0/b/mainactivity-29b9d.appspot.com/o/destination%20images%2Fkedar.jpg?alt=media&token=d20eeb4f-3ae7-4139-b086-526809719fe1")
                .into(i2);
        ImageView i3 = findViewById(R.id.yamunotriimage);
        Picasso
                .get()
                .load("https://firebasestorage.googleapis.com/v0/b/mainactivity-29b9d.appspot.com/o/destination%20images%2Fyamunotri.jpeg?alt=media&token=fe22bd06-d935-40b5-ac87-9e3b75198361")
                .into(i3);
        ImageView i4 = findViewById(R.id.badrinathimage);
        Picasso
                .get()
                .load("https://firebasestorage.googleapis.com/v0/b/mainactivity-29b9d.appspot.com/o/destination%20images%2Fbadrinath.jpg?alt=media&token=9a26c32b-933b-434c-a7d2-c4367c7b0e07")
                .into(i4);
        ImageView i5 = findViewById(R.id.nainitalimage);
        Picasso
                .get()
                .load("https://firebasestorage.googleapis.com/v0/b/mainactivity-29b9d.appspot.com/o/destination%20images%2Fnainital.webp?alt=media&token=8cf920ea-6f1f-4855-81f8-9b512417bafe")
                .into(i5);
        ImageView i6 = findViewById(R.id.dehradunimage);
        Picasso
                .get()
                .load("https://firebasestorage.googleapis.com/v0/b/mainactivity-29b9d.appspot.com/o/destination%20images%2Fdehradun.jpg?alt=media&token=05d67a47-ab5f-4c3f-9b17-a26c6a9c0a24")
                .into(i6);
        ImageView i7 = findViewById(R.id.mussoorieimage);
        Picasso
                .get()
                .load("https://firebasestorage.googleapis.com/v0/b/mainactivity-29b9d.appspot.com/o/destination%20images%2FMussoorie.jpg?alt=media&token=f838d84b-0bc6-47d2-b96c-e85aed52cdfc")
                .into(i7);
        ImageView i8 = findViewById(R.id.rishikeshimage);
        Picasso
                .get()
                .load("https://firebasestorage.googleapis.com/v0/b/mainactivity-29b9d.appspot.com/o/destination%20images%2Frishikesh.jpg?alt=media&token=bdf03ff0-3059-4fff-b8cb-40648a7ee698")
                .into(i8);


        kedarnath = findViewById(R.id.ll1);
        kedarnath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Uttrakhand_Tourism.this, Kedarnath.class);
                startActivity(intent);
            }
        });
        gangotri = findViewById(R.id.ll2);
        gangotri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Uttrakhand_Tourism.this, Gangotri.class);
                startActivity(intent);
            }
        });

        Yamunotri = findViewById(R.id.ll3);
        Yamunotri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Uttrakhand_Tourism.this, Yamunotri.class);
                startActivity(intent);
            }
        });

        Badrinath = findViewById(R.id.ll4);
        Badrinath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Uttrakhand_Tourism.this, Badrinath.class);
                startActivity(intent);
            }
        });

        nainital = findViewById(R.id.ll5);
        nainital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Uttrakhand_Tourism.this, Nainital.class);
                startActivity(intent);
            }
        });

        dehradun = findViewById(R.id.ll6);
        dehradun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Uttrakhand_Tourism.this, Dehradun.class);
                startActivity(intent);
            }
        });

        mussoorie = findViewById(R.id.ll7);
        mussoorie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Uttrakhand_Tourism.this, Mussoorie.class);
                startActivity(intent);
            }
        });

        rishikesh = findViewById(R.id.ll8);
        rishikesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Uttrakhand_Tourism.this, Rishikesh.class);
                startActivity(intent);
            }
        });
    }

    public void Logout(View view) {
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(getApplicationContext(), Login.class));
        finish();
}
}