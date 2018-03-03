package com.example.vanessatrevizo.eva1_4_eventos;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Principal extends AppCompatActivity implements View.OnClickListener {
Context cntContexto;
    Button btnClickList;
Button clikanormal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        cntContexto = getApplicationContext();
        //para recuperar y utilizar la tostada y que no de error
        btnClickList=(Button)findViewById(R.id.btnClickList);
        //Responde al evento listene//
        btnClickList.setOnClickListener(this);
        //asigna el listener//
        clikanormal=(Button)findViewById(R.id.clikanonimo);
        clikanormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText( cntContexto,"que no prro",Toast.LENGTH_SHORT).show();

            }
        });
    }
    public void eventoclik(View v) {
        Toast.makeText( this,"no le pikes :*",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {
        Toast.makeText( this,"no sabes leer ? ",Toast.LENGTH_SHORT).show();
    }
}
