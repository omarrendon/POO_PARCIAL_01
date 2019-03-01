/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo2;

import capitulo2.Objects.*;
import java.util.Scanner;

/**
 *
 * @author omarc
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //OBJETOS
        Scanner sc = new Scanner(System.in);
        
        
        //MILES TO FEET PRUEBAS 
        MilesToFeet mtf = new MilesToFeet(8.5);
        System.out.println("La distancia es : "+mtf.getDistancia());
        System.out.println(mtf.toString());
        
        //MILES TO FEET INTERACTIVE PRUEBAS
        MilesToFeetInteractive mi = new MilesToFeetInteractive();
        double x;
        System.out.println("\nIngrese la distancia :");
        x = sc.nextDouble();
        mi.setDistancia(x);
        System.out.println(mi.toString());
        System.out.println("\n");
        //PROJECTED SALES PRUEBAS
        ProjectedSales ps = new ProjectedSales(4000, 5500);
        System.out.println(ps.toString());
        
        //PROJECT SALES INTERACTIVE
        ProjectedSalesInteractive pi = new ProjectedSalesInteractive();
        double i, j;
        System.out.println("\nIngrese La cantidad de la tienda NORTE : ");
        i = sc.nextDouble();
        pi.setNorte(i);
        System.out.println("Ingrese La cantidad de la tienda SUR : ");
        j = sc.nextDouble();
        pi.setSur(j);
        System.out.println(pi.toString());
        System.out.println("\n");
        
        //INCHES TO FEET
        InchesToFeet itf = new InchesToFeet();
        System.out.println(itf.toString());
        
        //INCHE TO FEET INTERACTIVE
        InchesToFeetInteractive ii = new InchesToFeetInteractive();
        ii.pregunta();
        System.out.println(ii.toString());
        System.out.println("\n");
        
        //INITIALS
        Initials iii = new Initials();
        System.out.println(iii.toString());
        System.out.println("\n");
        
        //
    }
    
}
