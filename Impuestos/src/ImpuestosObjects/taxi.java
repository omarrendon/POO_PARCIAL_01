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
public class taxi extends Pasajero{
    private Integer aniosConcesion;

    public taxi(String placa, String noSerie, String marca, Integer modelo, Double valorFactura, Integer numPasajeros,Integer anios) {
        super(placa, noSerie, marca, modelo, valorFactura, numPasajeros);
        this.aniosConcesion = anios;
    }
    @Override
    public Double CalcularTenencia() {
        return super.CalcularTenencia();
    }
   
}
