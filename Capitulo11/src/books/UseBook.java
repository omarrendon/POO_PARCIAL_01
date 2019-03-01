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
public class UseBook {
    public static void demo(){
        Fiction b1=new Fiction("El arte de mentir");
        NonFiction b2=new NonFiction("Sun Certified Programmer for Java Study Guide");
        System.out.println(b1);
        System.out.println(b2);
    }
}
