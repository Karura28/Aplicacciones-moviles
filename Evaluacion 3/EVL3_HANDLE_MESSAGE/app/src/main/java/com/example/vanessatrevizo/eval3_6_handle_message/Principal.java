package com.example.vanessatrevizo.eval3_6_handle_message;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Principal extends AppCompatActivity {
TextView Txtvw;
Handler hManejador= new Handler(){
    @Override
    // cada vez que enviemos un mensaje se procesa aqui
    public void handleMessage(Message msg) {
        super.handleMessage(msg);
        String sMensa = (String)msg.obj;
        Txtvw.append(sMensa);
    }
};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        Txtvw=(TextView)findViewById(R.id.Txtvw);
        MiHilo miHilo = new MiHilo();
        miHilo.start();
    }
    class MiHilo extends Thread{
        @Override
        public void run() {
            super.run();
            for(int i=0; i<50;i++){
             try{
                 //aqui envimos el mensaje
                 //Txtvw=(TextView)findViewById(R.id.Txtvw);
                 Message msg=hManejador.obtainMessage(1,i +"-");
                 Thread.sleep(500);
                 hManejador.sendMessage(msg);

             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
            }
        }
    }
}
