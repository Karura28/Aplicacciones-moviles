package com.example.vanessatrevizo.eval2_9_clima;

/**
 * Created by Vanessa Trevizo on 16/03/2018.
 */

public class Clima {
    private int image;
    private String ciudad;
    private int tem;
    private String desClima;


    public Clima(int image, String ciudad, int tem, String desClima) {
        this.image = R.drawable.sunny;
        this.ciudad = "Chihuahua";
        this.tem = 30;
        this.desClima = "Soleado despejado";
    }


    public Clima(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getTem() {
        return tem;
    }

    public void setTem(int tem) {
        this.tem = tem;
    }

    public String getDesClima() {
        return desClima;
    }

    public void setDesClima(String desClima) {
        this.desClima = desClima;
    }
}
