/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ImpuestosObjects;

/**
 *
 * @author omarc
 */
public class  Pasajero extends Vehiculo{
    private Integer numPasajeros;

    public Pasajero(String placa, String noSerie, String marca, Integer modelo, Double valorFactura,Integer numPasajeros) {
        super(placa, noSerie, marca, modelo, valorFactura);
        this.numPasajeros = numPasajeros;
    }

    @Override
    public Double CalcularTenencia() {
        return (this.getValorFactura()*calcularBaseGravable())*(1+(numPasajeros/10.0));
    }

    public Integer getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(Integer numPasajeros) {
        this.numPasajeros = numPasajeros;
    }
  
    
}
