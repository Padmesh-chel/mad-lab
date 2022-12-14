package com.example.threading;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    boolean temp = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ProgressBar pbar = (ProgressBar) findViewById(R.id.progressBar1);
        TextView txt = (TextView) findViewById(R.id.textView);
        Button start1Button = (Button) findViewById(R.id.bt_start1);
        Button start2Button = (Button) findViewById(R.id.bt_start2);

        pbar.setMax(100);


        Handler handler = new Handler();
        start2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }
        });

        start1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        int i =0;
                        while(i < 100 && temp){
                           if(i == 40){
                               handler.post(new Runnable() {
                                   @Override
                                   public void run() {
                                       txt.setText("hello");
                                   }
                               });
                           }
                            pbar.setProgress(i);
                            i+=10;
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }).start();
            }
        });
    }
}