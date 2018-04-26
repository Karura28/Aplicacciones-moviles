package itchihuahua.mitec.com.eva2_6_bundles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class Principal extends AppCompatActivity implements View.OnClickListener {
    EditText edtxt_nom,edtxt_ape,edtxt_sal;
    RadioButton rb_mas,rb_fem,rb_noesp;
    CheckBox chbx_soltero;
    Button btn_enviar;
    Intent inEviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        edtxt_nom=(EditText)findViewById(R.id.etxt_nombre);
        edtxt_ape=(EditText)findViewById(R.id.etxt_apellido);
        edtxt_sal=(EditText)findViewById(R.id.etxt_sal);
        rb_mas=(RadioButton)findViewById(R.id.rb_mas);
        rb_fem=(RadioButton)findViewById(R.id.rb_fem);
        rb_noesp=(RadioButton)findViewById(R.id.rb_noesp);
        chbx_soltero=(CheckBox)findViewById(R.id.chbx_soltero);
        btn_enviar=(Button)findViewById(R.id.btn_enviar);
        btn_enviar.setOnClickListener(this);
        inEviar=new Intent(this,Secundario.class);
    }

    @Override
    public void onClick(View v) {
        String sNom,sApe;
        double dSal;
        int iSex=-1;
        boolean bSoltero;
        sNom=edtxt_nom.getText().toString();
        sApe=edtxt_ape.getText().toString();
        dSal=Double.parseDouble(edtxt_sal.getText().toString());
        if(rb_mas.isChecked()){
            iSex=0;
        }else if(rb_fem.isChecked()){
            iSex=1;
        }else if(rb_noesp.isChecked()){
            iSex=2;
        }
        bSoltero=chbx_soltero.isChecked();
        Bundle bnDatos= new Bundle();
        bnDatos.putString("Nombre",sNom);
        bnDatos.putString("Apellido",sApe);
        bnDatos.putDouble("Salario",dSal);
        bnDatos.putInt("Sexo",iSex);
        bnDatos.putBoolean("Soltero",bSoltero);
        inEviar.putExtras(bnDatos);
        startActivity(inEviar);
    }
}
