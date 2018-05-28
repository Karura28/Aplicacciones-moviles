package com.example.vanessatrevizo.eval3_13_servicios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Principal extends AppCompatActivity {
Intent intento;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

    }
    public void Onclick(){
       startservice(intento);
    }
    public void OnclickDetener(){

    }
}
