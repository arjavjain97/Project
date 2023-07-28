package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class Kedarnathhotel2 extends AppCompatActivity {
    private ImageSlider imageSlider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedarnathhotel2);

        imageSlider = findViewById(R.id.imageSlider);
        //now we will create a list for images

        ArrayList<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/mainactivity-29b9d.appspot.com/o/kedarnath%20hotel%201%2Fkedh21.jpg?alt=media&token=380b7659-5edb-42db-93fc-5d32236c5177", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/mainactivity-29b9d.appspot.com/o/kedarnath%20hotel%201%2Fkedh22.jpg?alt=media&token=02282f28-62be-4d83-8744-541e7b6ec488", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/mainactivity-29b9d.appspot.com/o/kedarnath%20hotel%201%2Fkedh23.jpg?alt=media&token=125268b7-4d7c-4330-b8fa-11cd6ad5c414", ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);
    }
}