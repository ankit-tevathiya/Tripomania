package com.example.pranjal.secondproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

public class delhimain extends AppCompatActivity {
    Animation Fade_in,Fade_out;
    ViewFlipper viewFlipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delhimain);
        viewFlipper =(ViewFlipper) findViewById(R.id.bckgrndViewFlipper1);
        Fade_in= AnimationUtils.loadAnimation(this,android.R.anim.fade_in);
        Fade_out= AnimationUtils.loadAnimation(this,android.R.anim.fade_out);
        viewFlipper.setInAnimation(Fade_in);
        viewFlipper.setOutAnimation(Fade_out);
        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(5000);
        viewFlipper.startFlipping();

    }
    public void onClick1(View v){
        Intent i=new Intent(this,delhiculture.class);
        //i.setData(Uri.parse("https://www.yatra.com/india-tourism/agra/culture"));
        startActivity(i);

    }
    public void onClick2(View v){
        Intent i=new Intent(this,delhilifestyle.class);
        // i.setData(Uri.parse("https://www.yatra.com/india-tourism/agra/people"));
        startActivity(i);

    }
    public void onClick3(View v){
        Intent i=new Intent(this,delhitourism.class);
        //  i.setData(Uri.parse("https://www.yatra.com/india-tourism/agra-travel-guide"));
        startActivity(i);

    }public void onClick4(View v){
        Intent i=new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.yatra.com/hotels/hotels-in-delhi"));
        startActivity(i);

    }public void onClick5(View v){
        Intent i=new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.yatra.com/india-tourism/delhi/how-to-reach"));
        startActivity(i);

    }public void onClick6(View v){
        Intent i=new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.yatra.com/india-tourism/delhi/how-to-reach"));
        startActivity(i);

    }
    public void videodclk(View view){
        Intent i=new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://youtu.be/KYBu0yVDYM0"));
        startActivity(i);
    }
}
