package com.sample.motiontoast_easiotic;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.lazyprogrammer.motiontoast.MotionStyle;
import com.lazyprogrammer.motiontoast.MotionToast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button1);
        button.setOnClickListener(v -> new MotionToast(MainActivity.this, /*Your activity name*/
                0, /*Layout mode of toast*/
                MotionStyle.LIGHT, /*Toast mode Light/Dark*/
                MotionStyle.SUCCESS, /*Toast style*/
                MotionStyle.BOTTOM, /*Toast gravity*/
                "SUCCESS", /*Toast title*/
                "You got succeed :)", /*Toast description*/
                MotionStyle.LENGTH_SHORT /*Toast time*/).show());
    }
}