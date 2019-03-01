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
public class MilesToFeet {
    private final Integer piesEnMillas = 5280;
    private double distancia;
    private double calculo;

    public MilesToFeet(double distancia) {
        this.distancia = distancia;
    }
    public MilesToFeet() {
        
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    
    public double Conversion(double distancia){
          calculo = this.distancia * this.piesEnMillas; 
        return  calculo;
    }

    @Override
    public String toString() {
        return " La distacia de la casa de mi tio es de " + getDistancia() + " o " + Conversion(8.5) + "se está cardados ";
    }
}
