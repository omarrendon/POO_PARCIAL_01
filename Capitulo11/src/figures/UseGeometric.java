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
public class UseGeometric {
    public static void useIt(){
        GeometricFigure[] arrayOfFigures=new GeometricFigure[4];
        arrayOfFigures[0]=new Triangle(2d,3d);
        arrayOfFigures[1]=new Square(3d,3d);
        arrayOfFigures[2]=new Square(12d,12d);
        arrayOfFigures[3]=new Triangle(10d,5d);
        for(int i=0;i<arrayOfFigures.length;i++){
            System.out.println(arrayOfFigures[i]);
        }
    }
}
