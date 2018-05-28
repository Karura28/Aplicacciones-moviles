package com.example.vanessatrevizo.eval3_15_media_player;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Principal extends AppCompatActivity {
    MediaPlayer mprepro = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        mprepro = MediaPlayer.create(getApplicationContext(),R.raw.db);
    }

    @Override
    protected void onStart() {
        super.onStart();
        if(mprepro !=null){
            mprepro.start();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(mprepro != null){
            mprepro.stop();
            mprepro.release();
        }
    }
}
