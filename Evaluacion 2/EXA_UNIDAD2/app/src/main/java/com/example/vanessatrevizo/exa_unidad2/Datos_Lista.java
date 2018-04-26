package com.example.vanessatrevizo.exa_unidad2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class Datos_Lista extends AppCompatActivity {
TextView txtNombre, txtDescripcion, txtDireccion;
ImageView img;
RatingBar valoracion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos__lista);
        txtNombre =(TextView)findViewById(R.id.txtNombre);
        txtDescripcion=(TextView)findViewById(R.id.txtDescripcion);
        txtDireccion=(TextView)findViewById(R.id.txtDireccion);
        valoracion=(RatingBar)findViewById(R.id.rgValor);



        String nombre = getIntent().getStringExtra("Nombre");
        String descripcion = getIntent().getStringExtra("Descripccion");
        String direccion = getIntent().getStringExtra("Direccion y telefono");

        txtNombre.setText(nombre);
        txtDireccion.setText(direccion);
        txtDescripcion.setText(descripcion);
    }




}
