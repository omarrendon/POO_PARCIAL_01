/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candles;

import ejercicio01.Colores;

/**
 *
 * @author omarcr
 */
public class Candle {
    private Colores color;
    private Double altura;
    Double precio;

    public Colores getColor() {
        return color;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
        precio=this.altura*2;
    }

    public Double getPrecio() {
        return precio;
    }
    
    public String toString(){
        return getColor()+" "+getAltura()+" "+getPrecio();
    }
   
}
