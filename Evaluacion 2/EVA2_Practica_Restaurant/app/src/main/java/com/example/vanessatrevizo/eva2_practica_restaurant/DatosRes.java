package com.example.carloshernandez.eva2_practica_restaurant;

/**
 * Created by Carlos Hernandez on 22/03/2017.
 */

public class DatosRes {
    String sRes, sDir, sTRes, sPlaza, sTel;
    int iImagen, iImagenmini;

    public DatosRes( String sRes, String sTRes,String sDir, String sPlaza, String sTel, int iImagen, int iImagenmini){

        this.sRes=sRes;
        this.sDir=sDir;
        this.sTRes=sTRes;
        this.sPlaza=sPlaza;
        this.sTel=sTel;
        this.iImagen=iImagen;
        this.iImagenmini= iImagenmini;
    }
}
