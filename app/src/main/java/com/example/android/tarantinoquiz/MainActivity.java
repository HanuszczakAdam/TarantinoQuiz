package com.example.android.tarantinoquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    static int score = 0;
    static byte toastVar = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setScoreToZero();
        setToastToZero();

        Button exitButton = (Button) findViewById(R.id.exit_button);
        exitButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                finish();
                System.exit(0);
            }
        });

    }


    public void goToQ1(View view) {
        Intent intent = new Intent(this, Q1.class);
        startActivity(intent);
    }

    static void addPoint() {
        score += 10;
    }

    public void setScoreToZero() {
        score = 0;
    }

    static void setToastToZero() {
        toastVar = 0;
    }


}


