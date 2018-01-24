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

        RadioButton radioButton1962 = (RadioButton) findViewById(R.id.rb_answer_1962);
        boolean answerWrong1962 = radioButton1962.isChecked();

        RadioButton radioButton1963 = (RadioButton) findViewById(R.id.rb_answer_1963);
        boolean answerCorrect1963 = radioButton1963.isChecked();

        RadioButton radioButton1964 = (RadioButton) findViewById(R.id.rb_answer_1964);
        boolean answerWrong1964 = radioButton1964.isChecked();

        RadioButton radioButton1984 = (RadioButton) findViewById(R.id.rb_answer_1984);
        boolean answerCorrect1984 = radioButton1984.isChecked();

        RadioButton radioButton1885 = (RadioButton) findViewById(R.id.rb_answer_1985);
        boolean answerWrong1985 =radioButton1885.isChecked();

        RadioButton radioButton1986 = (RadioButton) findViewById(R.id.rb_answer_1986);
        boolean answerWrong1986 = radioButton1986.isChecked();

        RadioButton radioButtonHornets = (RadioButton) findViewById(R.id.rb_answer_hornets);
        boolean answerCorrectHornets = radioButtonHornets.isChecked();

        RadioButton radioButtonGrizzlies = (RadioButton) findViewById(R.id.rb_answer_grizzlies);
        boolean answerWrongGrizzlies = radioButtonGrizzlies.isChecked();

        RadioButton radioButtonBucks = (RadioButton) findViewById(R.id.rb_answer_bucks);
        boolean answerWrongBucks = radioButtonBucks.isChecked();

        RadioButton radioButtonJames = (RadioButton) findViewById(R.id.rb_answer_james);
        boolean answerWrongJames = radioButtonJames.isChecked();

        RadioButton radioButtonJeffrey = (RadioButton) findViewById(R.id.rb_answer_jeffrey);
        boolean answerCorrectJeffrey = radioButtonJeffrey.isChecked();

        RadioButton radioButtonJohn = (RadioButton) findViewById(R.id.rb_answer_john);
        boolean answerWrongJohn = radioButtonJohn.isChecked();

        RadioButton radioButtonOne = (RadioButton) findViewById(R.id.rb_answer_one);
        boolean answerWrongOne = radioButtonOne.isChecked();

        RadioButton radioButtonTwo = (RadioButton) findViewById(R.id.rb_answer_two);
        boolean answerCorrectTwo = radioButtonTwo.isChecked();

        RadioButton radioButtonThree = (RadioButton) findViewById(R.id.rb_answer_three);
        boolean answerWrongThree = radioButtonThree.isChecked();

        RadioButton radioButtonFour = (RadioButton) findViewById(R.id.rb_answer_four);
        boolean answerWrongFour = radioButtonFour.isChecked();

        RadioButton radioButtonSix = (RadioButton) findViewById(R.id.rb_answer_six);
        boolean answerCorrectSix = radioButtonSix.isChecked();

        RadioButton radioButtonEight = (RadioButton) findViewById(R.id.rb_answer_eight);
        boolean answerWrongEight = radioButtonEight.isChecked();

        RadioButton radioButton28485 = (RadioButton) findViewById(R.id.rb_answer_28485);
        boolean answerWrong28485 = radioButton28485.isChecked();

        RadioButton radioButton30763 = (RadioButton) findViewById(R.id.rb_answer_30763);
        boolean answerWrong30763 = radioButton30763.isChecked();

        RadioButton radioButton32292 = (RadioButton) findViewById(R.id.rb_answer_32292);
        boolean answerCorrect32292 = radioButton32292.isChecked();

        EditText editTextNba = (EditText) findViewById(R.id.rb_answer_nba);
        String nbaQ = editTextNba.getText().toString();
        boolean answerCorrectNba = nbaQ.contains("nba")|| nbaQ.contains("NBA");

        CheckBox checkBoxSch = (CheckBox) findViewById(R.id.rb_answer_sch);
        boolean answerCorrectSch= checkBoxSch.isChecked();

        CheckBox checkBoxRonaldo = (CheckBox) findViewById(R.id.rb_answer_rn);
        boolean answerCorrectR = checkBoxRonaldo.isChecked();

        int cAnswer = calculateCorrectAnswers(answerWrong1962, answerCorrect1963, answerWrong1964,
                answerCorrect1984, answerWrong1985, answerWrong1986,
                answerCorrectHornets, answerWrongGrizzlies, answerWrongBucks,
                answerWrongJames, answerCorrectJeffrey, answerWrongJohn,
                answerWrongFour, answerCorrectSix, answerWrongEight,
                answerWrongOne, answerCorrectTwo, answerWrongThree,
                answerWrong28485, answerWrong30763, answerCorrect32292,
                answerCorrectNba,
                answerCorrectSch, answerCorrectR);

        String answerQuizPlayer = finalAnswerForQuizPlayer(cAnswer, nameOfQuizPlayer);
        displayAnswer(answerQuizPlayer);
    }

    private int calculateCorrectAnswers (boolean addWrong1962, boolean addCorrect1963, boolean addWrong1964,
                                         boolean addCorrect1984, boolean addWrong1985, boolean addWrong1986,
                                         boolean addCorrectHornets, boolean addWrongGrizzlies, boolean addWrongBucks,
                                         boolean addWrongJames, boolean addCorrectJeffrey, boolean addWrongJohn,
                                         boolean addWrongOne, boolean addCorrectTwo, boolean addWrongThree,
                                         boolean addWrongFour, boolean addCorrectSix, boolean addWrongEight,
                                         boolean addWrong28485, boolean addWrong30763, boolean addCorrect32292,
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

    public void displayAnswer (String answer){
        TextView yourScore = (TextView) findViewById(R.id.your_score);
        yourScore.setText(answer);
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

