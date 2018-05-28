package com.example.vanessatrevizo.eval3_16_media_player_servicio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Principal extends AppCompatActivity {
    Intent inservicio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        inservicio = new Intent(this, ServicioMusica.class);
    }
    public void  onClickInicial(View v){
        startService(inservicio);
    }
    public void onClickTerminar(View v){
        stopService(inservicio);
    }
}
