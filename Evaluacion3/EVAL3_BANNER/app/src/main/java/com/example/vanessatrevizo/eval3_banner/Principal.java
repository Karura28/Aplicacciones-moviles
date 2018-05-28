package com.example.vanessatrevizo.eval3_banner;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Principal extends AppCompatActivity {
    ImageView imgvw;
    int iImagen = 1;


    Handler hManejador = new Handler() {
        @Override
        // cada vez que enviemos un mensaje se procesa aqui
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (iImagen) {
                case 1:
                    imgvw.setImageResource(R.drawable.uno);
                    iImagen++;
                    break;
                case 2:
                    imgvw.setImageResource(R.drawable.dos);
                    iImagen++;
                    break;
                case 3 :
                    imgvw.setImageResource(R.drawable.tres);
                    iImagen++;
                    break;

            }

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        imgvw = (ImageView) findViewById(R.id.imgvw);
        MiHilo miHilo = new MiHilo();
        miHilo.start();
    }

    @Override
    protected void onStop() {
  //
        super.onStop();
        
    }

    class MiHilo extends Thread {
        @Override
        public void run() {
            super.run();
            while (true)
                for (int i = 0; i < 50; i++) {
                    try {
                        //aqui envimos el mensaje
                        //Txtvw=(TextView)findViewById(R.id.Txtvw);
                        Message msg = hManejador.obtainMessage(1, i + "");
                        Thread.sleep(1000);
                        hManejador.sendMessage(msg);
                        //if(onStop)
                            break;

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        }
    }


}
