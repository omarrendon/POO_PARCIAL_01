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

public class Eggs {
    static final double DOZEN = 3.25;
    static final double LOOSE = 0.45;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int eggs, docenas, libres;
        System.out.println("How many eggs did you order? ");
        eggs = input.nextInt();
        docenas = eggs/12;
        libres = eggs%12;
        System.out.print("You ordered "+ eggs +" eggs.");
        System.out.print(" That's "+ docenas +" dozen at $3.25 per dozen and ");
        System.out.print(libres+" loose eggs at 45.0 cents each for a total of $"+ (docenas*DOZEN+libres*LOOSE)+".\n");
    } 
}