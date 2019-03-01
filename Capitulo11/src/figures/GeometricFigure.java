/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figures;

/**
 *
 * @author omarcr
 */
public abstract class GeometricFigure implements SidedObject{
    private Double altura;
    private Double ancho;
    
    public GeometricFigure(Double h, Double a){
        altura=h;
        ancho=a;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }
    
    public abstract Double calculeArea();
    
    public String toString(){
        return "Base: "+getAncho()+" Altura: "+getAltura()+" Area: "+calculeArea()+" Numero de lados: "+displaySides();
    }
}
