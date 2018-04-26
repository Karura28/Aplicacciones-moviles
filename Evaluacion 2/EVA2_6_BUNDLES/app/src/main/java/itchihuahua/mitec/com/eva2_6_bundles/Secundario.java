package itchihuahua.mitec.com.eva2_6_bundles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Secundario extends AppCompatActivity {
    TextView txtV_mostrar;
    Intent inRecibir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundario);
        txtV_mostrar=(TextView)findViewById(R.id.txtV_mostrar);
        Bundle bnDatos=getIntent().getExtras();
        txtV_mostrar.append("Nombre: "+bnDatos.getString("Nombre")+"\n");
        txtV_mostrar.append("Apellido: "+bnDatos.getString("Apellido")+"\n");
        txtV_mostrar.append("Salario: "+bnDatos.getDouble("Salario")+"\n");
        switch (bnDatos.getInt("Sexo")){
            case 0: txtV_mostrar.append("Sexo: Masculino"+"\n");
                break;
            case 1: txtV_mostrar.append("Sexo: Femenino"+"\n");
                break;
            case 2: txtV_mostrar.append("Sexo: No especificado"+"\n");
                break;
            case -1: txtV_mostrar.append("Sexo: Sin responder"+"\n");
                break;
        }
        if(bnDatos.getBoolean("Soltero")==true){
            txtV_mostrar.append("Estado Civil: Soltero"+"\n");
        }else{
            txtV_mostrar.append("Estado Civil: Casado"+"\n");
        }
    }
}
