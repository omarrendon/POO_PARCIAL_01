/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo2.Objects;

/**
 *
 * @author omarc
 */
import java.util.Scanner;

public class DogBoarding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double libras, dias,costo;
        
        System.out.println("Cauntas libras pesa el perro? ");
        libras = sc.nextDouble();
        System.out.println("cuantos dias estará el perro? ");
        dias = sc.nextDouble();
        costo = 0.5 * libras * dias;
        System.out.print("El precio total es: " + costo);
    } 
}
