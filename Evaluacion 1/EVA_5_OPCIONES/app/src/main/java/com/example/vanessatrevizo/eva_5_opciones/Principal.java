package com.example.vanessatrevizo.eva_5_opciones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Principal extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{

    RadioGroup radiogComida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        radiogComida = (RadioGroup)findViewById(R.id.radiogComida);
        radiogComida.setOnCheckedChangeListener(this);

        }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        double dPrecio=0;
        switch (i) {
            case R.id.rbhamburgesa:
                dPrecio = 100;
                break;
            case R.id.rbalitas:
                dPrecio = 200;
                break;
            case R.id.rbpapas:
                dPrecio = 180;
                break;
            case R.id.rbpizza:
                dPrecio = 100;
                break;
            case R.id.rbtacos:
                dPrecio = 150;
                break;
        }
            Toast.makeText(this,"Precio= "+dPrecio,Toast.LENGTH_SHORT).show();

        }

    }

