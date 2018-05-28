package com.example.vanessatrevizo.exam3;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class ServicioMusica extends Service {
    MediaPlayer mpRep = null;
    int posicion = 0;

    public ServicioMusica() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        mpRep = MediaPlayer.create(getApplicationContext(), R.raw.as);
    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
        if (mpRep != null) {
            mpRep.start();
        }
    }

    @Override
    public void onDestroy() {
        if (mpRep != null)
            mpRep.release();
    }

    @Override
    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    @Override
    public void onRebind(Intent intent) {
        if (mpRep != null && mpRep.isPlaying()) {
            posicion = mpRep.getCurrentPosition();
            mpRep.pause();
        }


    }


}
