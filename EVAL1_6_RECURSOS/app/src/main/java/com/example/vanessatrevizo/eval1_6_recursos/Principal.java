package com.example.vanessatrevizo.eval1_6_recursos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Principal extends AppCompatActivity implements View.OnClickListener{
    Button btnCambiar;
    ImageView imgvwimagen;
    Boolean bBande = false ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        btnCambiar=(Button)findViewById(R.id.btnCambiar);
        btnCambiar.setOnClickListener(this);
        imgvwimagen =(ImageView)findViewById(R.id.imgvwimagen);
    }

    @Override
    public void onClick(View view) {
        if(bBande)
            imgvwimagen.setImageResource(R.drawable.flor);
        else
            imgvwimagen.setImageResource((R.drawable.flor2));
        bBande= !bBande;//negamos el valor de la bandera
    }
}
