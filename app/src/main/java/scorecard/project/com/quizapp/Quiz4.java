package scorecard.project.com.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import static scorecard.project.com.quizapp.Quiz1.myscore;

public class Quiz4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz4);
        Intent i = getIntent();
        myscore = i.getIntExtra("score", 0);
        final RadioButton correctanswer6 = (RadioButton) findViewById(R.id.correct_answer6);

        Button answer = (Button) findViewById(R.id.checkAnswer);

        final TextView scoretextview = (TextView) findViewById(R.id.score);
        scoretextview.setText("Your Score : " + myscore);
        answer.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (correctanswer6.isChecked()) {
                    ++myscore;
                    scoretextview.setText("Your Score : " + myscore);
                    Intent i = new Intent(Quiz4.this, Quiz5.class);
                    i.putExtra("score", myscore);

                    startActivity(i);
                } else {

                    scoretextview.setText("Opps! That's Wrong, Try Again Please");

                }
            }


        });
    }
    @Override
    public void onBackPressed() {

        Toast.makeText(getApplicationContext(),"You can not go back", Toast.LENGTH_LONG).show();
    }
}
