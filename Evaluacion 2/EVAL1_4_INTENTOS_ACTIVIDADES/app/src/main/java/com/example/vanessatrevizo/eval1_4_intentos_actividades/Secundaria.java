package com.example.vanessatrevizo.eval1_4_intentos_actividades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Secundaria extends AppCompatActivity implements View.OnClickListener{
Button btncerrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
        btncerrar=(Button)findViewById(R.id.btncerrar);
    }

    @Override
    public void onClick(View view) {
        finish();
    }
}
