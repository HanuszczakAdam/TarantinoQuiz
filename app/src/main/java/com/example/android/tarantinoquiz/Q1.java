package com.example.android.tarantinoquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import static android.R.attr.value;
import static com.example.android.tarantinoquiz.MainActivity.addPoint;
import static com.example.android.tarantinoquiz.MainActivity.score;
import static com.example.android.tarantinoquiz.MainActivity.setToastToZero;
import static com.example.android.tarantinoquiz.MainActivity.toastVar;
import static java.lang.String.valueOf;

public class Q1 extends AppCompatActivity {

    public int a, b, c, d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);
        setToastToZero();
    }

    public void checkQ1(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q1_1_radio_button:
                if (checked)
                    a += 1;
                break;
            case R.id.q1_2_radio_button:
                if (checked)
                    b += 1;
                break;
            case R.id.q1_3_radio_button:
                if (checked)
                    c += 1;
                break;
            case R.id.q1_4_radio_button:
                if (checked)
                    d += 1;
                break;
        }
    }

    public void goToQ2(View view) {
        if (b > 0) {
            addPoint();
        }
        Log.v("Q1 - score value: ", valueOf(score));
        Intent intent = new Intent(this, Q2.class);
        startActivity(intent);
    }

    public void setAnswersToZero() {
        a = 0;
        b = 0;
        c = 0;
        d = 0;
    }

}
