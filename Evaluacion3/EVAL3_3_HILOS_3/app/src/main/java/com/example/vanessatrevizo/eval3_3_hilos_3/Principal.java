package com.example.vanessatrevizo.eval3_3_hilos_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Principal extends AppCompatActivity {
    boolean bBande = false;

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        Thread OtroHilo = new Thread();
        public void run () {
            super.run();
            //es infinito por que es verdadero
            while (true) {
                for (int i = 0; i < 1; i++) {
                    try {
                        Thread.sleep(500);
                        Log.wtf("Otro hilo", "Adios mundo !!");
                        if (bBande)
                            break;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                }
            }
            OtroHilo.start();
        }
    }
}


