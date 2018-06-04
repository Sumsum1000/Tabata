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
        tvTime = findViewById(R.id.tv_timer);

        progressBar.setMax(10);
        progressBar.setProgress(10);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                timer = new CountDownTimer(10000 + 100,1000) {
                    @Override
                    public void onTick(long l) {

                       mySeconds = (int)l;
                       tvTime.setText(mySeconds/1000 + "");
                       progressBar.setProgress(mySeconds/1000);

                    }

                    @Override
                    public void onFinish() {

                        tvTime.setText("Done");
                        progressBar.setProgress(0);
                    }
                }.start();

            }
        });




    }
}
