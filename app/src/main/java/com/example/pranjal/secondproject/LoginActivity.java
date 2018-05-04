package com.example.pranjal.secondproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void loginclk(View view){
        Intent Intent = new Intent(this,ScrollViewHarshit.class);
        startActivity(Intent);
    }
    public void skipclk(View view){
        Intent Intent = new Intent(this,ScrollViewHarshit.class);
        startActivity(Intent);
    }
}
