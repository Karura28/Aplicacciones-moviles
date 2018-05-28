package com.example.carloshernandez.eva2_practica_restaurant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Principal extends AppCompatActivity implements ListView.OnItemClickListener{
    ListView lstVwRes;
    DatosRes[] drDatos={
            new DatosRes( "Barra Fina", "Restaurant Gourmet","Periferico de la juventud #312", "Distrito 1","4254169",R.drawable.barrafina,R.drawable.barrafinamini),
            new DatosRes( "Cafe Dulce Pecado", "Restaurant Cafe","Francisco villa #430", "Plaza Arboledas","4254896",R.drawable.cafeloisl1,R.drawable.cafeloislmini),
            new DatosRes( "cafe Canela Fina", "Restaurant Cafe","Periferico de la juventud #522", "Plaza Soberano","4156895",R.drawable.cafelore1,R.drawable.cafeloremini),
            new DatosRes( "italianismo", "Restaurant Gourmet","Periferico de la juventud #322", "Distrito 1","4264686",R.drawable.confessional,R.drawable.confessionalmini),
            new DatosRes( "Sirloin stockade", "Restaurant Gourmet","Periferico de la juventud #517", "Plaza Holliwood","4195426",R.drawable.grahamavenuemeats,R.drawable.grahamavenuemeatsmini)};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        lstVwRes=(ListView)findViewById(R.id.LstVwLista);
        lstVwRes.setAdapter(new customAdapter(this, R.layout.activity_lista_res,drDatos));
        lstVwRes.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
        Intent inDetalle = new Intent(this,DetalleRes.class);

        int iImg =drDatos[i].iImagen;

        String sRe=drDatos[i].sRes;
        String sTRes=drDatos[i].sTRes;
        String sDi=drDatos[i].sDir;
        String sPl=drDatos[i].sPlaza;
        String sTe= drDatos[i].sTel;
        inDetalle.putExtra("IMAGEN",iImg);
        inDetalle.putExtra("RESTAURANT",sRe);
        inDetalle.putExtra("TIPORESTAURANT",sTRes);
        inDetalle.putExtra("DIRECCION",sDi);
        inDetalle.putExtra("PLAZA",sPl);
        inDetalle.putExtra("TELEFONO",sTe);
        startActivity(inDetalle);
    }
}
