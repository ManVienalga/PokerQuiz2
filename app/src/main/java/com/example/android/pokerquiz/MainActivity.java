package com.example.android.pokerquiz;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText nameInput;
    RadioButton q1answer1;
    RadioButton q1answer2;
    RadioButton q1answer3;
    RadioButton q1answer4;
    CheckBox q2answer1;
    CheckBox q2answer2;
    CheckBox q2answer3;
    CheckBox q2answer4;
    EditText question3;
    RadioButton q4answer1;
    RadioButton q4answer2;
    RadioButton q4answer3;
    RadioButton q4answer4;
    RadioButton q5answer1;
    RadioButton q5answer2;
    RadioButton q5answer3;
    RadioButton q5answer4;
    EditText question6;
    RadioButton q7answer1;
    RadioButton q7answer2;
    RadioButton q7answer3;
    RadioButton q7answer4;
    RadioButton q8answer1;
    RadioButton q8answer2;
    RadioButton q8answer3;
    RadioButton q9answer1;
    RadioButton q9answer2;
    RadioButton q9answer3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameInput = (EditText) findViewById(R.id.name_input);
        q1answer1 = (RadioButton) findViewById(R.id.q1a1);
        q1answer2 = (RadioButton) findViewById(R.id.q1a2);
        q1answer3 = (RadioButton) findViewById(R.id.q1a3);
        q1answer4 = (RadioButton) findViewById(R.id.q1a4);
        q2answer1 = (CheckBox) findViewById(R.id.q2a1);
        q2answer2 = (CheckBox) findViewById(R.id.q2a2);
        q2answer3 = (CheckBox) findViewById(R.id.q2a3);
        q2answer4 = (CheckBox) findViewById(R.id.q2a4);
        question3 = (EditText) findViewById(R.id.question_three_input);
        q4answer1 = (RadioButton) findViewById(R.id.q4a1);
        q4answer2 = (RadioButton) findViewById(R.id.q4a2);
        q4answer3 = (RadioButton) findViewById(R.id.q4a3);
        q4answer4 = (RadioButton) findViewById(R.id.q4a4);
        q5answer1 = (RadioButton) findViewById(R.id.q5a1);
        q5answer2 = (RadioButton) findViewById(R.id.q5a2);
        q5answer3 = (RadioButton) findViewById(R.id.q5a3);
        q5answer4 = (RadioButton) findViewById(R.id.q5a4);
        question6 = (EditText) findViewById(R.id.question_six_input);
        q7answer1 = (RadioButton) findViewById(R.id.q7a1);
        q7answer2 = (RadioButton) findViewById(R.id.q7a2);
        q7answer3 = (RadioButton) findViewById(R.id.q7a3);
        q7answer4 = (RadioButton) findViewById(R.id.q7a4);
        q8answer1 = (RadioButton) findViewById(R.id.q8a1);
        q8answer2 = (RadioButton) findViewById(R.id.q8a2);
        q8answer3 = (RadioButton) findViewById(R.id.q8a3);
        q9answer1 = (RadioButton) findViewById(R.id.q9a1);
        q9answer2 = (RadioButton) findViewById(R.id.q9a2);
        q9answer3 = (RadioButton) findViewById(R.id.q9a3);
    }

    public int calculateScore() {
        int quizScore = 0;

//        Question 1

        int q1Score = 0;
        boolean q1a1IsChecked = q1answer1.isChecked();
        boolean q1a2IsChecked = q1answer2.isChecked();
        boolean q1a3IsChecked = q1answer3.isChecked();
        boolean q1a4IsChecked = q1answer4.isChecked();


        if (q1a1IsChecked) {
            q1Score = 0;
        } else if (q1a2IsChecked) {
            q1Score = 0;
        } else if (q1a3IsChecked) {
            q1Score = 1;
        } else if (q1a4IsChecked) {
            q1Score = 0;
        }

        //        Question 2

        int q2Score = 0;

        boolean q2a1IsChecked = q2answer1.isChecked();
        boolean q2a2IsChecked = q2answer2.isChecked();
        boolean q2a3IsChecked = q2answer3.isChecked();
        boolean q2a4IsChecked = q2answer4.isChecked();

        if (!q2a1IsChecked & q2a2IsChecked & !q2a3IsChecked & q2a4IsChecked) {
            q2Score = 1;
        } else {
            q2Score = 0;
        }


//        Question 3

        String question3Value = question3.getText().toString();
        question3Value = question3Value.trim();
        int q3Score = 0;
        if (question3Value.equalsIgnoreCase("Deadman\'s hand")) {
            q3Score = 1;
        } else {
            q3Score = 0;
        }

        //        Question 4

        int q4Score = 0;

        boolean q4a1IsChecked = q4answer1.isChecked();
        boolean q4a2IsChecked = q4answer2.isChecked();
        boolean q4a3IsChecked = q4answer3.isChecked();
        boolean q4a4IsChecked = q4answer4.isChecked();


        if (q4a1IsChecked) {
            q4Score = 1;
        } else if (q4a2IsChecked) {
            q4Score = 0;
        } else if (q4a3IsChecked) {
            q4Score = 0;
        } else if (q4a4IsChecked) {
            q4Score = 0;
        }

        //        Question 5

        int q5Score = 0;

        boolean q5a1IsChecked = q5answer1.isChecked();
        boolean q5a2IsChecked = q5answer2.isChecked();
        boolean q5a3IsChecked = q5answer3.isChecked();
        boolean q5a4IsChecked = q5answer4.isChecked();


        if (q5a1IsChecked) {
            q5Score = 0;
        } else if (q5a2IsChecked) {
            q5Score = 0;
        } else if (q5a3IsChecked) {
            q5Score = 1;
        } else if (q5a4IsChecked) {
            q5Score = 0;
        }

//        Question 6

        String question6Value = question6.getText().toString();
        question6Value = question6Value.trim();
        int q6Score = 0;
        if (question6Value.equalsIgnoreCase("Under The Gun")) {
            q6Score = 1;
        } else {
            q6Score = 0;
        }

        //        Question 7

        int q7Score = 0;

        boolean q7a1IsChecked = q7answer1.isChecked();
        boolean q7a2IsChecked = q7answer2.isChecked();
        boolean q7a3IsChecked = q7answer3.isChecked();
        boolean q7a4IsChecked = q7answer4.isChecked();


        if (q7a1IsChecked) {
            q7Score = 0;
        } else if (q7a2IsChecked) {
            q7Score = 0;
        } else if (q7a3IsChecked) {
            q7Score = 0;
        } else if (q7a4IsChecked) {
            q7Score = 1;
        }

        //        Question 8

        int q8Score = 0;

        boolean q8a1IsChecked = q8answer1.isChecked();
        boolean q8a2IsChecked = q8answer2.isChecked();
        boolean q8a3IsChecked = q8answer3.isChecked();


        if (q8a1IsChecked) {
            q8Score = 0;
        } else if (q8a2IsChecked) {
            q8Score = 1;
        } else if (q8a3IsChecked) {
            q8Score = 0;
        }

        //        Question 9

        int q9Score = 0;

        boolean q9a1IsChecked = q9answer1.isChecked();
        boolean q9a2IsChecked = q9answer2.isChecked();
        boolean q9a3IsChecked = q9answer3.isChecked();


        if (q9a1IsChecked) {
            q9Score = 0;
        } else if (q9a2IsChecked) {
            q9Score = 1;
        } else if (q9a3IsChecked) {
            q9Score = 0;
        }

//Calculates the score

        quizScore = q1Score + q2Score + q3Score + q4Score + q5Score + q6Score + q7Score + q8Score + q9Score;
        return quizScore;


    }


    public void submitAnswers(View view) {
        String name = nameInput.getText().toString();
        String toastMessage = "";
        int quizScore = calculateScore();
        if (quizScore == 0) {
            toastMessage = "You're still a fish!";
        } else if (quizScore <= 4) {
            toastMessage = "You know some things!";
        } else if (quizScore <= 7) {
            toastMessage = "You have a good knowledge about poker!";
        } else if (quizScore <= 9) {
            toastMessage = "You're a shark!";
        }
        Context context = getApplicationContext();
        CharSequence text = "Thank you for taking the quiz " + name + "\n" +
                "You have: " + quizScore + " correct answers!";
        text = text + "\n" + toastMessage;
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();


    }
}

