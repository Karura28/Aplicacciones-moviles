package itchihuahua.example.com.exa3_practico;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import android.net.Uri;
import android.content.ContentResolver;
import android.database.Cursor;
import android.widget.ListView;

public class Lista extends AppCompatActivity implements ListView.OnItemClickListener{
    private ListView songView;
    Intent inDatos;
    int canciones[]={
            R.raw.latata,
            R.raw.fakelove,
            R.raw.gogo,
            R.raw.blackdress
    };
    String titulo[]={
      "LATATA","FAKE LOVE","GO GO","BLACK DRESS"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        songView=(ListView)findViewById(R.id.songView);
        inDatos=getIntent();
        ArrayAdapter<String> titulos = new ArrayAdapter(this, android.R.layout.simple_list_item_1, titulo);
        songView.setAdapter(titulos);
        songView.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Bundle bundle=new Bundle();
        bundle.putInt("CANCION",canciones[position]);
        bundle.putInt("TITLE",position);
        inDatos.putExtras(bundle);
        setResult(Activity.RESULT_OK,inDatos);
        finish();
    }
}
