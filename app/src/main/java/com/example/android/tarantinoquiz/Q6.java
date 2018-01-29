package com.example.android.tarantinoquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import static com.example.android.tarantinoquiz.MainActivity.addPoint;
import static com.example.android.tarantinoquiz.MainActivity.setToastToZero;
import static com.example.android.tarantinoquiz.MainActivity.toastVar;

public class Q6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q6);
        setToastToZero();
    }

    @Override
    public void onBackPressed() {
        //TOAST MESSAGE: You can not back to previous question during the quiz
        //TOAST MESSAGE: Back again to go to main menu
        toastVar += 1;
        if (toastVar == 2) {
            Intent intent = new Intent(Q6.this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.putExtra("EXIT", true);
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(this, "You cannot back to previous questions!\nBack again to go to Main Menu", Toast.LENGTH_SHORT).show();
        }
    }

    public void goToQ7(View view) {

        CheckBox checkBox_q6_1 = (CheckBox) findViewById(R.id.q6_1_check_box);
        boolean hasCheckBox_q6_1 = checkBox_q6_1.isChecked();

        CheckBox checkBox_q6_3 = (CheckBox) findViewById(R.id.q6_3_check_box);
        boolean hasCheckBox_q6_3 = checkBox_q6_3.isChecked();

        CheckBox checkBox_q6_4 = (CheckBox) findViewById(R.id.q6_4_check_box);
        boolean hasCheckBox_q6_4 = checkBox_q6_4.isChecked();

        if (hasCheckBox_q6_1 && hasCheckBox_q6_3 && hasCheckBox_q6_4) {
            addPoint();
            Intent intent = new Intent(this, Q7.class);
            startActivity(intent);
        } else {
            Intent intent = new Intent(this, Q7.class);
            startActivity(intent);
        }
    }


}