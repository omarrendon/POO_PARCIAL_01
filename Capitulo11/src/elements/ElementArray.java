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
public class ElementArray {
    public static void useIt(){
        Element[] arrayOfElements=new Element[4];
        arrayOfElements[0]=new MetalElement(Simbolos.LI,3,6.94);
        arrayOfElements[1]=new MetalElement(Simbolos.NA,11,22.98);
        arrayOfElements[2]=new NonMetalElement(Simbolos.O,8,15.99);
        arrayOfElements[3]=new NonMetalElement(Simbolos.CL,17,35.45);
        for(int i=0;i<4;i++){
            arrayOfElements[i].describeElement();
        }
    }
}
