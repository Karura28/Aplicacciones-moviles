package com.example.vanessatrevizo.eval1_11_listasimagenes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Principal extends AppCompatActivity implements View.OnClickListener{
    ListView Listavw;
    String[] aaLista = {"Flor 1", "Flor 2", "Flor 3", "Flor 4", "Flor 5"};
ImageView[] aaImagenes={ };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }


    @Override
    public void onClick(View view) {
    }
    }
}
