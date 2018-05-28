package com.example.vanessatrevizo.examen_uni3;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;

import java.util.ArrayList;

public class Principal extends AppCompatActivity implements ListView.OnItemClickListener {
    Intent inService;
    ListView listVCli;
    int Segundo = 0;
    ArrayList<Integer> previas;
    Context c;
    ImageView imgplay, imgprev, imgnext, imgStop;
    LinearLayout control;
    boolean bandera=true;
    RadioButton RBContinua, RBAleatoria,RBRepetir;
    int idcancion,pos=1;
    Cancion datos[]= new Cancion[]{

            new Cancion("Balled of the goddeness", R.raw.ballad_of_the_goddess, R.drawable.uno),
            new Cancion("Gerudo valley", R.raw.gerudo_valley, R.drawable.dos),
            new Cancion("Kakariko valley", R.raw.kakariko_village, R.drawable.tres),
            new Cancion("The wind waker", R.raw.the_wind_waker_symphonic_movement, R.drawable.cuatro),
            new Cancion("Twilinght princess", R.raw.twilight_princess_symphonic_movement, R.drawable.cinco),
            new Cancion("The legend of zelda main theme", R.raw.the_legend_of_zelda_main_theme, R.drawable.seis),
            new Cancion("The legend of zelda", R.raw.the_legend_of_zelda, R.drawable.siete),
            new Cancion("Gran hada", R.raw.great_fairys_fountain, R.drawable.ocho),

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        c=this.getApplicationContext();
        imgplay=(ImageView) findViewById(R.id.imgplay);
        imgStop=(ImageView) findViewById(R.id.imgStop);
        imgprev=(ImageView) findViewById(R.id.imgPrev);
        imgnext=(ImageView) findViewById(R.id.imgnext);
        RBContinua=(RadioButton)findViewById(R.id.rbContinua);
        RBAleatoria=(RadioButton)findViewById(R.id.RBAleatoria);
        RBRepetir=(RadioButton)findViewById(R.id.RBRepetir);
        control=(LinearLayout)findViewById(R.id.control);
        inService = new Intent(this,MusicPlayer.class);
        listVCli=(ListView)findViewById(R.id.lstCanciones);
        listVCli.setAdapter(new CustomAdapter(this,R.layout.activity_cancion,datos));
        listVCli.setOnItemClickListener(this);
        previas=new ArrayList<>();
        control.setVisibility(View.INVISIBLE);

        imgplay.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if( MusicPlayer.mpReproductor.isPlaying()){
                    MusicPlayer.mpReproductor.pause();
                    imgplay.setImageResource(R.drawable.play);
                }else{ MusicPlayer.mpReproductor.start();
                    imgplay.setImageResource(R.drawable.pause);}

            }
        }));
        imgStop.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) { stopService(inService);
            imgplay.setImageResource(R.drawable.play);
                //control.setVisibility(View.INVISIBLE);

            }
        }));
        imgprev.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prev();
            }
        }));
        //Siguiente
        imgnext.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MiClaseAsincrona miClaseAsincrona=new MiClaseAsincrona();
                miClaseAsincrona.execute(1000);
                next();

            }

        }));

        imgnext.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next();


            }

        }));
    }
    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
        pos=i;
        previas.add(pos);
        control.setVisibility(View.VISIBLE);
        reproducir(pos);
        }
    public void next(){

        if (RBContinua.isChecked()){
            pos+=1;}
        else if(RBAleatoria.isChecked()){

            double r= Math.random();
            if(r<0.4){
                pos=0;
            }
            if(r>0.4&&  r<0.7){
                pos=1;
            }else{pos=2;
            }

        }else if(RBRepetir.isChecked()){
        }

        if(pos>=datos.length){
            pos=0;
        }

        reproducir(pos);
        previas.add(pos);
    }
    public void prev(){
        if (RBContinua.isChecked()){
            pos-=1;}
        if(RBAleatoria.isChecked()){
            if(previas.size()>=1){ pos=previas.get(previas.size()-1);
                previas.remove(previas.size()-1);}
        }
        if (pos<0){
            pos=datos.length-1;
        }
        reproducir(pos);
    }
    public void reproducir(int pos){
        idcancion = datos[pos].cancion;
        inService.putExtra("Cancion",idcancion);
        stopService(inService);
        startService(inService);
        imgplay.setImageResource(R.drawable.pause);
    }


    class MiClaseAsincrona extends AsyncTask<Integer, Integer, Void> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            Segundo=0;
            //txt_temporizador.setText(String.valueOf(Segundo));
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            //txt_temporizador.setText(String.valueOf(Segundo));
            if (Segundo==5){
                next();
                
            }
        }

        @Override
        protected Void doInBackground(Integer... integers) {
            int iTiempo = integers[0];
            for(Segundo=0; Segundo<5; Segundo++) {
                try {
                    Thread.sleep(iTiempo);
                    publishProgress(Segundo);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return null;
        }
    }
}
