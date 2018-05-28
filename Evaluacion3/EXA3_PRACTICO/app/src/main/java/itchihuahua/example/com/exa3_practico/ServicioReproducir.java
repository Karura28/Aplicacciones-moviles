package itchihuahua.example.com.exa3_practico;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.IBinder;
import android.widget.Toast;

public class ServicioReproducir extends Service {
    MediaPlayer mpReproductor=null;
    Intent inDatos;
    int pista=0, segundos=0;
    int canciones[]={
            R.raw.latata,
            R.raw.fakelove,
            R.raw.gogo,
            R.raw.blackdress
    };

    public ServicioReproducir() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");

    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
        pista=intent.getIntExtra("SONG",0);
        segundos=intent.getIntExtra("SEGUNDO",0);
        mpReproductor=MediaPlayer.create(getApplicationContext(),canciones[pista]);
        mpReproductor.seekTo(segundos);
        mpReproductor.start();
    }
}
