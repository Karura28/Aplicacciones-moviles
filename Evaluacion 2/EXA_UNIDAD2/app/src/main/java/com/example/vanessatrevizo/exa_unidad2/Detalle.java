package com.example.vanessatrevizo.exa_unidad2;

/**
 * Created by Vanessa Trevizo on 21/04/2018.
 */

public class Detalle {

        String sNombre, sDireccion, sDescripcion;
        int iImagen;

        public Detalle(String sNombre, String sDescripcion, String sDireccion) {
            this.sNombre=sNombre;
            this.sDescripcion=sDescripcion;
            this.sDireccion= sDireccion;
            this.iImagen=iImagen;

        }

    public String getsNombre() {
        return sNombre;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public String getsDireccion() {
        return sDireccion;
    }

    public void setsDireccion(String sDireccion) {
        this.sDireccion = sDireccion;
    }

    public String getsDescripcion() {
        return sDescripcion;
    }

    public void setsDescripcion(String sDescripcion) {
        this.sDescripcion = sDescripcion;
    }

    public int getiImagen() {
        return iImagen;
    }

    public void setiImagen(int iImagen) {
        this.iImagen = iImagen;
    }

    public int getiImAsi() {
        return iImAsi;
    }

    public void setiImAsi(int iImAsi) {
        this.iImAsi = iImAsi;
    }
}
