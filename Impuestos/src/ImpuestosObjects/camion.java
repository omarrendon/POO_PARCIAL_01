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
public class camion extends Carga{

    private Integer ejes;
    
    public camion(String placa, 
            String noSerie, 
            String marca, 
            Integer modelo, 
            Double valorFactura, 
            Integer toneladas, 
            Boolean publico,
            Integer ejes) {
        super(placa, noSerie, marca, modelo, valorFactura, toneladas, publico);
        this.ejes = ejes;
    }

    @Override
    public Double calcularBaseGravable() {
        return super.calcularBaseGravable()*(1+(ejes*0.01));
        //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Double CalcularTenencia() {
       return getValorFactura()*(1+(getToneladas()/10.0))*calcularBaseGravable();
    }

    public Integer getEjes() {
        return ejes;
    }

    public void setEjes(Integer ejes) {
        this.ejes = ejes;
    }
    
}
