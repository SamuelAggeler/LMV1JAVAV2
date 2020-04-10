package com.example.lmv1java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    ViewFlipper slideshowmain;

    int[] imageos={
            R.drawable.slide1,
            R.drawable.slide2,
            R.drawable.slide3,
            R.drawable.slide4

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        slideshowmain=findViewById(R.id.v_flipper);

        for(int i=0;i<imageos.length;i++){
            flip_image(imageos[i]);
        }}

        public void flip_image(int i){
            ImageView view=new ImageView(this);
            view.setBackgroundResource(i);
            slideshowmain.addView(view);
            slideshowmain.setFlipInterval(4000);
            slideshowmain.setAutoStart(true);

            slideshowmain.setInAnimation(this,android.R.anim.slide_in_left);
            slideshowmain.setOutAnimation(this,android.R.anim.slide_out_right);





        ImageButton Houseinfo = findViewById(R.id.btnlmhouseinfo);
        ImageButton Weather = findViewById(R.id.btnlmweather);
        ImageButton Map = findViewById(R.id.btnlmmap);
        ImageButton Contact = findViewById(R.id.btnlmcontact);
        ImageButton Service = findViewById(R.id.btnlmservice);
        ImageButton ClaimReport = findViewById(R.id.btnlmclaimreport);
        ImageButton Surrounding = findViewById(R.id.btnlmsurrounding);
        ImageButton CustomerSatisfaction = findViewById(R.id.btnlmcustomersatisfaction);
        ImageButton AboutUs = findViewById(R.id.btnlmaboutus);
        ImageButton EmergencyNumbers = findViewById(R.id.btnlmemergencynumbers);


        Houseinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int1 = new Intent(MainActivity.this, lmhouseinfo.class);
                startActivity(int1);
            }
        });
        Weather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int2 = new Intent(MainActivity.this, lmweather.class);
                startActivity(int2);
            }
        });


        Map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int3 = new Intent(MainActivity.this, lmmap.class);
                startActivity(int3);
            }
        });


        Contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int4 = new Intent(MainActivity.this, lmcontact.class);
                startActivity(int4);
            }
        });
        Service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int5 = new Intent(MainActivity.this, lmservices.class);
                startActivity(int5);
            }
        });

        ClaimReport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int6 = new Intent(MainActivity.this, lmclaimreport.class);
                startActivity(int6);
            }
        });

        Surrounding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int7 = new Intent(MainActivity.this, lmsurrounding.class);
                startActivity(int7);

            }
        });

        CustomerSatisfaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int8 = new Intent(MainActivity.this, lmcustomersatisfaction.class);
                startActivity(int8);
            }
        });

        AboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent int9 = new Intent(MainActivity.this, lmaboutus.class);
                startActivity(int9);
            }
        });

        EmergencyNumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent int10 = new Intent(MainActivity.this, lmemergencynumbers.class);
                startActivity(int10);
            }
        });






    }}