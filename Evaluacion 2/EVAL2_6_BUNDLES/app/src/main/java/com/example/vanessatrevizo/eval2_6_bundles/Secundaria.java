package com.example.vanessatrevizo.eval2_6_bundles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Secundaria extends AppCompatActivity implements View.OnClickListener {
  TextView txtvwDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
        txtvwDatos = (TextView)findViewById(R.id.txtvwDatos);
        Intent inDatos = getIntent();
        Bundle bnDatos = inDatos.getExtras();

        txtvwDatos.append("NOMBRE:" + bnDatos.getString("NOMBRE"));
        txtvwDatos.append("APELLIDO:" + bnDatos.getString("APELLIDO"));
        txtvwDatos.append("SALARIO:" + bnDatos.getDouble("SALARIO"));
        switch (bnDatos.getInt("GENERO")){
            case 0:
                txtvwDatos.append("GENERO MASCULINO");
                break;
            case 1:
                txtvwDatos.append("GENERO FEMENINO");
                break;
            case 2 :
                txtvwDatos.append("GENERO NO ESPECIFICO");
                break;

        }
    }

    @Override
    public void onClick(View view) {

    }
}
