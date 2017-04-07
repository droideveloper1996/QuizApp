package scorecard.project.com.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static scorecard.project.com.quizapp.Quiz1.myscore;

public class Quiz5 extends AppCompatActivity {
    String textanswer = "";
    TextView scoretextview;
    EditText ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz5);
        myscore = 4;
        ans = (EditText) findViewById(R.id.correct_answer9);

        Button answer = (Button) findViewById(R.id.checkAnswer);
        scoretextview = (TextView) findViewById(R.id.score);
        scoretextview.setText("Your Score : " + myscore);
        answer.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("string", textanswer);
                check_answer();
            }
        });
    }

    public void check_answer() {
        textanswer = ans.getText().toString().trim();
        Log.i("dfb", textanswer);
        if (textanswer.equals("Larray Page") || textanswer.equals("Larry Page, Sergey Brin") || textanswer.equals("Sergey Brin")) {
            myscore=5;
            scoretextview.setText("Your Score : " + myscore);
            Intent i = new Intent(Quiz5.this, Score.class);
            //i.putExtra("score", myscore);
            //i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(i);
        } else if (TextUtils.isEmpty(textanswer)) {
            scoretextview.setText("Please Enter Something");

        } else {
            scoretextview.setText("Opps! That's Wrong, Try Again Please");

        }
    }

}














