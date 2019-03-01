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

public class Dollars {
    
    public static void main(String[] args) {
        Integer dollars,dolar, veinte=0, diez=0, cinco=0;
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Cantidad de doalres : ");
        dollars = sc.nextInt();
        dolar = dollars;
        veinte = (dollars-(dollars%20))/20;
        dollars = dollars - veinte*20;
        diez = (dollars-(dollars%10))/10;
        dollars = dollars - diez*10;
        cinco = (dollars-(dollars%5))/5;
        dollars = dollars - cinco*5;
        
        System.out.println(dolar +" Los dolares equivalen a:\n Moneda \tTotal ");
        System.out.println(" $20\t\t"+veinte);
        System.out.println(" $10\t\t"+diez);
        System.out.println(" $5 \t\t"+cinco);
        System.out.println(" $1 \t\t"+dollars);
    } 
}
