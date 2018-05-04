package com.example.pranjal.secondproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splashscreen extends AppCompatActivity {
    private Thread splashThread;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        splashThread = new Thread() {
            @Override
            public void run() {
                try {
                    synchronized (this) {
                        wait(3500);
                    }
                } catch (InterruptedException e) {

                }
                finish();
                Intent i = new Intent(Splashscreen.this, LoginActivity.class);
                startActivity(i);
            }

        };
        splashThread.start();
    }
}
