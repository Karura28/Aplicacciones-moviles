package com.example.vanessatrevizo.eval1_11_listas2;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity implements ListView.OnItemClickListener {
    TextView txtvw;
    ListView Listavw;
    String[] aaLista = {"uno","dos","tres","cuatro","cinco","seis","siete",};
    String[] aaLista2 = {"1. Planificar el futuro\n" +
            "Puede sonar un poco duro que nos tengamos planear el futuro de algo que aún no existe pero es así, que pasa si en un futuro tuviéramos problemas de escalabilidad, y sí tuviéramos que migrar las bases de datos de MySql a Oracle, de una buena planificación depende la dificultad en un futuro de realizar cambios en la plataforma que sostiene nuestra aplicación.\n" +
            "\n" +
            "2. Documentación\n" +
            "Documenta todo lo que puedas tu aplicación en especial aquellas partes de la misma que hayan requerido un mayor tiempo de desarrollo, en un futuro cercano te librará de más de un quebradero de cabeza.\n" +
            "\n" +
            "3. No empieces por los pequeños detalles\n" +
            " A menudo es más sencillo plantearse el desarrollo de pequeños servicios cómo pueden ser los RSS o una galería de imágenes, pero es fundamental comenzar por lo que vendrá a ser la base de nuestra aplicación, de este modo podremos ir completando nuestra aplicación en un orden lógico, primero los cimientos…\n" +
            "\n"
    , "1. Planificar el futuro\n" +
            "Puede sonar un poco duro que nos tengamos planear el futuro de algo que aún no existe pero es así, que pasa si en un futuro tuviéramos problemas de escalabilidad, y sí tuviéramos que migrar las bases de datos de MySql a Oracle, de una buena planificación depende la dificultad en un futuro de realizar cambios en la plataforma que sostiene nuestra aplicación.\n" +
            "\n" +
            "2. Documentación\n" +
            "Documenta todo lo que puedas tu aplicación en especial aquellas partes de la misma que hayan requerido un mayor tiempo de desarrollo, en un futuro cercano te librará de más de un quebradero de cabeza.\n" +
            "\n" +
            "3. No empieces por los pequeños detalles\n" +
            " A menudo es más sencillo plantearse el desarrollo de pequeños servicios cómo pueden ser los RSS o una galería de imágenes, pero es fundamental comenzar por lo que vendrá a ser la base de nuestra aplicación, de este modo podremos ir completando nuestra aplicación en un orden lógico, primero los cimientos…\n" +
            "\n"
    , "1. Planificar el futuro\n" +
            "Puede sonar un poco duro que nos tengamos planear el futuro de algo que aún no existe pero es así, que pasa si en un futuro tuviéramos problemas de escalabilidad, y sí tuviéramos que migrar las bases de datos de MySql a Oracle, de una buena planificación depende la dificultad en un futuro de realizar cambios en la plataforma que sostiene nuestra aplicación.\n" +
            "\n" +
            "2. Documentación\n" +
            "Documenta todo lo que puedas tu aplicación en especial aquellas partes de la misma que hayan requerido un mayor tiempo de desarrollo, en un futuro cercano te librará de más de un quebradero de cabeza.\n" +
            "\n" +
            "3. No empieces por los pequeños detalles\n" +
            " A menudo es más sencillo plantearse el desarrollo de pequeños servicios cómo pueden ser los RSS o una galería de imágenes, pero es fundamental comenzar por lo que vendrá a ser la base de nuestra aplicación, de este modo podremos ir completando nuestra aplicación en un orden lógico, primero los cimientos…\n" +
            "\n" , "1. Planificar el futuro\n" +
            "Puede sonar un poco duro que nos tengamos planear el futuro de algo que aún no existe pero es así, que pasa si en un futuro tuviéramos problemas de escalabilidad, y sí tuviéramos que migrar las bases de datos de MySql a Oracle, de una buena planificación depende la dificultad en un futuro de realizar cambios en la plataforma que sostiene nuestra aplicación.\n" +
            "\n" +
            "2. Documentación\n" +
            "Documenta todo lo que puedas tu aplicación en especial aquellas partes de la misma que hayan requerido un mayor tiempo de desarrollo, en un futuro cercano te librará de más de un quebradero de cabeza.\n" +
            "\n" +
            "3. No empieces por los pequeños detalles\n" +
            " A menudo es más sencillo plantearse el desarrollo de pequeños servicios cómo pueden ser los RSS o una galería de imágenes, pero es fundamental comenzar por lo que vendrá a ser la base de nuestra aplicación, de este modo podremos ir completando nuestra aplicación en un orden lógico, primero los cimientos…\n" +
            "\n", "1. Planificar el futuro\n" +
            "Puede sonar un poco duro que nos tengamos planear el futuro de algo que aún no existe pero es así, que pasa si en un futuro tuviéramos problemas de escalabilidad, y sí tuviéramos que migrar las bases de datos de MySql a Oracle, de una buena planificación depende la dificultad en un futuro de realizar cambios en la plataforma que sostiene nuestra aplicación.\n" +
            "\n" +
            "2. Documentación\n" +
            "Documenta todo lo que puedas tu aplicación en especial aquellas partes de la misma que hayan requerido un mayor tiempo de desarrollo, en un futuro cercano te librará de más de un quebradero de cabeza.\n" +
            "\n" +
            "3. No empieces por los pequeños detalles\n" +
            " A menudo es más sencillo plantearse el desarrollo de pequeños servicios cómo pueden ser los RSS o una galería de imágenes, pero es fundamental comenzar por lo que vendrá a ser la base de nuestra aplicación, de este modo podremos ir completando nuestra aplicación en un orden lógico, primero los cimientos…\n" +
            "\n","1. Planificar el futuro\n" +
            "Puede sonar un poco duro que nos tengamos planear el futuro de algo que aún no existe pero es así, que pasa si en un futuro tuviéramos problemas de escalabilidad, y sí tuviéramos que migrar las bases de datos de MySql a Oracle, de una buena planificación depende la dificultad en un futuro de realizar cambios en la plataforma que sostiene nuestra aplicación.\n" +
            "\n" +
            "2. Documentación\n" +
            "Documenta todo lo que puedas tu aplicación en especial aquellas partes de la misma que hayan requerido un mayor tiempo de desarrollo, en un futuro cercano te librará de más de un quebradero de cabeza.\n" +
            "\n" +
            "3. No empieces por los pequeños detalles\n" +
            " A menudo es más sencillo plantearse el desarrollo de pequeños servicios cómo pueden ser los RSS o una galería de imágenes, pero es fundamental comenzar por lo que vendrá a ser la base de nuestra aplicación, de este modo podremos ir completando nuestra aplicación en un orden lógico, primero los cimientos…\n" +
            "\n"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        txtvw=(TextView)findViewById(R.id.txtvw);
        Listavw=(ListView)findViewById(R.id.Listavw);
        ArrayAdapter<String> aaDatos = new ArrayAdapter(this,android.R.layout.simple_list_item_1,aaLista);
        Listavw.setAdapter(aaDatos);
        Listavw.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        txtvw.setText(aaLista2[i]);
        //Alert dialog
        new AlertDialog.Builder(this).setTitle("Selección de la lista").setMessage(aaLista[i]).setIcon(R.drawable.ic_launcher_background)
                //Botones
        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(),"Pues OK", Toast.LENGTH_SHORT).show();

            }
        })
                .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(),"Cancelar :p", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNeutralButton("que haces", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(),"neutral",Toast.LENGTH_SHORT).show();
                    }
                });

    }
}
