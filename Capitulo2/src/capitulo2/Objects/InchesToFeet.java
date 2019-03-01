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
public class InchesToFeet {
    private final Integer inches = 86;
    
    public InchesToFeet() {
    }

    public Integer getInches() {
        return inches;
    }
    
    @Override
    public String toString() {
        return inches + " se convierten en : " + (inches/12) + " pies y "+ (inches%12) + " pulgadas";
    }

    
    
    
}
