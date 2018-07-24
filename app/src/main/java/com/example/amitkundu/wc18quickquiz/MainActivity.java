package com.example.amitkundu.wc18quickquiz;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button answer1,answer2,answer3,answer4;
    TextView score,question;

    ProgressBar mProgressBar;

    private Questions mQuestions =new Questions();
    private String mAnswer;
    private int mScore = 0;
    private int mQuestionsLength = mQuestions.mQuestions.length;

    int mIndex= 0;

    final int Progress_Bar_Increment =(int) Math.ceil(100.0/mQuestionsLength);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //r = new Random();

        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);
        answer4 = (Button) findViewById(R.id.answer4);

        mProgressBar =(ProgressBar) findViewById(R.id.progress_bar);


        score = (TextView) findViewById(R.id.mScore);
        question = (TextView) findViewById(R.id.mQuestions);

        score.setText("Score "+mScore+"/"+mQuestionsLength);

        updateQuestion(mIndex);

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer1.getText() == mAnswer)
                {
                    mScore++;
                    score.setText("Score "+mScore+"/"+mQuestionsLength);
                    Toast.makeText(getApplicationContext(), "You are correct", Toast.LENGTH_SHORT).show();
                    mProgressBar.incrementProgressBy(Progress_Bar_Increment);
                    updateQuestion(updateIndex());

                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Wrong Answer\n"+"Correct Answer : "+mAnswer, Toast.LENGTH_LONG).show();
                    updateQuestion(updateIndex());
                }
            }
        });
        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer2.getText() == mAnswer)
                {
                    mScore++;
                    score.setText("Score "+mScore+"/"+mQuestionsLength);
                    Toast.makeText(getApplicationContext(), "You are correct", Toast.LENGTH_SHORT).show();
                    mProgressBar.incrementProgressBy(Progress_Bar_Increment);
                    updateQuestion(updateIndex());

                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Wrong Answer\n"+"Correct Answer : "+mAnswer, Toast.LENGTH_LONG).show();
                    updateQuestion(updateIndex());
                }
            }
        });
        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer3.getText() == mAnswer)
                {
                    mScore++;
                    score.setText("Score "+mScore+"/"+mQuestionsLength);
                    Toast.makeText(getApplicationContext(), "You are correct", Toast.LENGTH_SHORT).show();
                    mProgressBar.incrementProgressBy(Progress_Bar_Increment);
                    updateQuestion(updateIndex());

                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Wrong Answer\n"+"Correct Answer : "+mAnswer, Toast.LENGTH_LONG).show();
                    updateQuestion(updateIndex());
                }
            }
        });
        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(answer4.getText() == mAnswer)
                {
                    mScore++;
                    score.setText("Score "+mScore+"/"+mQuestionsLength);
                    Toast.makeText(getApplicationContext(), "You are correct", Toast.LENGTH_SHORT).show();
                    mProgressBar.incrementProgressBy(Progress_Bar_Increment);
                    updateQuestion(updateIndex());

                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Wrong Answer\n"+"Correct Answer : "+mAnswer, Toast.LENGTH_LONG).show();
                    updateQuestion(updateIndex());
                }
            }
        });



    }

    private void updateQuestion(int num)
    {
        question.setText(mQuestions.getQuestion(num));
        answer1.setText(mQuestions.getChoice1(num));
        answer2.setText(mQuestions.getChoice2(num));
        answer3.setText(mQuestions.getChoice3(num));
        answer4.setText(mQuestions.getChoice4(num));

        mAnswer = mQuestions.getCorrecANS(num);

    }

    private void gameOver()
    {
        AlertDialog.Builder alertDialogBuilder  = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder
                .setMessage("Game Over! Your score is "+mScore+" points")
                .setCancelable(false)
                .setPositiveButton("New Game",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                                finish();
                            }
                        })
                .setNegativeButton("EXIT",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                    finish();
                            }
                        });

    AlertDialog alertDialog = alertDialogBuilder.create();
    alertDialog.show();
    }

    public int updateIndex()
    {
        mIndex = (mIndex+1) % mQuestionsLength;
        if (mIndex==0)
        {
            gameOver();
        }

        return mIndex;
    }
}
