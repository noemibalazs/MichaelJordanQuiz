package com.example.android.michaeljordanquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CheckBox yes = (CheckBox) findViewById(R.id.yes);
        final CheckBox no = (CheckBox) findViewById(R.id.no);

        yes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                yes.setChecked(isChecked);
                no.setChecked(false);
            }
        });

        no.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                no.setChecked(isChecked);
                yes.setChecked(false);
            }
        });
    }

    public void submitQuiz (final View view) {

        EditText eText = (EditText)findViewById(R.id.name_of_player);
        String nameOfQuizPlayer = eText.getText().toString();

        RatingBar ratingBarJordan = (RatingBar) findViewById(R.id.ratting_bar);
        String numberOfRatings = "Thank you for your evaluation. Rating: " + ratingBarJordan.getRating();
        Toast.makeText(this,numberOfRatings,Toast.LENGTH_SHORT).show();

        RadioButton radioButton1963 = (RadioButton) findViewById(R.id.rb_answer_1963);
        boolean answerCorrect1963 = radioButton1963.isChecked();

        RadioButton radioButton1984 = (RadioButton) findViewById(R.id.rb_answer_1984);
        boolean answerCorrect1984 = radioButton1984.isChecked();

        RadioButton radioButtonHornets = (RadioButton) findViewById(R.id.rb_answer_hornets);
        boolean answerCorrectHornets = radioButtonHornets.isChecked();

        RadioButton radioButtonJeffrey = (RadioButton) findViewById(R.id.rb_answer_jeffrey);
        boolean answerCorrectJeffrey = radioButtonJeffrey.isChecked();

        RadioButton radioButtonTwo = (RadioButton) findViewById(R.id.rb_answer_two);
        boolean answerCorrectTwo = radioButtonTwo.isChecked();

        RadioButton radioButtonSix = (RadioButton) findViewById(R.id.rb_answer_six);
        boolean answerCorrectSix = radioButtonSix.isChecked();

        RadioButton radioButton32292 = (RadioButton) findViewById(R.id.rb_answer_32292);
        boolean answerCorrect32292 = radioButton32292.isChecked();

        EditText editTextNba = (EditText) findViewById(R.id.rb_answer_nba);
        String nbaQ = editTextNba.getText().toString();
        boolean answerCorrectNba = nbaQ.equalsIgnoreCase("nba");

        CheckBox checkBoxSch = (CheckBox) findViewById(R.id.rb_answer_sch);
        boolean answerCorrectSch= checkBoxSch.isChecked();

        CheckBox checkBoxRonaldo = (CheckBox) findViewById(R.id.rb_answer_rn);
        boolean answerCorrectR = checkBoxRonaldo.isChecked();

        int cAnswer = calculateCorrectAnswers( answerCorrect1963,
                answerCorrect1984, answerCorrectHornets,
                answerCorrectJeffrey, answerCorrectSix,
                 answerCorrectTwo, answerCorrect32292,
                answerCorrectNba,
                answerCorrectSch, answerCorrectR);

        String answerQuizPlayer = finalAnswerForQuizPlayer(cAnswer, nameOfQuizPlayer);
        displayAnswer(answerQuizPlayer);
        Toast.makeText(this, answerQuizPlayer, Toast.LENGTH_LONG).show();
    }

    private int calculateCorrectAnswers ( boolean addCorrect1963, boolean addCorrect1984,
                                          boolean addCorrectHornets, boolean addCorrectJeffrey,
                                          boolean addCorrectTwo, boolean addCorrectSix, boolean addCorrect32292,
                                         boolean addCorrectNba,
                                         boolean addCorrectSch, boolean addCorrectR){
        int correctAnswer = 0;

        if(addCorrectR && addCorrectSch){
            correctAnswer += 1;
        }
        if (addCorrectNba){
            correctAnswer += 1;
        }
        if(addCorrect1963){
            correctAnswer += 1;
        }
        if(addCorrect1984){
            correctAnswer += 1;
        }
        if(addCorrectHornets){
            correctAnswer += 1;
        }
        if(addCorrectJeffrey){
            correctAnswer += 1;
        }
        if(addCorrectTwo){
            correctAnswer += 1;
        }
        if(addCorrectSix){
            correctAnswer += 1;
        }
        if (addCorrect32292){
            correctAnswer += 1;
        }
        else {
            correctAnswer =0;
        }
        return correctAnswer;
    }

    public String finalAnswerForQuizPlayer (int correctAnswer, String nameOfQuizPlayer){
        String answer = "Congratulation "+ nameOfQuizPlayer + "! " + correctAnswer + " out of 9!";
        return answer;
    }

    public void displayAnswer (String sting){
        TextView yourScore = (TextView) findViewById(R.id.your_score);
        yourScore.setText("Thank you for your time!");
    }

    public void onPressed(View view){
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()){
            case R.id.yes:
                if (checked){
                    Toast.makeText(this, "I'm glad you enjoyed my quiz!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.no:
                if (checked){
                    Toast.makeText(this, "I'm sorry! Probably you have very high expectations!", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}

