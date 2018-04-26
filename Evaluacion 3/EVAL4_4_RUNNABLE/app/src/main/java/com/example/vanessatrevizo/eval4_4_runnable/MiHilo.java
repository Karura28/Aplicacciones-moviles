package com.example.vanessatrevizo.eval4_4_runnable;

import android.util.Log;

/**
 * Created by Vanessa Trevizo on 17/04/2018.
 */

public class MiHilo implements Runnable  {

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            {
                try {
                    Thread.sleep(500);
                    Log.wtf("Runnable", "Hola mundo!!");

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

