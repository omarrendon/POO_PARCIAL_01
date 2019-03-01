/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insurances;

/**
 *
 * @author omarcr
 */
public abstract class Insurance {
    private String tipoDePoliza;
    Double costoMensual;
    
    public Insurance(String t){
        tipoDePoliza=t;
    }

    public String getTipoDePoliza() {
        return tipoDePoliza;
    }

    public Double getCostoMensual() {
        return costoMensual;
    }
    
    public abstract void setCostoMensual();
    
    public abstract void display();
}
