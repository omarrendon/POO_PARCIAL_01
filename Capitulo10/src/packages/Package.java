/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packages;

/**
 *
 * @author omarcr
 */
public class Package {
    private Double peso;
    private MetodosDeEnvio metodoDeEnvio;
    private Double costoDeEnvio;
    public Package(Double p, MetodosDeEnvio m){
        peso=p;
        metodoDeEnvio=m;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public MetodosDeEnvio getMetodoDeEnvio() {
        return metodoDeEnvio;
    }

    public void setMetodoDeEnvio(MetodosDeEnvio metodoDeEnvio) {
        this.metodoDeEnvio = metodoDeEnvio;
    }

    public Double getCostoDeEnvio() {
        return costoDeEnvio;
    }

    public void setCostoDeEnvio(Double costoDeEnvio) {
        this.costoDeEnvio = costoDeEnvio;
    }
    
    
    public void calculateCost(){
        if(peso>=1 && peso<=8){
            switch(metodoDeEnvio){
                case A:
                    costoDeEnvio=2d;
                break;
                case T:
                    costoDeEnvio=1.5;
                break;
                case M:
                    costoDeEnvio=0.5;
                break;
            }
        }
        if(peso>=9 && peso<=16){
            switch(metodoDeEnvio){
                case A:
                    costoDeEnvio=3d;
                break;
                case T:
                    costoDeEnvio=2.35;
                break;
                case M:
                    costoDeEnvio=1.5;
                break;
            }
        }
        if(peso>=17){
            switch(metodoDeEnvio){
                case A:
                    costoDeEnvio=4.5;
                break;
                case T:
                    costoDeEnvio=3.25;
                break;
                case M:
                    costoDeEnvio=2.15;
                break;
            }
        }
    }
    
    public void display(){
        calculateCost();
        System.out.println("Peso: "+getPeso()+" onzas.\nMetodo de envio: "+getMetodoDeEnvio()+"\nCosto de envio: $"+getCostoDeEnvio());
    }
}
