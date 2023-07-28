package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class KedarnathHotel extends AppCompatActivity {
    private ImageSlider imageSlider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedarnath_hotel);

        imageSlider = findViewById(R.id.imageSlider);
        //now we will create a list for images

        ArrayList<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/mainactivity-29b9d.appspot.com/o/kedarnath%20hotel%2Fkedh11.jpg?alt=media&token=8e0fa70a-f29a-42ac-bbf4-a8511b7f5508", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/mainactivity-29b9d.appspot.com/o/kedarnath%20hotel%2Fkedh22.jpg?alt=media&token=42576a17-e525-45f6-b8cc-afc583fc6ca8", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/mainactivity-29b9d.appspot.com/o/kedarnath%20hotel%2Fkedh33.jpg?alt=media&token=ea416bb5-d1c3-4c2f-ac2f-d49cf2bc9bb5", ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);
    }
}