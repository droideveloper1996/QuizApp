package scorecard.project.com.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class Score extends AppCompatActivity {
    int myscore = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        TextView finalscore = (TextView) findViewById(R.id.final_score);
        finalscore.setText("Your Score is : " + myscore);
        Toast.makeText(getApplicationContext(), "Your Score is " + myscore, Toast.LENGTH_LONG).show();

    }

}
