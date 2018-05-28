package com.example.vanessatrevizo.eval3_practica_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Principal extends AppCompatActivity {
Button btnLanzar;
EditText edtNum1 , edtNum2 ;
TextView txtvwSuma;
Intent intSecundaria;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        edtNum1=(EditText)findViewById(R.id.edtNum1);
        edtNum2=(EditText)findViewById(R.id.edtNum2);
        btnLanzar=(Button)findViewById(R.id.btnLanzar);
        txtvwSuma=(TextView)findViewById(R.id.txtvwSuma);
    }
    public void onClick(View v){
      intSecundaria = new Intent(this,Secundaria.class);

    }
}
