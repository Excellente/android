package com.example.a8ball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Button askButton = (Button) findViewById(R.id.askButton);
    ImageView _8ball = (ImageView) findViewById(R.id.image_eightBall);
    final int[] ballsArray = {R.drawable.ball2, R.drawable.ball3, R.drawable.ball4, R.drawable.ball5};
}
