/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subscribers;

/**
 *
 * @author omarcr
 */
public abstract class NewspaperSubscriber {
    private String direccion;
    Double tarifa;

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Double getTarifa() {
        return tarifa;
    }

    public abstract void setTarifa();
    
    public Integer equals(NewspaperSubscriber n){
        if(this.getDireccion().equals(n.getDireccion()))
            return 0;
        return 1;
    }
}
