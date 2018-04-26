package itchihuahua.mitec.com.eva2_8_intentos_results;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Principal extends AppCompatActivity {
    Intent inLanzar;
    final static int REQUEST_REST=100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        inLanzar=new Intent(this,lista_restaurantes.class);
    }

    public void miClick(View view) {
        startActivityForResult(inLanzar, REQUEST_REST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==REQUEST_REST && resultCode== Activity.RESULT_OK){ //Verificar cual request se esta ejecutando
                String sCade=data.getExtras().getString("RESTA");
                Toast.makeText(this,sCade,Toast.LENGTH_SHORT).show();
        }
    }
}
