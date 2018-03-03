package com.example.vanessatrevizo.examen1_calvolumen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;

public class Principal extends AppCompatActivity {
EditText etRadio, etAngulo;
Button btnCalcular;
SeekBar skAngulo;
int R=0, V=0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        etRadio=(EditText)findViewById(R.id.etRadio);
        etAngulo=(EditText)findViewById(R.id.etAngulo);
        btnCalcular=(Button)findViewById(R.id.btnCalcular);
        skAngulo=(SeekBar)findViewById(R.id.skAngulo);
        skAngulo.setOnSeekBarChangeListener(seekBarChangeListener);
        skAngulo.setMax(360);
        skAngulo.setProgress(0);
    }
    private SeekBar.OnSeekBarChangeListener seekBarChangeListener= new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };




        //V = (2/3)*(A*R*3);



}
