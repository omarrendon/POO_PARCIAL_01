/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horses;

import ejercicio01.Colores;

/**
 *
 * @author omarcr
 */
public class DemoHorses {
    public static void demo() {
        Horse h1=new Horse();
        RaceHorse h2=new RaceHorse();
        Horse h3=new Horse();
        Horse[] arrayHorses={h1,h2,h3};
        h1.setNombre("Caballo 1");
        h1.setColor(Colores.BLANCO);
        h1.setAnioDeNacimiento(2006);
        h2.setNombre("Caballo 2");
        h2.setColor(Colores.NEGRO);
        h2.setAnioDeNacimiento(2003);
        h2.setNumeroDeCarreras(10);
        h3.setNombre("Caballo 3");
        h3.setColor(Colores.BLANCO);
        h3.setAnioDeNacimiento(2010);
        
        System.out.println("Caballos\n");
        for(int i=0;i<arrayHorses.length;i++){
            System.out.println(arrayHorses[i]);
        }
    }
}
