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
public class WeekdaySubscriber extends NewspaperSubscriber{
    public void setTarifa(){
        tarifa=3.5;
    }
    public String toString(){
        return "Direccion: "+getDireccion()+" Tarifa: $"+getTarifa()+" Tipo de servicio: Lunes a viernes.";
    }
}
