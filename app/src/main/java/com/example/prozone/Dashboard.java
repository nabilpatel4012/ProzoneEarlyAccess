package com.example.prozone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Dashboard extends AppCompatActivity {
   // Button projects, freebies, more;
    TextView project, freebie, mores, upload;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        project = findViewById(R.id.projects);
        freebie = findViewById(R.id.freebies);
        mores = findViewById(R.id.more);
        upload = findViewById(R.id.upload);

        project.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Projects.class);
                startActivity(intent);
            }
        });
        freebie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Freebies.class);
                startActivity(intent);
            }
        });
        mores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Login2.class);
                startActivity(intent);
            }
        });
        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Upload.class);
                startActivity(intent);
            }
        });

    }
}