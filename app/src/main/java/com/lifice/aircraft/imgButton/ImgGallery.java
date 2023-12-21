package com.lifice.aircraft.imgButton;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.lifice.aircraft.R;

public class ImgGallery extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton gallery = (ImageButton)findViewById(R.id.icGallery);
        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"search button is Clicked", Toast.LENGTH_LONG).show();
            }
        });
    }
}
