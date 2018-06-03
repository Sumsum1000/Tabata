package com.example.asaf7.github;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ProgressBar progressBar;
    CountDownTimer timer;
    int mySeconds;
    Button btn;
    TextView tvTime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.progress_bar);
        btn = findViewById(R.id.btn);
        tvTime = findViewById(R.id.tv_time);

        progressBar.setMax(600);
        progressBar.setProgress(300
        );

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                timer = new CountDownTimer(5000 + 100,1000) {
                    @Override
                    public void onTick(long l) {

                    }

                    @Override
                    public void onFinish() {

                    }
                };

            }
        });




    }
}
