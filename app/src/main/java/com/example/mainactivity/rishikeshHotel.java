package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class rishikeshHotel extends AppCompatActivity {
    private ImageSlider imageSlider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rishikesh_hotel);

        imageSlider = findViewById(R.id.imageSlider);
        //now we will create a list for images

        ArrayList<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/mainactivity-29b9d.appspot.com/o/Rishikesh%20Hotel%201%2FrishiH1.jpg?alt=media&token=e1aa2567-0af5-42ab-9fd1-402a598d4576", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/mainactivity-29b9d.appspot.com/o/Rishikesh%20Hotel%201%2FrishiH3.jpg?alt=media&token=286253d2-977d-4721-ae59-11acb2e5ec29", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/mainactivity-29b9d.appspot.com/o/Rishikesh%20Hotel%201%2FrishiH2.jpg?alt=media&token=fcec2d40-6e84-4141-898e-79377f4a51e5", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/mainactivity-29b9d.appspot.com/o/Rishikesh%20Hotel%201%2FrishiH4.jpg?alt=media&token=8975e4a1-3213-4475-951d-c2e32dfc1194", ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);
    }
}