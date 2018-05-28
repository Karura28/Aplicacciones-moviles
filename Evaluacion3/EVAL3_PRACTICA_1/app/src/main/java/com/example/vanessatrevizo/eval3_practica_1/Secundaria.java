package com.example.vanessatrevizo.eval3_practica_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Secundaria extends AppCompatActivity {
TextView txtvwNumeros;
Button btnDetener;
Intent intResultados;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
        txtvwNumeros=(TextView)findViewById(R.id.txtvwNumeros);
        btnDetener=(Button)findViewById(R.id.btnDetener);
    }
    public void OnclickDetener(View v){
        intResultados= new Intent(this,Principal.class);

    }
    public void MiHilo(){

    }
}
