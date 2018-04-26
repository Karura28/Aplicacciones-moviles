package com.example.vanessatrevizo.eval3_2_hilos_2;

import android.util.Log;

/**
 * Created by Vanessa Trevizo on 16/04/2018.
 */

public class MiHilo extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i =0; i < 1; i++) {
            try {
                Thread.sleep(500);
                Log.wtf("Hilo con Thered","Hola mundo !!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }

}
