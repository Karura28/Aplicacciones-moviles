package itchihuahua.mitec.com.eva2_8_intentos_results;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class lista_restaurantes extends AppCompatActivity implements ListView.OnItemClickListener{
    String[] asResta={"Tacos Chihuas","Applebes","China City","Montados la Junta","Sirloin","Boston´s","Ying Yang","La cerve",
    "La Calesa","La Hacienda","Montados de Doña Chona","Sr Camaron","Valcor","La casa del mariachi","La casa de los milagros",
    "La buena sopa","El 5 panes","Montados de Villa","Smokehouse","El puerto","La jaiba feliz"};
    Intent inDatos;

    ListView lsV_lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_restaurantes);
        lsV_lista=(ListView)findViewById(R.id.ltV_lista);
        inDatos=getIntent();
        //CREAR UN ARRAY ADAPTER Y ASIGNARLO A LA LISTA
        ArrayAdapter<String>adListaRes=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,asResta);
        lsV_lista.setAdapter(adListaRes);
        lsV_lista.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Bundle bundle=new Bundle();
        bundle.putString("RESTA",asResta[position]);
        inDatos.putExtras(bundle);
        setResult(Activity.RESULT_OK,inDatos);
        finish();
    }
}
