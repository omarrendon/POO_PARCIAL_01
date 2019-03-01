/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insurances;

/**
 *
 * @author omarcr
 */
public class Life extends Insurance{
    public Life(){
        super("Life");
    }
    
    public void setCostoMensual(){
        costoMensual=196d;
    }
    
    public void display(){
        System.out.println("Esta poliza tiene un costo de $196.00 al mes.");
    }
}
