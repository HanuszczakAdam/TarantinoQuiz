package com.example.android.tarantinoquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.android.tarantinoquiz.MainActivity.addPoint;
import static com.example.android.tarantinoquiz.MainActivity.setToastToZero;
import static com.example.android.tarantinoquiz.MainActivity.toastVar;

public class Q9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q9);
        setToastToZero();
    }

    @Override
    public void onBackPressed() {
        //TOAST MESSAGE: You can not back to previous question during the quiz
        //TOAST MESSAGE: Back again to go to main menu
        toastVar += 1;
        if (toastVar == 2) {
            Intent intent = new Intent(Q9.this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.putExtra("EXIT", true);
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(this, "You cannot back to previous questions!\nBack again to go to Main Menu", Toast.LENGTH_SHORT).show();
        }
    }

    public void goToQ10(View view) {
        checkAnswerQ9();
        Intent intent = new Intent(this, Q10.class);
        startActivity(intent);
    }

    public void checkAnswerQ9() {
        EditText answerFieldQ9 = (EditText) findViewById(R.id.enterAnswer_q9);
        String answerQ3 = answerFieldQ9.getText().toString().toLowerCase();
        switch (answerQ3) {
            case "blonde":
                addPoint();
                break;
            case "mr blonde":
                addPoint();
                break;
            case "mr. blonde":
                addPoint();
                break;
            case "mr.blonde":
                addPoint();
                break;
            default:
                break;
        }

    }
}
