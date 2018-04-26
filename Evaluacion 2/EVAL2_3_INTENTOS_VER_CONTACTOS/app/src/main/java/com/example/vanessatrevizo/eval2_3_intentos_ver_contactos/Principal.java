package com.example.vanessatrevizo.eval2_3_intentos_ver_contactos;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Principal extends AppCompatActivity implements View.OnClickListener{
 Intent inMostrarcon , inBuscarGoogle, intImagenes;
 Button btnBuscarContacto, btnBuscar;
 EditText editTextBus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        btnBuscar =(Button)findViewById(R.id.btnBuscar);
        btnBuscarContacto= (Button)findViewById(R.id.btnBuscarContacto);
        editTextBus= (EditText)findViewById(R.id.editTextBus);
        String sQueBuscamos = "content://contacts/people";
        //Uri.parse(sQueBuscamos,);
                inMostrarcon = new  Intent(Intent.ACTION_VIEW, Uri.parse(sQueBuscamos));
        intImagenes = new Intent(Intent.ACTION_GET_CONTENT);
        intImagenes.setType("image/pictures/*");
    }

    @Override
    public void onClick(View view) {
        startActivity(inMostrarcon);
    }
    public void otroClick(View view){
        String sBus = editTextBus.getText().toString();
        inBuscarGoogle = new Intent(Intent.ACTION_WEB_SEARCH);
        inBuscarGoogle.putExtra(SearchManager.QUERY, sBus);
        startActivity(inBuscarGoogle);
    }

    public void otromasClick(View view) {

       startActivity(intImagenes);
    }
}
