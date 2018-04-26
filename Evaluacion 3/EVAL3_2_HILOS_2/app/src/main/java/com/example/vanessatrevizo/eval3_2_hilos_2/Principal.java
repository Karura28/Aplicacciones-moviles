package com.example.vanessatrevizo.eval3_2_hilos_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        MiHilo miHilo = new MiHilo();
        miHilo.start();

        Thread OtroHilo = new Thread();
    public void run() {
        super.run();
        for (int i =0; i < 1; i++) {
            try {
                Thread.sleep(500);
                Log.wtf("Otro hilo","Adios mundo !!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
        OtroHilo.start();
    }

