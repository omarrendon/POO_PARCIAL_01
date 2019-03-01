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
public class HolidayCabinRental extends CabinRental{
    public HolidayCabinRental(Integer n){
        super(n);
        setPrecioSemanal(getPrecioSemanal()+150);
    }
}
