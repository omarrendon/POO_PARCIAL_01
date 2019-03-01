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
public class Carga extends Vehiculo{
    private Integer toneladas;
    private Boolean publico;

    public Carga(String placa, 
            String noSerie, 
            String marca, 
            Integer modelo, 
            Double valorFactura,
            Integer toneladas, 
            Boolean publico) {
        super(placa,noSerie,marca,modelo,valorFactura);
        this.toneladas = toneladas;
        this.publico = publico;
    }

    @Override
    public Double calcularBaseGravable(){
            if (!this.publico) {
                return super.calcularBaseGravable();
            }
            else{
            return this.getModelo() >= 2009 ? 0.03:0.01;
            }
    }
    
   
  
    public Integer getToneladas() {
        return toneladas;
    }

    public void setToneladas(Integer toneladas) {
        this.toneladas = toneladas;
    }

    public Boolean getPublico() {
        return publico;
    }

    public void setPublico(Boolean publico) {
        this.publico = publico;
    }

    @Override
    public Double CalcularTenencia() {
        return this.getValorFactura()*(1+this.toneladas/10.0)*calcularBaseGravable();
    }

    
   
    
}
