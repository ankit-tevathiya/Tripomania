package com.example.pranjal.secondproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

public class goamain extends AppCompatActivity {
    Animation Fade_in,Fade_out;
    ViewFlipper viewFlipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goamain);
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
        Intent i=new Intent(this,gculture.class);
        //i.setData(Uri.parse("https://www.yatra.com/india-tourism/agra/culture"));
        startActivity(i);

    }
    public void onClick2(View v){
        Intent i=new Intent(this,glifestyle.class);
        // i.setData(Uri.parse("https://www.yatra.com/india-tourism/agra/people"));
        startActivity(i);

    }
    public void onClick3(View v){
        Intent i=new Intent(this,gtourist.class);
        //  i.setData(Uri.parse("https://www.yatra.com/india-tourism/agra-travel-guide"));
        startActivity(i);

    }public void onClick4(View v){
        Intent i=new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.yatra.com/hotels/hotels-in-goa"));
        startActivity(i);

    }public void onClick5(View v){
        Intent i=new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.yatra.com/india-tourism/goa/how-to-reach"));
        startActivity(i);

    }public void onClick6(View v){
        Intent i=new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.yatra.com/india-tourism/goa/how-to-reach"));
        startActivity(i);

    }
    public void videogclk(View view){
        Intent i=new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.youtube.com/watch?v=oLYt4VdUQVA"));
        startActivity(i);
    }

}
