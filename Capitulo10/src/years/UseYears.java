/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package years;

/**
 *
 * @author omarcr
 */
public class UseYears {
    public static void demo(){
        Year y1=new Year();
        LeapYear y2=new LeapYear();
        System.out.println("\nAnios\n");
        System.out.println(y1.daysElapsed(Mes.SEPTIEMBRE, 16));
        System.out.println(y2.daysElapsed(Mes.SEPTIEMBRE, 16));
    }
}
