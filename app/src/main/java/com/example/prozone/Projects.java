package com.example.prozone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Projects extends AppCompatActivity {
    TextView pro1, pro2, pro3, pro4, pro5;
    Button getsupport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projects);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        pro1 = findViewById(R.id.pro1);
        pro2 = findViewById(R.id.pro2);
        pro3 = findViewById(R.id.pro3);
        pro4 = findViewById(R.id.pro4);
        pro5 = findViewById(R.id.pro5);

        getsupport = findViewById(R.id.getsupport);

        pro1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Pro1.class);
                startActivity(intent);
            }
        });
        pro2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Pro2.class);
                startActivity(intent);
            }
        });
        pro3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Pro3.class);
                startActivity(intent);
            }
        });
        pro4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Pro4.class);
                startActivity(intent);
            }
        });
        pro5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Pro5.class);
                startActivity(intent);
            }
        });
        getsupport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://t.me/joinchat/1MJfzHOhoxthOWZl");
            }
        });



    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}