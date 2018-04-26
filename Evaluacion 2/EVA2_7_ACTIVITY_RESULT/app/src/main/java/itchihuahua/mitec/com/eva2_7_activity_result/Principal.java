package itchihuahua.mitec.com.eva2_7_activity_result;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity {
    TextView txtV_mostrar;
    Intent inLanzar,inBuscarCon;
    final static int REQUEST_SECUNDARIA=100;
    final static int REQUEST_CONTACTO=200;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        txtV_mostrar=(TextView)findViewById(R.id.txtV_mostrar);
        inLanzar=new Intent(this,Secundaria.class);
        Uri utiCon= android.provider.ContactsContract.Contacts.CONTENT_URI;
        inBuscarCon=new Intent(Intent.ACTION_PICK,utiCon);

    }

    public void Click(View view) {
        startActivityForResult(inLanzar,REQUEST_SECUNDARIA);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==REQUEST_SECUNDARIA){//CUAL CODIGO (ACTIVIDAD) DEVUELVE RESULTADOS
            if(resultCode== Activity.RESULT_OK){//Accion realizada
                //LEER LOS DATOS DEL INTENTO
                String sMensa=data.getExtras().getString("DATO");
                //PONERLOS EN EL TEXTVIEW
                txtV_mostrar.setText(sMensa);
            }else {
                Toast.makeText(this,"Accion cancelada por el usuario",Toast.LENGTH_SHORT).show();
            }
        }else if(requestCode==REQUEST_CONTACTO){
            if(resultCode==Activity.RESULT_OK){
                String sNumerCon=data.getDataString();
                txtV_mostrar.setText("No. contacto: "+sNumerCon);
            }else{
                Toast.makeText(this,"Accion cancelada por el usuario",Toast.LENGTH_SHORT).show();

            }

        }
    }

    public void ClickCon(View view) {
        startActivityForResult(inBuscarCon,REQUEST_CONTACTO);
    }
}
