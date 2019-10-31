package com.example.iculture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class splash_screen extends AppCompatActivity {

    ImageView splash1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        splash1=findViewById(R.id.splash_pic);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i=new Intent(splash_screen.this,MainActivity.class);
                startActivity(i);
                finish();

            }
        },3000);
    }
}
