package com.example.vanessatrevizo.eval3_17_permisos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Principal extends AppCompatActivity {
EditText edtnumero;
Intent intllamar;
Button btnllamar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
edtnumero=(EditText)findViewById(R.id.edtnumero);
btnllamar=(Button)findViewById(R.id.btnllamar);


    }
    public void onClick(View v){

    }

}
