package com.example.vanessatrevizo.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
EditText edtTxtTel, edtTxtMensa;
Button btnmensa;
Intent intmensa;
Intent Intllama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtTxtTel =(EditText)findViewById(R.id.edtTxtTel);
        edtTxtMensa =(EditText)findViewById(R.id.edtTxtMensa);
        btnmensa=(Button)findViewById(R.id.btnmensa);
        btnmensa.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String sTel = "smsto:" + edtTxtTel.getText().toString();
        String sMensa = edtTxtMensa.getText().toString();
        intmensa = new Intent(Intent.ACTION_SENDTO, Uri.parse(sTel) );
        intmensa.putExtra("sms_body",sMensa);
        startActivity(intmensa);
    }
    public void otroClick(View view){
        String sTel = "tel:" + edtTxtTel.getText().toString();
        Intllama= new Intent(Intent.ACTION_CALL, Uri.parse(sTel) );
        startActivity(Intllama);
    }
}
