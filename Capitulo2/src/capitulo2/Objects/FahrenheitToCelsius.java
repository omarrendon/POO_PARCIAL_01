/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo2.Objects;

import java.util.Scanner;

/**
 *
 * @author omarc
 */
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        double fahrenheit, celsius;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Cual es la temperatura en grados Fahrenheit? ");
        fahrenheit = sc.nextDouble();
        celsius = (fahrenheit-32.0)/1.8;
        System.out.print("La temperatura en grados celcius es : "+celsius+"\n");
    } 
}
