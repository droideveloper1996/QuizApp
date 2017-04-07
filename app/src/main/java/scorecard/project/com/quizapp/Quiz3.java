package scorecard.project.com.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class Quiz3 extends AppCompatActivity {
    int myscore = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3);
        final CheckBox correctanswer5 = (CheckBox) findViewById(R.id.correct_answer5);
        final CheckBox correctanswer4 = (CheckBox) findViewById(R.id.correct_answer4);
        final CheckBox wronganswer4 = (CheckBox) findViewById(R.id.wrong_answer3);
        final CheckBox wronganswer2 = (CheckBox) findViewById(R.id.wrong_answer2);
        Button answer = (Button) findViewById(R.id.checkAnswer);
        final TextView scoretextview = (TextView) findViewById(R.id.score);
        scoretextview.setText("Your Score : " + myscore);
        answer.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                if (wronganswer2.isChecked() || wronganswer4.isChecked()) {

                    scoretextview.setText("Opps! That's Wrong, Try Again Please");

                } else if (correctanswer4.isChecked() && correctanswer5.isChecked()) {

                    scoretextview.setText("Your Score : " + myscore);
                    Intent i = new Intent(Quiz3.this, Quiz4.class);
                    // i.putExtra("score", myscore);
                    // i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(i);
                } else {

                    scoretextview.setText("Opps! That's Wrong, Try Again Please");

                }
            }


        });
    }

}
