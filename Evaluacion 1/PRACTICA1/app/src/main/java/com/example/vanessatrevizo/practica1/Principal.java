package com.example.vanessatrevizo.practica1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity  {

    int iAmericano=20, iCapuchino=48, iExpresso=30, iAzucar=1, iCrema=1, iCantidad, iTCafes, iSTCafes;
    String sDescripcion="",sExtrasD="", sCafesD;
    TextView TxtVwProductos;
    RadioButton RBAmericano, RBCapuchino, RBExpresso;
    CheckBox CBAzucar, CBCrema;
    EditText ETxtCantidad;
    Button btnTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        TxtVwProductos=(TextView) findViewById(R.id.TxtVwProductos);
        RBAmericano=(RadioButton)findViewById(R.id.RBAmericano);
        RBCapuchino=(RadioButton)findViewById(R.id.RBCapuchino);
        RBExpresso=(RadioButton)findViewById(R.id.RBExpresso);
        CBAzucar=(CheckBox)findViewById(R.id.CBAzucar);
        CBCrema=(CheckBox)findViewById(R.id.CBCrema);
        ETxtCantidad=(EditText)findViewById(R.id.ETxtCantidad);
        btnTotal=(Button)findViewById(R.id.btnTotal);
        CBAzucar=(CheckBox)findViewById(R.id.CBAzucar);
        CBCrema=(CheckBox)findViewById(R.id.CBCrema);


        ETxtCantidad.setText("1");
    }
    public void CuantosCafes(){


        sExtrasD="";//inicia el proceso con cadena vacia

        if(RBAmericano.isChecked()){
            iSTCafes=(iAmericano)*(iCantidad);
            sCafesD=(iCantidad+" Americano ");

        }else if(RBCapuchino.isChecked()){
            iSTCafes=(iCapuchino)*(iCantidad);
            sCafesD=(iCantidad+" Capuchino ");

        }else if(RBExpresso.isChecked()){
            iSTCafes=(iExpresso)*(iCantidad);
            sCafesD=(iCantidad+" Expresso ");

        }
        if (CBAzucar.isChecked()&& CBCrema.isChecked()){
            iTCafes=iSTCafes+((iAzucar*iCantidad)+(iCrema*iCantidad));
            sExtrasD=(" Con crema y azucar");
        }else if(CBAzucar.isChecked()){
            iTCafes=iSTCafes+(iAzucar*iCantidad);
            sExtrasD=(iCantidad+" Azucar");
        }else if(CBCrema.isChecked()){
            iTCafes=iSTCafes+(iCrema*iCantidad);
            sExtrasD=(iCantidad+" Crema");
        }else  {
            iTCafes=iSTCafes;

        }
        sDescripcion=(sCafesD+sExtrasD);


    }

    public void onClick(View e) {
        if (ETxtCantidad.getText().toString().equals("")) {
            Toast.makeText(this, "Ingrese cantidad de cafes", Toast.LENGTH_SHORT).show();
        } else {
            iCantidad = Integer.parseInt(ETxtCantidad.getText().toString());


            CuantosCafes();

            TxtVwProductos.setText(sDescripcion);
            //TxtVwProductos.refreshDrawableState();
            Toast.makeText(this, "El total es de $" + iTCafes, Toast.LENGTH_LONG).show();
        }
    }
}





