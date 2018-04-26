package com.example.vanessatrevizo.eval2_6_bundles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Principal extends AppCompatActivity implements View.OnClickListener{
Button btnEnviar;
EditText ediTexNombre,editTextApellido,editTextsal;
Intent intenviar;
RadioGroup rgGenero;
RadioButton rbMas, rbFem,rbNo;
CheckBox chbSol;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        ediTexNombre =(EditText)findViewById(R.id.editTexNombre);
        editTextApellido=(EditText)findViewById(R.id.editTexApellido);
        editTextsal=(EditText)findViewById(R.id.editTextsal);
        chbSol=(CheckBox)findViewById(R.id.chbSol);
        rgGenero=(RadioGroup)findViewById(R.id.rgGenero);
        rbMas=(RadioButton) findViewById(R.id.rbmas);
        rbFem=(RadioButton)findViewById(R.id.rbfem);
        rbNo=(RadioButton)findViewById(R.id.rbNo);

        btnEnviar= (Button)findViewById(R.id.btnEnviar);
        btnEnviar.setOnClickListener(this);
        intenviar = new  Intent(this,Secundaria.class);
    }

    @Override
    public void onClick(View view) {
        String sNom;
        String sApe;
        double dal;
        int iSex;
        boolean bSoltero;

        sNom = ediTexNombre.getText().toString();
        sApe = editTextApellido.getText().toString();
        dal = Double.parseDouble(editTextsal.getText().toString());


    if(rbMas.isChecked()){
        iSex=0;
    }else if(rbFem.isChecked()){
        iSex=1;
    }else if(rbNo.isChecked()){
        iSex=2;
    }
        bSoltero=chbSol.isChecked();
        Bundle bnDatos= new Bundle();
        bnDatos.putString("Nombre",sNom);
        bnDatos.putString("Apellido",sApe);
        bnDatos.putDouble("Salario",dal);
       // bnDatos.putInt("Sexo",iSex);
        bnDatos.putBoolean("Soltero",bSoltero);
        intenviar.putExtras(bnDatos);
        startActivity(intenviar);

    }
}
