package scorecard.project.com.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import static scorecard.project.com.quizapp.Quiz1.myscore;

public class Quiz3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3);
        Intent i = getIntent();
        myscore = i.getIntExtra("score", 0);
        final CheckBox correctanswer5 = (CheckBox) findViewById(R.id.correct_answer5);
        final CheckBox correctanswer4 = (CheckBox) findViewById(R.id.correct_answer4);
        Button answer = (Button) findViewById(R.id.checkAnswer);
        final TextView scoretextview = (TextView) findViewById(R.id.score);
        scoretextview.setText("Your Score : " + myscore);
        answer.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (correctanswer4.isChecked() && correctanswer5.isChecked()) {
                    ++myscore;
                    scoretextview.setText("Your Score : " + myscore);
                    Intent i = new Intent(Quiz3.this, Quiz4.class);
                    i.putExtra("score", myscore);
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(i);
                } else {

                    scoretextview.setText("Opps! That's Wrong, Try Again Please");

                }
            }


        });
    }
}
