package com.aplicacion.nombre.eva1_7_idiomas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Principal extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    TextView txtV_idioma,txtV_nom,txtV_ape,txtV_edad,txtV_genero;
    RadioButton rb_esp,rb_ing,rb_mas,rb_fem;
    EditText edtxt_nom,edtxt_ape,edtxt_edad;
    RadioGroup rgp_idioma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        txtV_idioma=(TextView)findViewById(R.id.txtV_idioma);
        txtV_nom=(TextView)findViewById(R.id.txtV_nombre);
        txtV_ape=(TextView)findViewById(R.id.txtV_apellido);
        txtV_edad=(TextView)findViewById(R.id.txtV_edad);
        txtV_genero=(TextView)findViewById(R.id.txtV_genero);

        rb_esp=(RadioButton)findViewById(R.id.rb_esp);
        rb_ing=(RadioButton)findViewById(R.id.rb_ingles);
        rb_mas=(RadioButton)findViewById(R.id.rb_mas);
        rb_fem=(RadioButton)findViewById(R.id.rb_fem);

        edtxt_nom=(EditText)findViewById(R.id.edtxt_nombre);
        edtxt_ape=(EditText)findViewById(R.id.edtxt_ape);
        edtxt_edad=(EditText)findViewById(R.id.edtxt_edad);

        rgp_idioma=(RadioGroup)findViewById(R.id.rgp_idioma);

        rgp_idioma.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        if(i==R.id.rb_esp){
            txtV_idioma.setText(R.string.idioma_sp);
            txtV_nom.setText(R.string.eti_nom_in);
            txtV_ape.setText(R.string.eti_ape_sp);
            txtV_edad.setText(R.string.eti_edad_sp);
            txtV_genero.setText(R.string.genero_sp);

            rb_esp.setText(R.string.espanol_sp);
            rb_ing.setText(R.string.ingles_sp);
            rb_mas.setText(R.string.mas_sp);
            rb_fem.setText(R.string.fem_sp);

            edtxt_nom.setText(R.string.hint_nom_sp);
            edtxt_ape.setText(R.string.hint_ape_sp);
            edtxt_edad.setText(R.string.hint_edad_sp);
        }else{
            txtV_idioma.setText(R.string.idioma_in);
            txtV_nom.setText(R.string.eti_nom_in);
            txtV_ape.setText(R.string.eti_ape_in);
            txtV_edad.setText(R.string.eti_edad_in);
            txtV_genero.setText(R.string.genero_in);

            rb_esp.setText(R.string.espanol_in);
            rb_ing.setText(R.string.ingles_in);
            rb_mas.setText(R.string.mas_in);
            rb_fem.setText(R.string.fem_in);

            edtxt_nom.setText(R.string.hint_nom_in);
            edtxt_ape.setText(R.string.hint_ape_in);
            edtxt_edad.setText(R.string.hint_edad_in);
        }
    }
}
