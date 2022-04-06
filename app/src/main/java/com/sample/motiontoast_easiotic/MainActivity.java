package com.sample.motiontoast_easiotic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.lazyprogrammer.motiontoast.MotionStyle;
import com.lazyprogrammer.motiontoast.MotionToast;

public class MainActivity extends AppCompatActivity {
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MotionToast motionToast = new MotionToast(
                        MainActivity.this, /*Your activity name*/
                        0, /*Layout mode of toast*/
                        MotionStyle.LIGHT, /*Toast mode Light/Dark*/
                        MotionStyle.SUCCESS, /*Toast style*/
                        MotionStyle.BOTTOM, /*Toast gravity*/
                        "SUCCESS", /*Toast title*/
                        "You got succeed", /*Toast description*/
                        MotionStyle.LENGTH_SHORT /*Toast time*/
                ).show();
            }
        });
    }
}