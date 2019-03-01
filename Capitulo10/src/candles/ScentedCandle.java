/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candles;

import ejercicio01.Colores;
import ejercicio01.Esencias;

/**
 *
 * @author omarcr
 */
public class ScentedCandle extends Candle{
    private Esencias esencia;

    public Esencias getEsencia() {
        return esencia;
    }

    public void setEsencia(Esencias esencia) {
        this.esencia = esencia;
    }
    
    public void setAltura(Double altura){
        super.setAltura(altura);
        precio=altura*3;
    }
    
    public String toString(){
        return getColor()+" "+getEsencia()+" "+getAltura()+" "+getPrecio();
    }
}
