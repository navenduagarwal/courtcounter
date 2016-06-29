package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int counterA;
    private int counterB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counterA=0;
        counterB=0;
    }

    public void addScoreA3Points(View view)
    {
        counterA=counterA+3;
        displayCounterA(counterA);
    }

    public void addScoreA2Points(View view)
    {
        counterA=counterA+2;
        displayCounterA(counterA);
    }

    public void addScoreAFreePoints(View view)
    {
        counterA=counterA+1;
        displayCounterA(counterA);
    }

    public void displayCounterA(int number)
    {
        TextView counterATextView = (TextView) findViewById(R.id.teamA_counter);
        String counter= ""+number;
        counterATextView.setText(counter);
    }

    public void addScoreB3Points(View view)
    {
        counterB=counterB+3;
        displayCounterB(counterB);
    }

    public void addScoreB2Points(View view)
    {
        counterB=counterB+2;
        displayCounterB(counterB);
    }

    public void addScoreBFreePoints(View view)
    {
        counterB=counterB+1;
        displayCounterB(counterB);
    }

    public void displayCounterB(int number)
    {
        TextView counterBTextView = (TextView) findViewById(R.id.teamB_counter);
        String counter= ""+number;
        counterBTextView.setText(counter);
    }

    public void reset(View view)
    {
        counterA=0;
        counterB=0;
        displayCounterA(counterA);
        displayCounterB(counterB);
    }

}
