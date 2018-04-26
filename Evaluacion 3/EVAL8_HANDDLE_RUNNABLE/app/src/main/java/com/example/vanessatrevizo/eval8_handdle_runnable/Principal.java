package com.example.vanessatrevizo.eval8_handdle_runnable;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Principal extends AppCompatActivity {
    TextView txtvw;
    int iVal = 0;
    Handler hManejador = new Handler();
    Runnable runinteractuarUI = new Runnable() {
        @Override
        public void run() {
            txtvw.append((iVal++) + "-");

        }


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        txtvw = (TextView) findViewById(R.id.txtvw);
        MiHilo miHilo = new MiHilo();
        miHilo.start();
    }

    class MiHilo extends Thread {
        @Override
        public void run() {
            super.run();
            for (int i = 0; i < 50; i++) {
                try {
                    Thread.sleep(1000);
                    hManejador.post(runinteractuarUI);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}