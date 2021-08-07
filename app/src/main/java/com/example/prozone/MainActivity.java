package com.example.prozone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    //Assigning Time Delay to static Constant
    private static final int SPLASH_SCREEN = 3000;

    //Defining Varialbles
    Animation topAnim, bottomAnim;
    ImageView logo;
    TextView slogan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_main);

        //Animations
        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        //Hooks
        logo = findViewById(R.id.launcherLogo);
        slogan = findViewById(R.id.slogan);
        //Assigning Animations
        logo.setAnimation(topAnim);
        slogan.setAnimation(bottomAnim);

        //Calling Intent
        new Handler() .postDelayed(() -> {
            Intent intent = new Intent(MainActivity.this,Login.class);
            startActivity(intent);
            finish();
        },SPLASH_SCREEN);
    }
}