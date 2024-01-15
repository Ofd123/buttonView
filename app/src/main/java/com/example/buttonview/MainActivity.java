package com.example.buttonview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageButton ib;
    ImageView iv;
    int x;
    Random rnd = new Random();
    //@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ib = findViewById(R.id.ib);
        ib.setImageResource(R.drawable.clickme);
        iv = findViewById(R.id.iv);


    }

    public void clicked(View view) {
        x = rnd.nextInt(3) + 1;
        if (x == 1)
        {
            iv.setImageResource(R.drawable.androidone);
        }
        else if (x == 2)
        {
            iv.setImageResource(R.drawable.pokemontwo);
        }
        else if (x == 3)
        {
            iv.setImageResource(R.drawable.minionsthree);
        }
    }
}