package com.example.vanessatrevizo.exa_unidad2;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Vanessa Trevizo on 21/04/2018.
 */

public class customAdapter extends ArrayAdapter {
    Context cntApp;
    int iLayout;
    Detalle[] dDatos;

    public customAdapter(@NonNull Context context, int resource, Detalle[] objects) {
        super(context, resource, objects);
        cntApp = context;
        iLayout = resource;
        dDatos = objects;

    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View vFila = convertView;
        ImageView imgRes;
        TextView txtVwNombre;
        if (vFila == null) {
            LayoutInflater liCrearLayout = ((Activity) cntApp).getLayoutInflater();
            vFila = liCrearLayout.inflate(iLayout, parent, false);
        }
            imgRes = (ImageView) vFila.findViewById(R.id.imgRes);
            txtVwNombre = (TextView) vFila.findViewById(R.id.txtNombre);
            Detalle dto = dDatos[position];
            imgRes.setImageResource(dto.iImAsi);
            txtVwNombre.setText(dto.sNombre);

            return vFila;

    }
}
