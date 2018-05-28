package com.example.vanessatrevizo.eval3__11_asynktask_banner;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Principal extends AppCompatActivity {
//TextView txtvw;
ImageView imgvw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
       //txtvw= (TextView)findViewById(R.id.txtvw);
        imgvw = (ImageView)findViewById(R.id.imgvw);
    }
    class MiClaseAsincrona extends AsyncTask<Void,Void,Void> {
        @Override
        protected String doInBackground(Integer... integers) {
            int iCont = integers[0];
            int iTiempo = integers[1];
            for (int i = 0; i < iCont; i++) {

                try {
                    Thread.sleep(iTiempo);
                    publishProgress(i + " -");


                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            return "nada";
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            txtvw.append("FINALIZANSO \n");
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            txtvw.append("INICIANDO: \n");
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);
            txtvw.append(values[0]);
            //sw
        }
    }
}
