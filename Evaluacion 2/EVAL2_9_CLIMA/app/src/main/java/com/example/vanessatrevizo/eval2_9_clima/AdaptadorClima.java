package com.example.vanessatrevizo.eval2_9_clima;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Vanessa Trevizo on 20/03/2018.
 */

public class AdaptadorClima extends ArrayAdapter<Clima> {
Context cnContexto;
int iMiLayout;
Clima[] datos = null;


    public AdaptadorClima(@NonNull Context context, int resource, @NonNull Clima[] objects) {
        super(context, resource, objects);
        cnContexto= context;
        iMiLayout = resource;
        datos = objects;

    }
// get view se encarga de construir una fila perzonalizada lee los datos y los asigna al widgets
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ImageView imgCiudad;
        TextView txtTemp,txtDesc,txtCiudad;

        //identificar si la fila existe si no se debe de creear y si si se debe de rellenar
        View vwMifila = convertView;
        if(vwMifila == null){//la fila no existe de debe de crear
            //el inflar solo existe en una actividad que exista
            LayoutInflater liCrearLayout = ((Activity)cnContexto).getLayoutInflater();
            vwMifila = liCrearLayout.inflate(iMiLayout,parent,false);
        }else{//la fila existe se debe de llenar

        }
        // recuperar los componentes
        txtCiudad = (TextView) vwMifila.findViewById(R.id.txtCiudad);
        txtTemp = (TextView) vwMifila.findViewById(R.id.txtTem);
        txtDesc=(TextView)vwMifila.findViewById(R.id.txtDesc);
        imgCiudad=(ImageView) vwMifila.findViewById(R.id.imgClima);
        imgCiudad.setImageResource(datos[position].getImage());
        txtCiudad.setText(datos[position].getCiudad());
        txtTemp.setText(datos[position].getTem());
        txtDesc.setText(datos[position].getDesClima());
        return vwMifila;
    }
}
