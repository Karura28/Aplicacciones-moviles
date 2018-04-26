package com.example.vanessatrevizo.eval2_7_activity_re;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Secundaria extends AppCompatActivity implements View.OnClickListener{
TextView txtDatos;
Intent inDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
        txtDatos = (TextView)findViewById(R.id.txtvwDatos);

    }

    @Override
    public void onClick(View view) {

       // String cade= edtxt.getText().toString();
        String cade = Dato.getText().toString();
        Bundle bDatos = new Bundle();
        bDatos.putString("DATO",cade);
        Intent intent = inDatos.putExtra(bDatos);
        setResult();
    }

    private void setResult() {
    }
}
