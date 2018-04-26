package com.example.vanessatrevizo.eval3_9_handler_runnables_baner;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Principal extends AppCompatActivity {
TextView txtvw;
int iVal=0;
Handler hManejador = new Handler();
Runnable runinteractuarIU = new Runnable() {
    @Override
    public void run() {
        //switcj
        txtvw.append((iVal++) + "-");
    }
};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        txtvw =(TextView)findViewById(R.id.txtvw);
        MiHilo miHilo = new MiHilo();
        miHilo.start();
    }
    class MiHilo extends Thread {
        @Override
        public void run() {
            super.run();
            while (true)
                for (int i = 0; i < 50; i++) {
                    try {
                        Message msg = hManejador.obtainMessage(1, i + "");
                        Thread.sleep(1000);
                        hManejador.post(runinteractuarIU);


                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        }
    }
}
