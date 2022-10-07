package com.example.image;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView img1,img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1=findViewById(R.id.image1);
        img2=findViewById(R.id.image2);

        img1.setOnClickListener(this::onclick);
        img2.setOnClickListener(this::onclick);
    }

    private void onclick(View view) {
        if (view.getId()==R.id.image1)
        {
            img1.setVisibility(view.GONE);
            img2.setVisibility(view.VISIBLE);
        }
        else
        {
            img2.setVisibility(view.GONE);
            img1.setVisibility(view.VISIBLE);
        }

    }

}
