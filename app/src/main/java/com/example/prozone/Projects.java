package com.example.prozone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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




    }
}