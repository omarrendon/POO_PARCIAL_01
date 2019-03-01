/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cabins;

/**
 *
 * @author omarcr
 */
public class CabinRental {
    private Integer numeroDeCabina;
    private Double precioSemanal;
    
    public CabinRental(Integer n){
        numeroDeCabina=n;
        if(numeroDeCabina==1 || numeroDeCabina==2 || numeroDeCabina==3)
            precioSemanal=950d;
        else
            precioSemanal=1100d;
    }
    void setPrecioSemanal(Double p){
        precioSemanal=p;
    }

    public Integer getNumeroDeCabina() {
        return numeroDeCabina;
    }

    public Double getPrecioSemanal() {
        return precioSemanal;
    }
    
    public String toString(){
        return getNumeroDeCabina()+" $"+getPrecioSemanal();
    }
}
