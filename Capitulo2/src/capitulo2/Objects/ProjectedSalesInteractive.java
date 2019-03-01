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
public class ProjectedSalesInteractive extends ProjectedSales {

    public ProjectedSalesInteractive(double norte, double sur) {
        super(norte, sur);
    }

    public ProjectedSalesInteractive() {
        
    }
    
    @Override
    public String toString() {
        return "LAS VENTAS DEL NORTE SON :" + getNorte() + "MAS EL AUMENTO QUEDA UN OTAL DE :" + AumentoNorte(getNorte()) + "\n"
                + "LAS VENTAS DEL SUR SON " + getSur() + "MAS EL AUMENTO QUEDA UN TOTAL DE : " + AumentoSur(getSur());
    }
    
    
}
