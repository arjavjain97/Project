package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class rishikeshHotel2 extends AppCompatActivity {
    private ImageSlider imageSlider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rishikesh_hotel2);
        imageSlider = findViewById(R.id.imageSlider);
        //now we will create a list for images

        ArrayList<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/mainactivity-29b9d.appspot.com/o/Rishikesh%20hotel%202%2Frishihh2.jpg?alt=media&token=4f81eac5-94ce-4d6c-9852-b26cb7f56715", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/mainactivity-29b9d.appspot.com/o/Rishikesh%20hotel%202%2Frishihh4.jpg?alt=media&token=02d75995-a8bf-4e34-b8fe-40f9296b333e", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/mainactivity-29b9d.appspot.com/o/Rishikesh%20hotel%202%2Frishihh1.jpg?alt=media&token=852b1acd-67bd-4e8b-8084-95e8419cfffc", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/mainactivity-29b9d.appspot.com/o/Rishikesh%20hotel%202%2Frishihh3.jpg?alt=media&token=46a0665c-0946-4dc8-891b-63e90efc8e27", ScaleTypes.FIT));


        imageSlider.setImageList(slideModels, ScaleTypes.FIT);
    }
}