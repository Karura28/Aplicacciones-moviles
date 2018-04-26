package com.example.vanessatrevizo.eval1_4_intentos_actividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Principal extends AppCompatActivity implements View.OnClickListener{
 Button btnLanzar;
    Intent inLanzarSecundaria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        btnLanzar =(Button)findViewById(R.id.btnLanzar);
        //action -->objeto desde donde se ejecuta el inten
        //-->
        
        //intentos implicitos --> actividad externa

        inLanzarSecundaria= new Intent(this,Secundaria.class);
    }
    public void onClick(View v){
   startActivity(inLanzarSecundaria);
    }
}
