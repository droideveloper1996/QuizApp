package scorecard.project.com.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Quiz1 extends AppCompatActivity {
    public static int myscore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);


        final RadioButton correct = (RadioButton) findViewById(R.id.correct_answer);
        Button answer = (Button) findViewById(R.id.checkAnswer);
        final TextView scoretextview = (TextView) findViewById(R.id.score);
        scoretextview.setText("Your Score : " + myscore);
        answer.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (correct.isChecked()) {
                    ++myscore;
                    scoretextview.setText("Your Score : " + myscore);
                    Intent i = new Intent(Quiz1.this, Quiz2.class);
                    i.putExtra("score", myscore);
                    startActivity(i);
                } else {

                    scoretextview.setText("Opps! That's Wrong, Try Again Please");

                }
            }


        });


    }

}
