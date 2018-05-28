package com.example.vanessatrevizo.eval3_16_media_player_servicio;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class ServicioMusica extends Service {
    MediaPlayer  mprepro = null;
    public ServicioMusica() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        mprepro = MediaPlayer.create(getApplicationContext(),R.raw.hola);

    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
        if(mprepro !=null){
            mprepro.start();
        }
    }

    @Override
    public void onDestroy() {
        if (mprepro != null)
            mprepro.release();
    }
    }

