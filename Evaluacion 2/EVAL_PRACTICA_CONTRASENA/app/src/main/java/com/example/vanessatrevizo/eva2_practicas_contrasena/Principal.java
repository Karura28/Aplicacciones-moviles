package com.example.vanessatrevizo.eva2_practicas_contrasena;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

    }
    public void oncLick (View v){
        final int[] imagenes={
                R.drawable.lana,
                R.drawable.mariposa,
                R.drawable.midnaxd,
                R.drawable.mipa,
                R.drawable.urobosaxd,

        };

        final Dialog miCuadroDialogo=new Dialog(this);
        miCuadroDialogo.setContentView(R.layout.activity_cuadro_dialogo);
        final ImageView imagen = (ImageView)miCuadroDialogo.findViewById(R.id.imgVwCuadro);
        final EditText etxtNUsu, etxtContra;
        Button btnAceptar, btnCancelar;
        btnAceptar= (Button) miCuadroDialogo.findViewById(R.id. btnAceptar);
        btnCancelar=(Button) miCuadroDialogo.findViewById(R.id. btnCancelar);
        etxtNUsu=(EditText) miCuadroDialogo.findViewById(R.id.etxtNUsu);
        etxtContra=(EditText) miCuadroDialogo.findViewById(R.id.etxtContra);
        int iImagen=  (int)(Math.random()*4.9);
        imagen.setImageResource(imagenes[iImagen]);

        btnAceptar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(etxtNUsu.getText().toString().equals("Karla")&& etxtContra.getText().toString().equals("12345")){
                    Toast.makeText(Principal.this,"loading",Toast.LENGTH_SHORT).show();
                    Intent inSecundaria = new Intent(Principal.this,Secundaria.class);
                    startActivity(inSecundaria);

                }else{
                    Toast.makeText(Principal.this,"Campos vacios",Toast.LENGTH_SHORT).show();
                    miCuadroDialogo.dismiss();
                }
            }
        });
        btnCancelar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                miCuadroDialogo.dismiss();
            }
        });


        miCuadroDialogo.show();
    }
    public void onClickCancel (View v){
        finish();
    }
    }

