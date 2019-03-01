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
public class Triangle extends GeometricFigure{
    public Triangle(Double h, Double a){
        super(h,a);
    }
    
    public Double calculeArea(){
        return (getAltura()*getAncho())/2;
    }
    
    public Integer displaySides(){
        return 3;
    }
}
