package com.example.vanessatrevizo.exa_unidad2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Principal extends AppCompatActivity implements View.OnClickListener{
Button btnMostrar, btnSalir, btnCapturar;
Intent intMostrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        btnMostrar= (Button)findViewById(R.id.btnMostrar);
        btnCapturar=(Button)findViewById(R.id.btnCapturar);
        btnSalir=(Button)findViewById(R.id.btnSalir);
    }

    @Override
    public void onClick(View view) {
        finish();

    }
    public void onClickCapturar(View v){
        Intent inSecundaria = new Intent(Principal.this,Secundaria_capturar.class);
        startActivity(inSecundaria);


    }
    public void onClickMostrar (View v){
            Intent inSecundariaMos = new Intent(Principal.this,Secundaria_mostrar.class);
            startActivity(inSecundariaMos);
    }
}
