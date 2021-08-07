package com.example.prozone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Freebies extends AppCompatActivity {
    //Assigning Variables
    TextView tv1,tv2, tv3, tv4, tv5;
    ImageView imageVeiw2, imageVeiw3, imageVeiw4, imageVeiw5, imageVeiw6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_freebies);

        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        tv5 = findViewById(R.id.tv5);

        imageVeiw2 = findViewById(R.id.imageView2);
        imageVeiw3 = findViewById(R.id.imageView3);
        imageVeiw4 = findViewById(R.id.imageView4);
        imageVeiw5 = findViewById(R.id.imageView5);
        imageVeiw6 = findViewById(R.id.imageView6);

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://azure.microsoft.com/en-in/free/students/");
            }
        });
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.arduino.cc/education");
            }
        });
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://atom.io/");
            }
        });
        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.canva.com/education/students/");
            }
        });
        tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://education.github.com/pack");
            }
        });
        imageVeiw2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://azure.microsoft.com/en-in/free/students/");
            }
        });
        imageVeiw3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://azure.microsoft.com/en-in/free/students/");
            }
        });
        imageVeiw4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://azure.microsoft.com/en-in/free/students/");
            }
        });
        imageVeiw5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://azure.microsoft.com/en-in/free/students/");
            }
        });
        imageVeiw6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://azure.microsoft.com/en-in/free/students/");
            }
        });


    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}