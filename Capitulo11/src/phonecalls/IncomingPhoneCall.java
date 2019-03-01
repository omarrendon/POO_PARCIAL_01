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
public class IncomingPhoneCall extends PhoneCall{
    public IncomingPhoneCall(String n){
        super(n);
        setPrecio(0.02);
    }

    @Override
    public String getNumero() {
        return numero;
    }

    @Override
    public Double getPrecio() {
        return precio;
    }

    @Override
    public String getInformation() {
        return "Numero: "+getNumero()+" Tarifa: $0.02 Precio: $0.03";
    }
    
}
