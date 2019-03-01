/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elements;

/**
 *
 * @author omarcr
 */
public class NonMetalElement extends Element{
    public NonMetalElement(Simbolos s, Integer na, Double ma){
        super(s,na,ma);
    }
    public void describeElement(){
        System.out.println("Simbolo: "+getSimbolo()+" Numero atomico: "+getNumAtomico()+" Masa atomica: "+getMasaAtomica()+"\nLos no metales por lo general son malos conductores"
                + " de calor y electricidad, ademas de tener puntos de fusion bajos.");
    }
}
