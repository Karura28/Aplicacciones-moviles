package com.example.vanessatrevizo.eval4_4_runnable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Principal extends AppCompatActivity implements Runnable {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        MiHilo miHiloRun = new MiHilo();
        Thread thHilo = new Thread(miHiloRun);
        thHilo.start();
        Runnable rnHilo = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    {
                        try {
                            Thread.sleep(500);
                            Log.wtf("Runnable-Clase Anonima", "Hola !!");

                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };
        Thread thHilo2 = new Thread((rnHilo));
        thHilo.start();
    }

    @Override
    public void run() {

    }
}
