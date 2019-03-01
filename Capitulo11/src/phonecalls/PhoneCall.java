/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonecalls;

/**
 *
 * @author omarcr
 */
public abstract class PhoneCall {
    String numero;
    Double precio;
    
    public PhoneCall(String n){
        numero=n;
        precio=0.0;
    }
    
    public void setPrecio(Double p){
        precio=p;
    }
    
    public abstract String getNumero();
    public abstract Double getPrecio();
    public abstract String getInformation();
    
    
}
