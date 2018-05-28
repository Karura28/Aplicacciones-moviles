package com.example.vanessatrevizo.exam3;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class Principal extends AppCompatActivity implements ListView.OnItemClickListener {
Button btnDetener, btnPausa, btnSiguiente;

Intent inservicio;
    MediaPlayer mpRep = null;
    int posicion = 0;
    ListView lvwCanciones;

    String[] aaLista = {"uno","dos","tres","cuatro","cinco","seis","siete",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        btnDetener= (Button)findViewById(R.id.btnDetener);
        btnPausa=(Button)findViewById(R.id.btnPausa);
        btnSiguiente=(Button)findViewById(R.id.btnSiguiente);
        lvwCanciones=(ListView)findViewById(R.id.lvwMusica);
        ArrayAdapter<String> aaDatos = new ArrayAdapter(this,android.R.layout.simple_list_item_1,aaLista);
        lvwCanciones.setAdapter(aaDatos);
        lvwCanciones.setOnItemClickListener(this);

    }
    public void onClickInicial(View v){
        startService(inservicio);
    }
    public void onClickTerminar(View v){
        stopService(inservicio);
    }
public void onClicPausa(View v){onPause(inservicio);}

    private void onPause(Intent inservicio) {

            if (mpRep != null && mpRep.isPlaying()) {
                posicion = mpRep.getCurrentPosition();
                mpRep.pause();
            }

        }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        int i = 0;
        new AlertDialog.Builder(this).setTitle("Selección de la lista").setMessage(aaLista[i]).setIcon(R.drawable.ic_launcher_background)
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


















