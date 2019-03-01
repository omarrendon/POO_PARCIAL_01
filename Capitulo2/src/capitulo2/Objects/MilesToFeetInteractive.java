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
public class MilesToFeetInteractive extends MilesToFeet{

    public MilesToFeetInteractive(double distancia) {
        super(distancia);
    }

    public MilesToFeetInteractive() {
    }
    
    @Override
    public String toString() {
        return "La distancia de la casa de mi tio es : " + getDistancia() + " o " + Conversion(getDistancia())+ " pies"; //To change body of generated methods, choose Tools | Templates.
    }
}
