package com.example.vanessatrevizo.eval2_5_trans_datos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Principal extends AppCompatActivity implements View.OnClickListener{
Intent inLanzarsecundaria ;
EditText edtTxtmensa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        edtTxtmensa=(EditText )findViewById(R.id.editTxtmensa);
        inLanzarsecundaria= new Intent(this,Secundaria.class);
    }

    @Override
    public void onClick(View view) {
        String sCade = edtTxtmensa.getText().toString();
        inLanzarsecundaria.putExtra("MENSAJE",sCade);

        startActivity(inLanzarsecundaria);
    }
}
