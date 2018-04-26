package itchihuahua.mitec.com.eva2_7_activity_result;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Secundaria extends AppCompatActivity {
    EditText edtxt_datos;
    Intent inDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
        edtxt_datos=(EditText)findViewById(R.id.edtxt_datos);
        inDatos=getIntent();

    }

    public void Mandar(View view) {
        String sCade=edtxt_datos.getText().toString();
        //PONER LOS DATOS EN EL INTENTO (BUNDLE,EXTRA,ETC)
        Bundle bnDatos=new Bundle();
        bnDatos.putString("DATO",sCade);
        inDatos.putExtras(bnDatos);
        setResult(Activity.RESULT_OK,inDatos);
        finish();
    }
}
