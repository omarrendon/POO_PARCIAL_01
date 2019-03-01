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
public class DemoCandles {
    public static void demo(){
        Candle c1= new Candle();
        ScentedCandle c2= new ScentedCandle();
        c1.setColor(Colores.ROJO);
        c1.setAltura(5d);
        c2.setColor(Colores.AMARILLO);
        c2.setEsencia(Esencias.CANELA);
        c2.setAltura(5d);
        System.out.println("\nVelas\n"+c1);
        System.out.println(c2);
    }
}
