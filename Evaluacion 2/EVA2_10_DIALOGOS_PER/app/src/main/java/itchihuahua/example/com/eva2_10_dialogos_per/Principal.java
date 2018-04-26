package itchihuahua.example.com.eva2_10_dialogos_per;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    public void onClick(View v){
        final Dialog dlgMiCuadroDialogo=new Dialog(this);
        dlgMiCuadroDialogo.setContentView(R.layout.custom_layout);

        final TextView txtV_titulo=(TextView)dlgMiCuadroDialogo.findViewById(R.id.txtV_titulo);
        final EditText edtxt_dato=(EditText)dlgMiCuadroDialogo.findViewById(R.id.edtxt_dato);
        final Button btn_dato=(Button)dlgMiCuadroDialogo.findViewById(R.id.btn_dato);

        btn_dato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),edtxt_dato.getText().toString(),Toast.LENGTH_SHORT).show();
                dlgMiCuadroDialogo.dismiss();//Cierre del cuadro de dialogo
            }
        });
        dlgMiCuadroDialogo.show();
    }
}
