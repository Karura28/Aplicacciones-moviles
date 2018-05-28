package com.example.vanessatrevizo.exa3_reproductor_de_musica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class detalle extends AppCompatActivity {
    ImageView imgCancion;
    TextView txtVwCancion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
        imgCancion = (ImageView) findViewById(R.id.imgCancion);
        txtVwCancion = (TextView) findViewById(R.id.txtVwCancion);
        //leer los datos
        Intent inDatos = getIntent();
        int iIma = inDatos.getIntExtra("IMAGEN", R.drawable.uno);
        String sCan = inDatos.getStringExtra("CANCION");

        imgCancion.setImageResource(iIma);
        txtVwCancion.setText(sCan);


    }
}
