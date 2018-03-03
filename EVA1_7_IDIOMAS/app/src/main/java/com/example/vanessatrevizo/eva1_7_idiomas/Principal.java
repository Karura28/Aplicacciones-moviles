import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Principal extends AppCompatActivity
        implements RadioGroup.OnCheckedChangeListener{
    TextView txtViewNombre, txtNombre;
    RadioButton radBtnIngles, radBtnEspaniol;
    RadioGroup radGrp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        txtViewNombre =  (TextView)findViewById(R.id.txtViewNombre);
        txtNombre =  (EditText)findViewById(R.id.txtNombre);
        radBtnIngles =  (RadioButton)findViewById(R.id.radBtnIngles);
        radBtnEspaniol =  (RadioButton)findViewById(R.id.radBtnEspaniol);
        radGrp =  (RadioGroup)findViewById(R.id.radGrp);
        radGrp.setOnCheckedChangeListener(this); //this se implementa desde Principal
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) { //i codigo del boton que se selecciona
        if(i == R.id.radBtnEspaniol){
            txtViewNombre.setHint(R.string.hint_nom_sp);
            txtNombre.setText(R.string.eti_nom_sp);
            radBtnIngles.setText(R.string.espaniol_en);
            radBtnEspaniol.setText(R.string.espaniol_sp);
        }else{
            txtViewNombre.setHint(R.string.hint_nom_en);
            txtNombre.setText(R.string.eti_nom_en);
            radBtnIngles.setText(R.string.espaniol_en);
            radBtnEspaniol.setText(R.string.espaniol_en);
        }//else
    }//On Checked Changed
}
