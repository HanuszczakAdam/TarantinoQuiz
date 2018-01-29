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

public class Q3 extends AppCompatActivity {

    int value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (savedInstanceState != null){
            value = (int) savedInstanceState.getLong("param");
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q3);
        setToastToZero();
    }
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putLong("param", value);
    }


    @Override
    public void onBackPressed() {
        //TOAST MESSAGE: You can not back to previous question during the quiz
        //TOAST MESSAGE: Back again to go to main menu
        toastVar += 1;
        if (toastVar == 2) {
            Intent intent = new Intent(Q3.this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.putExtra("EXIT", true);
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(this, "You cannot back to previous questions!\nBack again to go to Main Menu", Toast.LENGTH_SHORT).show();
        }
    }

    public void goToQ4(View view) {
        checkAnswerQ3();
        Intent intent = new Intent(this, Q4.class);
        startActivity(intent);
    }

    public void checkAnswerQ3(){
    EditText answerFieldQ3 = (EditText) findViewById(R.id.enterAnswer_q3);
    String answerQ3 = answerFieldQ3.getText().toString().toLowerCase();
        switch (answerQ3){
            case "from dusk till dawn":
                addPoint();
                Log.v("Answer for Q3: ", answerQ3);
                break;
            default:
                Log.v("Answer for Q3: ", answerQ3);
                break;
        }

    }
}
