
package com.example.carloshernandez.eva2_practica_asignaturas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Principal extends AppCompatActivity implements ListView.OnItemClickListener{
    ListView lstVwAsignaturas;
    datos[] dDatos={
            new datos("Fundamentos de bases de datos"," 4 ","Dolores Umbridge",R.drawable.doloresumbridge,R.drawable.fundamentosbd),
            new datos("Administración de bases de datos"," 4 ","Gilderoy Lockhart",R.drawable.gilderoylockhart,R.drawable.basededatos),
            new datos("Fundamentos de programación"," 5 ","Quirinus Quirrell",R.drawable.quirinusquirrell,R.drawable.dfd),
            new datos("Programación orientada a objetos"," 5 ","Alastor Moody",R.drawable.alastormoody,R.drawable.poo),
            new datos("Estructura de datos"," 5 ","Minerva McGonagall",R.drawable.minervamcgonagall,R.drawable.estructuradedatos),
            new datos("Aplicaciones para dispositivos moviles"," 5 ","Severus Snape",R.drawable.severussnape,R.drawable.moviles),
            new datos("Aplicaciones para dispositivos moviles"," 5 ","Albus Dumbledore",R.drawable.albusdumbledore,R.drawable.moviles),
            new datos("Redes de computadoras"," 5 ","Remus Lupin",R.drawable.remuslupin,R.drawable.redes)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        lstVwAsignaturas=(ListView)findViewById(R.id.lstVwAsignaturas);
        lstVwAsignaturas.setAdapter(new customAdapter(this,R.layout.activity_datos,dDatos));
        lstVwAsignaturas.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
        Intent inDetalle = new Intent(this, detalle.class);

        int iImg= dDatos[i].iImagen;
        String sAs=dDatos[i].sAsignatura;
        String sCr=dDatos[i].sCreditos;
        String sDo=dDatos[i].sDocente;
        inDetalle.putExtra("IMAGEN",iImg);
        inDetalle.putExtra("ASIGNATURA",sAs);
        inDetalle.putExtra("CREDITOS",sCr);
        inDetalle.putExtra("DOCENTE",sDo);

        startActivity(inDetalle);
    }
}
