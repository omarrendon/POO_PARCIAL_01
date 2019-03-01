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
public class OutgoingPhoneCall extends PhoneCall{
    private Integer minutos;
    
    public OutgoingPhoneCall(String n,Integer m){
        super(n);
        setPrecio(0.04);
        minutos=m;
    }

    public Integer getMinutos() {
        return minutos;
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
        return "Numero: "+getNumero()+" Tarifa por minuto $0.04 Minutos: "+getMinutos()+" Precio total: $"+(getMinutos()*0.04);
    }
}
