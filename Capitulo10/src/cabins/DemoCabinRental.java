/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cabins;

/**
 *
 * @author omarcr
 */
public class DemoCabinRental {
    public static void demo(){
        CabinRental c1=new CabinRental(1);
        HolidayCabinRental c2=new HolidayCabinRental(5);
        System.out.println("\n Cabanias:\n"+c1);
        System.out.println(c2);
    }
}
