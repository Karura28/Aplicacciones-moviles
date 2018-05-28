package com.example.vanessatrevizo.eval3_11_camara;

import android.hardware.Camera;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Principal extends AppCompatActivity {
    public static final int MEDIA_TYPE_IMAGE = 1;
    Button btnhilo;
    private Camera mCamera;
    private Camaraview CamaraPreviewmPreview;
    private Camera.PictureCallback mPicture = new Camera.PictureCallback() {

        @Override
        public void onPictureTaken(byte[] data, Camera camera) {

            File pictureFile = getOutputMediaFile(MEDIA_TYPE_IMAGE);
            if (pictureFile == null) {
                int d = Log.d("app camara", "Error creating media file, check storage permissions: " );
                return;
            }

            try {
                FileOutputStream fos = new FileOutputStream(pictureFile);
                fos.write(data);
                fos.close();
            } catch (FileNotFoundException e) {
                Log.d("", "File not found: " + e.getMessage());
            } catch (IOException e) {
                Log.d("", "Error accessing file: " + e.getMessage());
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        mCamera = getCameraInstance();
        //mPreview //
        btnhilo = (Button) findViewById(R.id.bton_hilo);



    }

    public static Camera getCameraInstance() {
        Camera c = null;
        try {
            c = Camera.open(); // attempt to get a Camera instance
        } catch (Exception e) {
            // Camera is not available (in use or does not exist)
        }
        return c;
    }



    public void OnClick(View view) {
        mCamera.takePicture(null, null, mPicture);
    }

    private static File getOutputMediaFile(int type) {
        // To be safe, you should check that the SDCard is mounted
        // using Environment.getExternalStorageState() before doing this.

        File mediaStorageDir = new File(Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES), "MyCameraApp");
        // This location works best if you want the created images to be shared
        // between applications and persist after your app has been uninstalled.

        // Create the storage directory if it does not exist
        if (!mediaStorageDir.exists()) {
            if (!mediaStorageDir.mkdirs()) {
                Log.d("MyCameraApp", "failed to create directory");
                return null;
            }
        }

        return mediaStorageDir;
    }


 // el hilo debe de contar el tiepo para asi tomar una foto con una barra de tiempo cuando se termine tome la foto

    public void otroClick() {
        try {
            MIHILO.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        mCamera.takePicture(null, null, mPicture);
    }


class MIHILO extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 10; i++) {

            try {
                Thread.sleep(500);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
}

        
