package com.example.vanessatrevizo.eval2_9_clima;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalleClima extends AppCompatActivity {
ImageView imgClima;
TextView txtCiudad, txtDesc, txtTemp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_clima);
        imgClima = (ImageView)findViewById(R.id.imgClima);
        txtCiudad =(TextView)findViewById(R.id.txtCiudad);
        txtDesc=(TextView)findViewById(R.id.txtDesc);
        txtTemp=(TextView)findViewById(R.id.txtTem);
    }
}
