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
public class Camioneta extends Carga{

    public Camioneta(String placa, String noSerie, String marca, Integer modelo, Double valorFactura, Integer toneladas, Boolean publico) {
        super(placa, noSerie, marca, modelo, valorFactura, toneladas, publico);
    }

    @Override
    public Double CalcularTenencia() {
       return super.CalcularTenencia();
    }
    
}
