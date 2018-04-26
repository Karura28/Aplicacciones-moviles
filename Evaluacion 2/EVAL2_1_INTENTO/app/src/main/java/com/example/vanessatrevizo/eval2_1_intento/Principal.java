package com.example.vanessatrevizo.eval2_1_intento;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Principal extends AppCompatActivity implements View.OnClickListener {
    EditText edttxtTel;
    Intent inLlamar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        edttxtTel= (EditText)findViewById(R.id.edttxtTel);
    }
    @Override
    public void onClick(View v){
        String sCade = edttxtTel.getText().toString();
        //protocolo:numero --> tel:
        sCade = "tel:" + sCade;
        //ACTION_CALL -> necesita permisos
        
        inLlamar = new Intent(Intent.ACTION_DIAL, Uri.parse(sCade));
        startActivity(inLlamar);
    }
}
