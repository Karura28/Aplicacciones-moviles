package com.example.vanessatrevizo.eval1_9_colores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int iVal = (int)(Math.random()*10) + 1;
        if(iVal <=5) {
            setTheme(R.style.RedTheme);
        }else{
            setTheme(R.style.GreenTheme);
        }
        setContentView(R.layout.activity_principal);
    }
}
