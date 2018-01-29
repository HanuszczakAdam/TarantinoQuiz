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

public class Q10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q10);
        setToastToZero();
    }

    @Override
    public void onBackPressed() {
        //TOAST MESSAGE: You can not back to previous question during the quiz
        //TOAST MESSAGE: Back again to go to main menu
        toastVar += 1;
        if (toastVar == 2) {
            Intent intent = new Intent(Q10.this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.putExtra("EXIT", true);
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(this, "You cannot back to previous questions!\nBack again to go to Main Menu", Toast.LENGTH_SHORT).show();
        }
    }

    public void goToSubmit(View view) {

        CheckBox checkBox_q10_1 = (CheckBox) findViewById(R.id.q10_1_check_box);
        boolean hasCheckBox_q10_1 = checkBox_q10_1.isChecked();

        CheckBox checkBox_q10_3 = (CheckBox) findViewById(R.id.q10_3_check_box);
        boolean hasCheckBox_q10_3 = checkBox_q10_3.isChecked();

        CheckBox checkBox_q10_5 = (CheckBox) findViewById(R.id.q10_5_check_box);
        boolean hasCheckBox_q10_5 = checkBox_q10_5.isChecked();

        CheckBox checkBox_q10_6 = (CheckBox) findViewById(R.id.q10_6_check_box);
        boolean hasCheckBox_q10_6 = checkBox_q10_6.isChecked();

        //Good Answers

        CheckBox checkBox_q10_2 = (CheckBox) findViewById(R.id.q10_2_check_box);
        boolean hasCheckBox_q10_2 = checkBox_q10_2.isChecked();

        CheckBox checkBox_q10_4 = (CheckBox) findViewById(R.id.q10_4_check_box);
        boolean hasCheckBox_q10_4 = checkBox_q10_4.isChecked();

        if (hasCheckBox_q10_2 && hasCheckBox_q10_4) {
            if (!hasCheckBox_q10_1 && !hasCheckBox_q10_3 && !hasCheckBox_q10_5 && !hasCheckBox_q10_6){
                addPoint();
                Intent intent = new Intent(this, Submit.class);
                startActivity(intent);
            }
            Intent intent = new Intent(this, Submit.class);
            startActivity(intent);
        } else {
            Intent intent = new Intent(this, Submit.class);
            startActivity(intent);
        }
    }


}