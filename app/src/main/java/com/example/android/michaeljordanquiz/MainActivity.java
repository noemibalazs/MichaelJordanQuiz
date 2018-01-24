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

    }

    public void submitQuiz (final View view) {

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

        RadioButton radioButtonAdidas = (RadioButton)findViewById(R.id.rb_answer_adidas);
        boolean answerWrongAdidas = radioButtonAdidas.isChecked();

        RadioButton radioButtonNike = (RadioButton) findViewById(R.id.rb_answer_nike);
        boolean answerCorrectNike = radioButtonNike.isChecked();

        RadioButton radioButtonConverse = (RadioButton) findViewById(R.id.rb_answer_converse);
        boolean answerWrongConverse = radioButtonConverse.isChecked();

        RadioButton radioButton67 = (RadioButton) findViewById(R.id.rb_answer_67);
        boolean answerWrong67 = radioButton67.isChecked();

        RadioButton radioButton68 = (RadioButton) findViewById(R.id.rb_answer_68);
        boolean answerWrong68 = radioButton68.isChecked();

        RadioButton radioButton69 = (RadioButton) findViewById(R.id.rb_answer_69);
        boolean answerCorrect69 = radioButton69.isChecked();

        int cAnswer = calculateCorrectAnswers(answerWrong1962, answerCorrect1963, answerWrong1964, answerCorrect1984, answerWrong1985, answerWrong1986, answerCorrectHornets, answerWrongGrizzlies, answerWrongBucks, answerWrongJames, answerCorrectJeffrey, answerWrongJohn, answerWrongFour, answerCorrectSix, answerWrongEight, answerWrongOne, answerCorrectTwo, answerWrongThree, answerWrong28485, answerWrong30763, answerCorrect32292, answerWrongAdidas, answerCorrectNike, answerWrongConverse, answerWrong67, answerWrong68, answerCorrect69);
        String answerQuizPlayer = finalAnswerForQuizPlayer(cAnswer);
        displayAnswer(answerQuizPlayer);
    }

    private int calculateCorrectAnswers (boolean addWrong1962, boolean addCorrect1963, boolean addWrong1964, boolean addCorrect1984, boolean addWrong1985, boolean addWrong1986, boolean addCorrectHornets, boolean addWrongGrizzlies, boolean addWrongBucks, boolean addWrongJames, boolean addCorrectJeffrey, boolean addWrongJohn, boolean addWrongOne, boolean addCorrectTwo, boolean addWrongThree ,boolean addWrongFour, boolean addCorrectSix, boolean addWrongEight, boolean addWrong28485, boolean addWrong30763, boolean addCorrect32292, boolean addWrongAdidas, boolean addCorrectNike, boolean addWrongConverse, boolean addWrong67, boolean addWrong68, boolean addCorrect69){
        int correctAnswer = 0;
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
        if(addCorrect32292){
            correctAnswer += 1;
        }
        if(addCorrectNike){
            correctAnswer += 1;
        }
        if(addCorrect69){
            correctAnswer += 1;
        }
        else {
            correctAnswer =0;
        }
        return correctAnswer;
    }

    public String finalAnswerForQuizPlayer (int correctAnswer){
        String answer = "Congratulation! "+ correctAnswer + " out of 9!";
        return answer;
    }

    public void displayAnswer (String answer){
        TextView yourScore = (TextView) findViewById(R.id.your_score);
        yourScore.setText(answer);
    }

    public void onPressed(View view){
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()){
            case R.id.amazing:
                if (checked){
                    Toast.makeText(this, "I'm glad you enjoyed my quiz!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.great:
                if (checked){
                    Toast.makeText(this, "Thank you! Again!", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}

