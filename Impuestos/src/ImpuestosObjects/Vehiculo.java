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
public abstract class Vehiculo {
    private String placa;
    private String noSerie;
    private String marca;
    private Integer modelo;
    private Double valorFactura;

    public Vehiculo(String placa, String noSerie, String marca, Integer modelo, Double valorFactura) {
        this.placa = placa;
        this.noSerie = noSerie;
        this.marca = marca;
        this.modelo = modelo;
        this.valorFactura = valorFactura;
    }

    public abstract Double CalcularTenencia();
    
    public Double calcularBaseGravable(){
    return this.modelo>=2009 ? 0.05 : 0.02;
    }
    
    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the noSerie
     */
    public String getNoSerie() {
        return noSerie;
    }

    /**
     * @param noSerie the noSerie to set
     */
    public void setNoSerie(String noSerie) {
        this.noSerie = noSerie;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public Integer getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the valorFactura
     */
    public Double getValorFactura() {
        return valorFactura;
    }

    /**
     * @param valorFactura the valorFactura to set
     */
    public void setValorFactura(Double valorFactura) {
        this.valorFactura = valorFactura;
    }
    
}

