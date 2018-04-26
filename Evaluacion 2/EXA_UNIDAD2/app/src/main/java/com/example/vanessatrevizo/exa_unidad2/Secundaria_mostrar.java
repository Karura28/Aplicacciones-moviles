package com.example.vanessatrevizo.exa_unidad2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import org.apache.http.conn.scheme.LayeredSocketFactory;

import java.util.List;

public class Secundaria_mostrar extends AppCompatActivity implements ListView.OnItemClickListener {
ListView LisMostrar;
Detalle[] dDatos={
        new Detalle("Corazon","Restaurante de tacos","calle mina zapori #1234"),
        new Detalle("Cofi","Restaurante de tacos","calle mina zapori #1234"),
        new Detalle("Sanda","Restaurante de tacos","calle mina zapori #1234"),
        new Detalle("Corazon","Restaurante de tacos","calle mina zapori #1234"),
        new Detalle("Corazon","Restaurante de tacos","calle mina zapori #1234"),
        new Detalle("Corazon","Restaurante de tacos","calle mina zapori #1234"),
        new Detalle("Corazon","Restaurante de tacos","calle mina zapori #1234"),

};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria_mostrar);
        LisMostrar =(ListView)findViewById(R.id.ListMostrar);
        LisMostrar.setAdapter(new customAdapter(this,R.layout.activity_datos__lista,dDatos));
        LisMostrar.setOnItemClickListener(this);


    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent inDetalle = new Intent(this, Datos_Lista.class);
        int iImg= dDatos[i].iImagen;
        String sNom=dDatos[i].sNombre;
        String sDet=dDatos[i].sDescripcion;
        String sDir=dDatos[i].sDireccion;
        inDetalle.putExtra("IMAGEN",iImg);
        inDetalle.putExtra("Nombre",sNom);
        inDetalle.putExtra("Detalle",sDet);
        inDetalle.putExtra("Direccion y telefono",sDir);

        startActivity(inDetalle);
    }
}
