package scorecard.project.com.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class Score extends AppCompatActivity {
    int myscore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        Intent i = getIntent();
        myscore = i.getIntExtra("score", 0);
        TextView finalscore = (TextView) findViewById(R.id.final_score);
        finalscore.setText("Your Score is : " + myscore);
    }
    @Override
    public void onBackPressed() {

        Toast.makeText(getApplicationContext(),"You can not go back", Toast.LENGTH_LONG).show();
    }
}
