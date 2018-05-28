package com.example.carloshernandez.eva2_practica_asignaturas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class detalle extends AppCompatActivity {
    ImageView imgDocente;
    TextView txtVwAsignatura, txtVwNumeroCreditos, txtVwNombreDocente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
        imgDocente=(ImageView)findViewById(R.id.imgDocente);
        txtVwAsignatura=(TextView)findViewById(R.id.txtVwAsignatura);
        txtVwNumeroCreditos=(TextView)findViewById(R.id.txtVwNumeroCreditos);
        txtVwNombreDocente=(TextView)findViewById(R.id.txtVwNombreDocente);
        //leer los datos
        Intent inDatos = getIntent();
        int iIma=inDatos.getIntExtra("IMAGEN", R.drawable.albusdumbledore);
        String sAsi=inDatos.getStringExtra("ASIGNATURA");
        String sCre=inDatos.getStringExtra("CREDITOS");
        String sDoc=inDatos.getStringExtra("DOCENTE");
        imgDocente.setImageResource(iIma);
        txtVwAsignatura.setText(sAsi);
        txtVwNumeroCreditos.setText(sCre);
        txtVwNombreDocente.setText(sDoc);

    }
}
