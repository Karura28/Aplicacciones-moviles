package com.example.vanessatrevizo.eval3_5_hilos_e_interfaz_grafica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Principal extends AppCompatActivity {
TextView txvwmensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        txvwmensaje = (TextView)findViewById(R.id.txvwmensaje);
        txvwmensaje.setText("Mihilo - Inicio");
    }
    class MIHILO extends Thread{
        @Override
        public void run() {
            super.run();
            for(int i =0; i<20; i++) {
                txvwmensaje.append(i+ "-");
                try {
                    Thread.sleep(500);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
// Reglas para usar hilos
//1 no se puede interactuar con la interfaz graficas desde un hilo de ejecucion
//3 mecanismos para usar la interfaz con hilos
//-HandleMessage * se cominica a traves de menajes
//-metodo post*se comunica atrabes de mensajes usa una pila de mensaje - mensaje y runnable

//clase asynctask
