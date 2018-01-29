package com.example.android.tarantinoquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import static com.example.android.tarantinoquiz.MainActivity.addPoint;
import static com.example.android.tarantinoquiz.MainActivity.setToastToZero;
import static com.example.android.tarantinoquiz.MainActivity.toastVar;

public class Q5 extends AppCompatActivity {

    public int a, b, c, d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q5);
        setToastToZero();
    }

    @Override
    public void onBackPressed() {
        //TOAST MESSAGE: You can not back to previous question during the quiz
        //TOAST MESSAGE: Back again to go to main menu
        toastVar += 1;
        if (toastVar == 2) {
            Intent intent = new Intent(Q5.this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.putExtra("EXIT", true);
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(this, "You cannot back to previous questions!\nBack again to go to Main Menu", Toast.LENGTH_SHORT).show();
        }
    }


    public void checkQ5(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q5_1_radio_button:
                if (checked)
                    a += 1;
                break;
            case R.id.q5_2_radio_button:
                if (checked)
                    b += 1;
                break;
            case R.id.q5_3_radio_button:
                if (checked)
                    c += 1;
                break;
            case R.id.q5_4_radio_button:
                if (checked)
                    d += 1;
                break;
        }
    }

    public void goToQ6(View view) {
        if (c > 0) {
            addPoint();
        }
        Intent intent = new Intent(this, Q6.class);
        startActivity(intent);
    }
}