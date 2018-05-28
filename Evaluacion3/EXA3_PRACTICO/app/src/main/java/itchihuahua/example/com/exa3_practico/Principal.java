package itchihuahua.example.com.exa3_practico;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Principal extends AppCompatActivity {
    Button btn_pp, btn_anterior, btn_siguiente, btn_lista, btn_repetir, btn_aleatoria;
    ImageView imgV_caratula;
    ProgressBar pb_progreso;
    MediaPlayer mpReproductor=null;
    Animation rotacion;
    TextView txtV_titulo;
    Intent inLanzarLista, inLanzarServicio;
    static int REQUEST_LISTA=25;
    int shuffle=0, repetir=0, play=0, posicion=0;
    int pista=0, milisegundos=0, duracionMin=0, duracion=0;
    boolean bBandera=true;
    int canciones[]={
            R.raw.latata,
            R.raw.fakelove,
            R.raw.gogo,
            R.raw.blackdress
    };
    String titulo[]={
            "LATATA","FAKE LOVE","GO GO","BLACK DRESS"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        //VINCULACION DE COMPONENTES
        btn_anterior=(Button)findViewById(R.id.btn_anterior);
        btn_pp=(Button)findViewById(R.id.btn_pp);
        btn_siguiente=(Button)findViewById(R.id.btn_siguiente);
        btn_lista=(Button)findViewById(R.id.btn_lista);
        btn_aleatoria=(Button)findViewById(R.id.btn_aleatoria);
        btn_repetir=(Button)findViewById(R.id.btn_repetir);
        imgV_caratula=(ImageView)findViewById(R.id.imgV_portada);
        txtV_titulo=(TextView)findViewById(R.id.txtV_nombre);
        pb_progreso=(ProgressBar)findViewById(R.id.pb_progreso);

        //INTENTO PARA LANZAR LA LISTA DE CANCIONES
        inLanzarLista=new Intent(this,Lista.class);

        //INTENTO PARA LANZAR EL SERVICIO
        inLanzarServicio=new Intent(this,ServicioReproducir.class);

    }

    public void play(View v){
        play++;

        if (play==1){
            mpReproductor=MediaPlayer.create(this,canciones[pista]);
            txtV_titulo.setText(titulo[pista]);
            rotacion= AnimationUtils.loadAnimation(this,R.anim.rotar);
            imgV_caratula.setAnimation(rotacion);
            imgV_caratula.startAnimation(rotacion);
            pista=0;
            milisegundos=0;
            duracion=0;
            duracionMin=0;
            Drawable drawable = getDrawable(R.drawable.pause);
            btn_pp.setBackground(drawable);
            mpReproductor.start();
            milisegundos=mpReproductor.getDuration();
            duracion=(int)(milisegundos / 1000);
            HiloProgreso hiloProgreso=new HiloProgreso();
            hiloProgreso.execute();
        }else if(play==2){
            Drawable drawable = getDrawable(R.drawable.play);
            btn_pp.setBackground(drawable);
            posicion=mpReproductor.getCurrentPosition();
            mpReproductor.pause();
            bBandera=false;
        }else if (play==3){
            Drawable drawable = getDrawable(R.drawable.pause);
            btn_pp.setBackground(drawable);
            mpReproductor.seekTo(posicion);
            mpReproductor.start();
            play=1;
        }
    }

    public void back(View v){
        espera wait=new espera();
        wait.execute();
        pista--;
        if (pista>=1){
            if (mpReproductor!=null){
                mpReproductor.stop();
                mpReproductor=MediaPlayer.create(this,canciones[pista]);
                txtV_titulo.setText(titulo[pista]);
                mpReproductor.start();
                Drawable drawable = getDrawable(R.drawable.pause);
                btn_pp.setBackground(drawable);
                play=1;
            }else{
                pista=0;
            }
        }else{
            pista=4;
        }


    }

    public void next(View v){

        pista++;
        if (pista<=3){
            if (mpReproductor!=null){
                mpReproductor.stop();
                mpReproductor=MediaPlayer.create(this,canciones[pista]);
                txtV_titulo.setText(titulo[pista]);
                mpReproductor.start();
                Drawable drawable = getDrawable(R.drawable.pause);
                btn_pp.setBackground(drawable);
                play=1;
            }else{
                pista=0;
            }
        }else{
            pista=-1;
        }


    }

    public void stop(View v){
        bBandera=false;
        mpReproductor.stop();
        Drawable drawable = getDrawable(R.drawable.play);
        btn_pp.setBackground(drawable);
        play=0;
        pb_progreso.setProgress(0);
    }

    public void repetir(View v){
        repetir++;
        if (repetir==1) {
            Drawable drawable = getDrawable(R.drawable.repeaton);
            btn_repetir.setBackground(drawable);
        }else if(repetir==0){
            Drawable drawable = getDrawable(R.drawable.repeatoff);
            btn_repetir.setBackground(drawable);
        }else if (repetir==2){
            Drawable drawable = getDrawable(R.drawable.repetiruna);
            btn_repetir.setBackground(drawable);
            repetir=-1;
        }
    }

    public void aleatoria(View v){
        shuffle++;
        if (shuffle==1) {
            Drawable drawable = getDrawable(R.drawable.shuffleon);
            btn_aleatoria.setBackground(drawable);
            shuffle=-1;
        }else if (shuffle==0){
            Drawable drawable = getDrawable(R.drawable.shuffleoff);
            btn_aleatoria.setBackground(drawable);
        }
    }


    public void lista(View v){
        startActivityForResult(inLanzarLista,REQUEST_LISTA);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==REQUEST_LISTA){
            if (resultCode== Activity.RESULT_OK){
                int cancion=data.getExtras().getInt("CANCION");
                int title=data.getExtras().getInt("TITLE");
                if (mpReproductor!=null){
                    mpReproductor.stop();
                    mpReproductor=MediaPlayer.create(this,cancion);
                    txtV_titulo.setText(String.valueOf(titulo[title]));
                    mpReproductor.start();
                    Drawable drawable = getDrawable(R.drawable.pause);
                    btn_pp.setBackground(drawable);
                }else{
                    mpReproductor=MediaPlayer.create(this,cancion);
                    mpReproductor.start();
                    Drawable drawable = getDrawable(R.drawable.play);
                    btn_pp.setBackground(drawable);
                }

            }
        }
    }

    class HiloProgreso extends AsyncTask<Integer,Integer,String>{

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pb_progreso.setMax(100);
        }

        @Override
        protected String doInBackground(Integer... integers) {
            while(bBandera){
                try {
                    Thread.sleep(1000);
                    duracionMin++;
                    int valor=(duracionMin*100)/duracion;
                    publishProgress(valor);
                    if (bBandera==false){
                        break;
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            int iValor=values[0];
            pb_progreso.setProgress(iValor);
        }
    }



    public void salir(View v){
        if (mpReproductor!=null){
            int seg=mpReproductor.getCurrentPosition();
            inLanzarServicio.putExtra("SONG",pista);
            inLanzarServicio.putExtra("SEGUNDO",seg);
            startService(inLanzarLista);
            finish();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"onDestroy",Toast.LENGTH_SHORT).show();
    }

    class espera extends AsyncTask<Integer,Integer,String>{

        @Override
        protected String doInBackground(Integer... integers) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }
    }
}
