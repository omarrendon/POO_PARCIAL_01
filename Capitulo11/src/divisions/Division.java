/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisions;

/**
 *
 * @author omarcr
 */
public abstract class Division {
    private String nombre;
    private String numCuenta;
    
    public Division(String n, String nc){
        nombre=n;
        numCuenta=nc;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumCuenta() {
        return numCuenta;
    }
    
    public abstract void display();
}
