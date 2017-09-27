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

    public void resetScores (View view) {
        this.scoreTeamA = 0;
        this.scoreTeamB = 0;

        this.displayScoreTeamA();
        this.displayScoreTeamB();
    }

    /**
     * This method update the score of one team
     * @param view
     */

    public void updateScore (View view){

        switch (view.getId()){
            case R.id.team_a_score_plus1_button:
                this.scoreTeamA ++;
                this.displayScoreTeamA();
                return;

            case R.id.team_a_score_plus2_button:
                this.scoreTeamA += 2;
                this.displayScoreTeamA();
                return;

            case R.id.team_a_score_plus3_button:
                this.scoreTeamA += 3;
                this.displayScoreTeamA();
                return;

            case R.id.team_b_score_plus1_button:
                this.scoreTeamB ++;
                this.displayScoreTeamB();
                return;

            case R.id.team_b_score_plus2_button:
                this.scoreTeamB += 2;
                this.displayScoreTeamB();
                return;

            case R.id.team_b_score_plus3_button:
                this.scoreTeamB += 3;
                this.displayScoreTeamB();
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
