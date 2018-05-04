package com.example.pranjal.secondproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class ScrollViewHarshit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view_harshit);


    }
public void mumbaiclk(View view){
    Intent i1=new Intent(this,mumbaimain.class);
    startActivity(i1);

}
    public void goaclk(View view){
        Intent i2=new Intent(this,goamain.class);
        startActivity(i2);

    }
    public void agraclk(View view){
        Intent i3=new Intent(this,MainActivity.class);
        startActivity(i3);

    }
    public void delhiclk(View view){
        Intent i4=new Intent(this,delhimain.class);
        startActivity(i4);
    }
}
