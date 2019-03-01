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
public abstract class Element {
    private Simbolos simbolo;
    private Integer numAtomico;
    private Double masaAtomica;
    
    public Element(Simbolos s, Integer na, Double ma){
        simbolo=s;
        numAtomico=na;
        masaAtomica=ma;
    }

    public Simbolos getSimbolo() {
        return simbolo;
    }

    public Integer getNumAtomico() {
        return numAtomico;
    }

    public Double getMasaAtomica() {
        return masaAtomica;
    }
    public abstract void describeElement();
}
