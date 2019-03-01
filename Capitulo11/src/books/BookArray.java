/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package books;

/**
 *
 * @author omarcr
 */
public class BookArray {
    public static void useIt(){
        Book[] arrayOfBooks=new Book[10];
        arrayOfBooks[0]=new Fiction("El arte de mentir");
        arrayOfBooks[1]=new NonFiction("Sun Certified Programmer for Java Study Guide");
        arrayOfBooks[2]=new Fiction("La sombra del viento");
        arrayOfBooks[3]=new Fiction("El libro de arena");
        arrayOfBooks[4]=new NonFiction("Precalculo");
        arrayOfBooks[5]=new Fiction("Los armarios negros");
        arrayOfBooks[6]=new Fiction("Siddhartha");
        arrayOfBooks[7]=new NonFiction("Ecuaciones diferenciales");
        arrayOfBooks[8]=new NonFiction("Algebra lineal");
        arrayOfBooks[9]=new Fiction("El juego del angel");
        for(int i=0;i<10;i++){
            System.out.println(arrayOfBooks[i]);
        }
    }
}
