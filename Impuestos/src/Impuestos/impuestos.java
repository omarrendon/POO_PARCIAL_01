/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Impuestos;
import ImpuestosCollection.*;
import ImpuestosObjects.*;
import java.awt.Container;
import java.util.*;
/**
 *
 * @author omarc
 */
public class impuestos {
    public static void main(String[] args) {
        Camioneta camioneta = new Camioneta("ABCD2", "ASKS210601", "HONDA", 2010, 25000.00, 4,Boolean.FALSE);
        System.out.println(camioneta.CalcularTenencia());
        Particular particular = new Particular("ABCD2", "ASKS210602", "NISSAN", 2010, 25000.00, 4);
        System.out.println(particular.CalcularTenencia());
        camion camion = new camion("AJLT53", "ASKS210603", "SUZUKI", 2010, 25000.00, 4, Boolean.FALSE, 4);
        System.out.println(camion.CalcularTenencia());
        taxi taxi = new taxi("ERTYU67", "ASKS210604", "KIA", 2010, 25000.00, 4, 10);
        System.out.println(taxi.CalcularTenencia());
       
        HashMap global = new HashMap();
        global.put(taxi.getPlaca(), taxi.CalcularTenencia());
        StringTokenizer tk = new StringTokenizer(global.toString(), ",");
        while(tk.hasMoreTokens()){
          System.out.println(tk.nextToken());
        }
    }
}
