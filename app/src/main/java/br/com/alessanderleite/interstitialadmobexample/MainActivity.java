package br.com.alessanderleite.interstitialadmobexample;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.google.android.gms.ads.InterstitialAd;

public class MainActivity extends AppCompatActivity {

    private static final long GAME_LENGTH_MILLISECONDS = 3000;

    private InterstitialAd interstitialAd;
    private CountDownTimer countDownTimer;
    private Button retryButton;
    private boolean gameIsInprogress;
    private long timerMilliseconds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
