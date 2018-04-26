package com.example.vanessatrevizo.eval2_7_activity_re;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity implements View.OnClickListener {
Button btnmos;

EditText edtxt;
Intent inLanzarsec;
Intent inBuscar;
final static int SECUNDARIA =100;
    final static int CONTACTOS =200;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        edtxt =(EditText) findViewById(R.id.edtxt);
        btnmos = (Button)findViewById(R.id.btnmos);
       inLanzarsec = new Intent(this,Secundaria.class);
      Uri uriCon = ContactsContract.Contacts.CONTENT_URI;
       inLanzarsec= new Intent(Intent.ACTION_PICK);
    }

    @Override
    public void onClick(View view) {
        startActivityForResult(inLanzarsec,SECUNDARIA):
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == SECUNDARIA){
            if(resultCode == Activity.RESULT_OK){
                String sMensa = data.getExtras().getString("DATO");
                edtxt.setText(sMensa);{
            }
        }else {
                Toast.makeText(this,"ACCION CANCELADA",Toast.LENGTH_SHORT).show();
            }if (requestCode == CONTACTOS){
                if(requestCode == Activity.RESULT_OK){
                    String sNumcon = data.getDataString();
                }

            }



        }
    }
    public void otroClick(View view){
        startActivityForResult(inBuscar,CONTACTOS);
    }
}
