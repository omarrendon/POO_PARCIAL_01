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
public class ProjectedSales {
    private final double aumento = 0.10;
    private double norte, sur, cantidad;
    
    public ProjectedSales(double norte, double sur){
        this.norte = norte;
        this.sur = sur;
    }
    public ProjectedSales(){
        
    }
    public double getNorte(){
        return norte;
    }
    public void setNorte( double norte){
        this.norte = norte;
    }
    public double getSur() {
        return sur;
    }

    public void setSur(double sur) {
        this.sur = sur;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    public double AumentoNorte(double norte){
        return cantidad = (this.aumento * getNorte()) + getNorte();
    }
    public double AumentoSur(double sur) {
        return cantidad = (this.aumento * getSur()) + getSur();
    }

    @Override
    public String toString() {
        return "LAS VENTAS DEL NORTE SON :" + getNorte() + "MAS EL AUMENTO QUEDA UN OTAL DE :" + AumentoNorte(getNorte()) + "\n"
                + "LAS VENTAS DEL SUR SON " + getSur() + "MAS EL AUMENTO QUEDA UN TOTAL DE : " + AumentoSur(getSur());
    }
}
