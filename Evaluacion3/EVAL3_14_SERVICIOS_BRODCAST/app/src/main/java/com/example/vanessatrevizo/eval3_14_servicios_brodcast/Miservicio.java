package com.example.vanessatrevizo.eval3_14_servicios_brodcast;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import java.io.IOException;

public class Miservicio extends Service {
    Intent inDatos;
    @Override
    public void onDestroy() {
        super.onDestroy();
        inDatos = new Intent("Mi_servicio");
        inDatos.putExtra("Mi_servicio","onDestroy");
        sendBroadcast(inDatos);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.wtf("Servicio","onCreate");
        inDatos = new Intent("Mi_servicio");
        inDatos.putExtra("Mi_servicio","onCreate");
        sendBroadcast(inDatos);
    }

    public Miservicio() {

    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);

        Thread thHilo = new Thread();
        for (int i=0; i<20;i++)
            try {

            } catch (IOException e) {

            }
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
