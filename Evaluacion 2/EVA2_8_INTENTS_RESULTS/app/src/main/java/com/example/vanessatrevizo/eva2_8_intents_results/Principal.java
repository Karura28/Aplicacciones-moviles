package com.example.vanessatrevizo.eva2_8_intents_results;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Principal extends AppCompatActivity implements View.OnClickListener {
Intent inResta;
final static int LISTA_REST = 5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    @Override
    public void onClick(View view) {
        startActivityForResult(inResta,LISTA_REST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        requestCode==LISTA_REST{
            if(requestCode== Activity.RESULT_OK)
        }
    }