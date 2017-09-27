package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int scoreTeamA = 0, scoreTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.displayScoreTeamA();
        this.displayScoreTeamB();
    }

    public void attScore (View view){

        switch (view.getId()){
            case R.id.team_a_score_plus1_button:
                scoreTeamA ++;
                displayScoreTeamA();
                return;

            case R.id.team_a_score_plus2_button:
                scoreTeamA += 2;
                displayScoreTeamA();
                return;

            case R.id.team_a_score_plus3_button:
                scoreTeamA += 3;
                displayScoreTeamA();
                return;

            case R.id.team_b_score_plus1_button:
                scoreTeamB ++;
                displayScoreTeamB();
                return;

            case R.id.team_b_score_plus2_button:
                scoreTeamB += 2;
                displayScoreTeamB();
                return;

            case R.id.team_b_score_plus3_button:
                scoreTeamB += 3;
                displayScoreTeamB();
                return;
        }
    }


    /**
     * This method display the actual score of team A
     */
    private void displayScoreTeamA (){
        TextView scoreTeamA = (TextView) findViewById(R.id.team_a_score_textview);
        scoreTeamA.setText("" + this.scoreTeamA);
    }

    /**
     * This method display the actual score of team B
     */
    private void displayScoreTeamB (){
        TextView scoreTeamA = (TextView) findViewById(R.id.team_b_score_textview);
        scoreTeamA.setText("" + this.scoreTeamB);
    }
}
