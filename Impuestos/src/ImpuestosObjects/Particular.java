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
public class Particular extends Pasajero{

    public Particular(String placa, String noSerie, String marca, Integer modelo, Double valorFactura, Integer numPasajeros) {
        super(placa, noSerie, marca, modelo, valorFactura, numPasajeros);
    }
}
