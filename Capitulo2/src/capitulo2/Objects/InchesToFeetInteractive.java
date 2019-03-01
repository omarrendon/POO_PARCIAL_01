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
public class InchesToFeetInteractive extends InchesToFeet {
    Scanner input = new Scanner(System.in);
    Integer inches;
    public InchesToFeetInteractive() {
    }

    public Integer getInches() {
        return inches;
    }

    public void setInches(Integer inches) {
        this.inches = inches;
    }
    
    public void pregunta() {
        System.out.println("Cuantas Pulgadas quieres convertir?");
        inches= input.nextInt();
    }
    @Override
    public String toString() {
        return inches + " pulgadas, se convierten "+ (inches/12) + " pies y "+ (inches%12) + " pulgadas";
    }
    
}
