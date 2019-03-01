/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autos;

/**
 *
 * @author omarcr
 */
public class UseAuto {
    public static void demo(){
        Auto a1=new Ford();
        Auto a2=new Chevy();
        a1.setPrecio(22000d);
        a2.setPrecio(18000d);
        System.out.println(a1);
        System.out.println(a2);
    }
}
