/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicles;

/**
 *
 * @author omarcr
 */
public abstract class Vehicle {
    private Integer numeroDeLlantas;
    private Integer millasPorGalon;
    public Vehicle(Integer n, Integer m){
        numeroDeLlantas=n;
        millasPorGalon=m;
    }

    public Integer getNumeroDeLlantas() {
        return numeroDeLlantas;
    }

    public void setNumeroDeLlantas(Integer numeroDeLlantas) {
        this.numeroDeLlantas = numeroDeLlantas;
    }

    public Integer getMillasPorGalon() {
        return millasPorGalon;
    }

    public void setMillasPorGalon(Integer millasPorGalon) {
        this.millasPorGalon = millasPorGalon;
    }
    
    public String toString(){
        return "Numero de llantas: "+getNumeroDeLlantas()+"  Millas por galon: "+getMillasPorGalon();
    }
}
