package com.example.vanessatrevizo.eva1_10_listas;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity implements ListView.OnItemClickListener {
    TextView txtVwMostrar;
    ListView lstVwLista;
    String [] asDatos = {"No","fun","and","too","much","work","make","Karla","a","dull","boy",
            "No","fun","and","too","much","work","make","Karla","a","dull","boy",
            "No","fun","and","too","much","work","make","Karla","a","dull","boy"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        txtVwMostrar=(TextView)findViewById(R.id.txtVwMostrar);
        lstVwLista =(ListView)findViewById(R.id.lstVwLista);
        //Construir Lista
        //1 Adaptador

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) { // int i posicion del click
        txtVwMostrar.setText(asDatos[i]);

        new AlertDialog.Builder(this).setTitle("Selección de la lista").setMessage(asDatos[i]).setIcon(R.drawable.ic_launcher_background)
                //Botones
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(),"Pues OK", Toast.LENGTH_SHORT).show();

                    }
                })
                .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(),"Cancelar :p", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNeutralButton("que haces", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(),"neutral",Toast.LENGTH_SHORT).show();
                    }
                });
    }
}
