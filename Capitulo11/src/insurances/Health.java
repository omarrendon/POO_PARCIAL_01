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
public class Health extends Insurance{
    public Health(){
        super("Health");
    }
    
    public void setCostoMensual(){
        costoMensual=36d;
    }
    
    public void display(){
        System.out.println("Esta poliza tiene un costo de $36.00 al mes.");
    }
    
}
