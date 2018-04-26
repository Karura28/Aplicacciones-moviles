package com.example.vanessatrevizo.eval2_9_clima;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

public class Principal extends AppCompatActivity implements  ListView.OnItemClickListener {
    ListView listVwClima ;

Clima[] cCiudades ={
        new Clima(R.drawable.sunny,"Cuauhtemoc",15,"Soleado despejado"),
        new Clima(R.drawable.cloudy,"Delicias",30,"Nublado"),
        new Clima(R.drawable.cloudy,"Jimenez",25,"Nublado"),
        new Clima(R.drawable.sunny,"Aldama",18,"Soleado despejado"),
        new Clima(R.drawable.light_rain,"Madera",22,"Llovisna"),
        new Clima(R.drawable.sunny,"Casas grandes",19,"Soleado despejado"),
        new Clima(R.drawable.cloudy,"Ojinaga",20,"Nublado"),
        new Clima(R.drawable.sunny,"Parral",35,"Soleado despejado"),
        new Clima(R.drawable.rainy,"Juarez",38,"Lluvia")
};

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        listVwClima=(ListView)findViewById(R.id.listVwClima);
        listVwClima.setAdapter(
                new AdaptadorClima(this,R.layout.lista,cCiudades)
        );
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }
}
