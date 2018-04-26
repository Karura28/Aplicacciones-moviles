package com.example.vanessatrevizo.exa_unidad2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Secundaria_capturar extends AppCompatActivity implements View.OnClickListener {
    Button btnGuardar;
    EditText edtNombre, edtDireccion, edtDescripcion;
    ImageView imgResta;
    Intent intEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria_capturar);
        edtNombre = (EditText) findViewById(R.id.edtNombre);
        edtDescripcion = (EditText) findViewById(R.id.edtDescripcion);
        edtDireccion = (EditText) findViewById(R.id.edtDireccion);
        btnGuardar = (Button) findViewById(R.id.btnGuardar);
        imgResta = (ImageView) findViewById(R.id.imgResta);
    }

    @Override
    public void onClick(View view) {
        Intent intEnviar = new Intent(Secundaria_capturar.this, Datos_Lista.class);
        intEnviar.putExtra("Nombre", edtNombre.getText() + "");
        intEnviar.putExtra("Descripccion", edtDescripcion.getText() + "");
        intEnviar.putExtra("Direccion y telefono", edtDireccion.getText() + "");
        intEnviar.putExtra("IMAGEN", imgResta.getImageAlpha());

        startActivityForResult(intEnviar,0);
    }


}



