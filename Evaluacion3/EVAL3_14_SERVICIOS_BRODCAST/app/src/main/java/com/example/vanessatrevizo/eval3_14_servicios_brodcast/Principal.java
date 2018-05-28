package com.example.vanessatrevizo.eval3_14_servicios_brodcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Principal extends AppCompatActivity {
    TextView txtDtos;
    Intent inMiservicio;
    BroadcastReceiver brres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        inMiservicio = new Intent(this, Miservicio.class);
        startService(inMiservicio);
        IntentFilter ifmifiltro = new IntentFilter("Mi_Cadena");
        txtDtos.append(sCade);
    }
    public class MiReceptor extends BroadcastReceiver{
        @Override
        public void onReceive(Context context, Intent intent) {
            txtDtos.append("/n");
            String sCade = intent.getStringExtra("Mi_Cadena");
        }
    }
}
