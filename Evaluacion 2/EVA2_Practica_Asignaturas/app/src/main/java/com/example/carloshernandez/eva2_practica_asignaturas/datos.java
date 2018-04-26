package com.example.carloshernandez.eva2_practica_asignaturas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class datos  {
    String sAsignatura, sDocente, sCreditos;
    int iImagen,iImAsi;

    public datos(String sAsignatura, String sCreditos, String sDocente, int iImagen,int iImAsi) {
        this.sAsignatura=sAsignatura;
        this.sCreditos=sCreditos;
        this.sDocente= sDocente;
        this.iImagen=iImagen;
        this.iImAsi=iImAsi;
    }
}
