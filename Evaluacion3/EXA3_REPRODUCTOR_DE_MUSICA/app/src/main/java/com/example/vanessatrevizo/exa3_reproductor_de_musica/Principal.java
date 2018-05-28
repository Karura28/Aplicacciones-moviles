package com.example.vanessatrevizo.exa3_reproductor_de_musica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Principal extends AppCompatActivity implements ListView.OnItemClickListener {
    ListView lstVwCanciones;
    datos[] dDatos={
    new datos("Balled of the goddeness",R.drawable.uno),
            new datos("Gerudo valley",R.drawable.dos),
            new datos("Kakariko valley",R.drawable.dos),
            new datos("The wind waker",R.drawable.dos),
            new datos("Twilinght princess",R.drawable.dos),
            new datos("The legend of zelda main theme",R.drawable.dos),
            new datos("The legend of zelda",R.drawable.dos),
            new datos("Gran hada",R.drawable.dos),


    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        lstVwCanciones=(ListView)findViewById(R.id.lstVwCanciones);
        lstVwCanciones.setAdapter(new customAdapter(this,R.layout.activity_datos,dDatos));
        lstVwCanciones.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
        Intent inDetalle = new Intent(this, detalle.class);

        int iImg= dDatos[i].iImagen;
        String sCan=dDatos[i].sNombre;
        inDetalle.putExtra("IMAGEN",iImg);
        inDetalle.putExtra("NOMBRE",sCan);


        startActivity(inDetalle);
    }
}
