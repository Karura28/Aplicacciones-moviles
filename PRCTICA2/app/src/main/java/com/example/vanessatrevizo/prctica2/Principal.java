package com.example.vanessatrevizo.prctica2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Toast;

public class Principal extends AppCompatActivity {

    RadioButton RbtnRD, RbtnAL, RbtnAsia, RbtnAfrica, RbtnHombre, RbtnMujer;
    RadioGroup RbtnGroupRegion, RbtnGroupGenero;

    EditText ETxtAñoN;
    TextView TxtVwEVida, TxtVwFDeceso;

    int numero1; int numero2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        RbtnRD=(RadioButton)findViewById(R.id.RbtnRD);
        RbtnAL=(RadioButton)findViewById(R.id.RbtnAL);
        RbtnAsia=(RadioButton)findViewById(R.id.RbtnAsia);
        RbtnAfrica=(RadioButton)findViewById(R.id.RbtnAfrica);
        RbtnHombre=(RadioButton)findViewById(R.id.RbtnHombre);
        RbtnMujer=(RadioButton)findViewById(R.id.RbtnMujer);
        ETxtAñoN=(EditText)findViewById(R.id.ETxtAñoN);
        TxtVwEVida=(TextView)findViewById(R.id.TxtVwEVida);
        TxtVwFDeceso=(TextView)findViewById(R.id.TxtVwFDeceso);

        RbtnGroupGenero=(RadioGroup)findViewById((R.id.RbtnGroupGenero));
        RbtnGroupGenero.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                Calcular();
            }
        });


        RbtnGroupRegion=(RadioGroup)findViewById(R.id.RbtnGroupRegion);
        RbtnGroupRegion.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                Calcular();
            }
        });

        //onKeyListener

        ETxtAñoN.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == event.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_ENTER){
                    Calcular();
                    return  true;
                }
                else
                    return false;
            }
        });

    }

    private void Calcular(){


        if(ETxtAñoN.getText().toString().equals("")){
            Toast.makeText(this, "Ingrese un año", Toast.LENGTH_SHORT).show();
        }else{

            int año = Integer.parseInt(ETxtAñoN.getText().toString());
            if(año<1950||año>2010){
                Toast.makeText(this, "Ingrese entre los años de 1950 y 2010", Toast.LENGTH_SHORT).show();
            }else{

                int resultado = 0;

                if (RbtnRD.isChecked()){
                    if (RbtnHombre.isChecked())
                        resultado = ExpectativaRegion(1,1, año);
                    else
                        resultado = ExpectativaRegion(1,2, año);

                } else if (RbtnAL.isChecked()){
                    if (RbtnHombre.isChecked())
                        resultado = ExpectativaRegion(2,1, año);
                    else
                        resultado = ExpectativaRegion(2,2, año);
                } else if (RbtnAsia.isChecked()){
                    if (RbtnHombre.isChecked())
                        resultado = ExpectativaRegion(3,1, año);
                    else
                        resultado = ExpectativaRegion(3,2, año);
                } else if (RbtnAfrica.isChecked()){
                    if (RbtnHombre.isChecked())
                        resultado = ExpectativaRegion(4,1, año);
                    else
                        resultado = ExpectativaRegion(4,2, año);
                }

                TxtVwEVida.setText(resultado + "");
                TxtVwFDeceso.setText(año+resultado+"");
            }

        }}

    public int ExpectativaRegion(int region, int genero, int año){
        int expectativa_vida = 0;
        int diferencia = 0;

        if (año < 1960){
            switch (region){
                case 1:
                    expectativa_vida = 75;
                    break;
                case 2:
                    expectativa_vida = 60;
                    break;
                case 3:
                    expectativa_vida=45;
                    break;
                case 4:
                    expectativa_vida=35;
            }

            diferencia = 10;
        } else if (año < 1970){
            switch (region) {
                case 1:
                    expectativa_vida = 75;
                    break;
                case 2:
                    expectativa_vida = 65;
                    break;
                case 3:
                    expectativa_vida = 50;
                    break;
                case 4:
                    expectativa_vida = 45;
            }

            diferencia = 9;
        }else if(año < 1980){
            switch (region){
                case 1:
                    expectativa_vida = 80;
                    break;
                case 2:
                    expectativa_vida = 70;
                    break;
                case 3:
                    expectativa_vida=65;
                    break;
                case 4:
                    expectativa_vida=55;
            }

            diferencia = 8;
        }else if(año < 1990){
            switch (region){
                case 1:
                    expectativa_vida = 80;
                    break;
                case 2:
                    expectativa_vida = 75;
                    break;
                case 3:
                    expectativa_vida=65;
                    break;
                case 4:
                    expectativa_vida=60;
            }

            diferencia = 7;
        }else if(año < 2000){
            switch (region){
                case 1:
                    expectativa_vida = 85;
                    break;
                case 2:
                    expectativa_vida = 75;
                    break;
                case 3:
                    expectativa_vida=60;
                    break;
                case 4:
                    expectativa_vida=55;
            }

            diferencia = 6;
        }else if(año >= 2000){
            switch (region){
                case 1:
                    expectativa_vida = 90;
                    break;
                case 2:
                    expectativa_vida = 70;
                    break;
                case 3:
                    expectativa_vida=65;
                    break;
                case 4:
                    expectativa_vida=60;
            }

            diferencia = 4;
        }

        if(genero==1){
            expectativa_vida=expectativa_vida-diferencia/2;
        }else if(genero==2){
            expectativa_vida=expectativa_vida+diferencia/2;
        }

        // si genero = 1 (hombre)
        //expectativa_vida =  expectativa_vida - diferencia / 2
        // si es mujer
        //expectativa_vida =  expectativa_vida + diferencia / 2


        return expectativa_vida;
    }
}
