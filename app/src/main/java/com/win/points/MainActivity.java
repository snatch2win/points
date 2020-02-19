package com.win.points;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
//import android.view.Menu;
//import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    final int POINT_3 = 3;
    final int POINT_2 = 2;
    final int POINT_1 = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }



    public void submit_a3(View view) {
        scoreTeamA += POINT_3;
        display(scoreTeamA);
    }

    public void submit_a2(View view) {
        scoreTeamA += POINT_2;
        display(scoreTeamA);
    }

    public void submit_a1(View view) {
        scoreTeamA += POINT_1;
        display(scoreTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    private void display(int number) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText("" + number);
    }




    /**
    *  код команды В
     *
     *  */



    public void submit_b3(View view) {
        scoreTeamB += POINT_3;
        display(scoreTeamB);
    }

    public void submit_b2(View view) {
        scoreTeamB += POINT_2;
        display(scoreTeamB);
    }

    public void submit_b1(View view) {
        scoreTeamB += POINT_1;
        display(scoreTeamB);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
/*
    private void display(int number) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText("" + number);
    }
*/
}
