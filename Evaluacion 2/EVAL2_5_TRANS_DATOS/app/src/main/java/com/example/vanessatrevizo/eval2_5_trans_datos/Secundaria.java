package com.example.vanessatrevizo.eval2_5_trans_datos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Secundaria extends AppCompatActivity implements View.OnClickListener {
TextView txtmensa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
        //Recuperar datos
        Intent inDatos = getIntent();
        String sCade = inDatos.getStringExtra("MENSAJE");
        txtmensa.setText(sCade);
    }
    public void onClick(View view){
        finish();
    }
}
