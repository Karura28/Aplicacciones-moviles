package com.example.carloshernandez.eva2_practica_asignaturas;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Carlos Hernandez on 16/04/2017.
 */

public class customAdapter extends ArrayAdapter<datos> {
    Context cntApp;
    int iLayout;
    datos[] dDatos;

    public customAdapter(Context context, int resource, datos[] objects) {
        super(context, resource, objects);
        cntApp= context;
        iLayout= resource;
        dDatos = objects;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vFila= convertView;
        ImageView imgDocente;
        TextView txtVwAsig;
        if (vFila==null){
            LayoutInflater liCrearLayout=((Activity)cntApp).getLayoutInflater();
            vFila= liCrearLayout.inflate(iLayout, parent, false);
        }

        imgDocente=(ImageView)vFila.findViewById(R.id.imgVwCarrera);
        txtVwAsig=(TextView)vFila.findViewById(R.id.txtVwCarrera);
        datos dto = dDatos[position];
        imgDocente.setImageResource(dto.iImAsi);
        txtVwAsig.setText(dto.sAsignatura);

        return vFila;
    }
}
