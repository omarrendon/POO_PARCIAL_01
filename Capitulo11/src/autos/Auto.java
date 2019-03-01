/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autos;

/**
 *
 * @author omarcr
 */
public abstract class Auto {
    private Marcas marca;
    Double precio;

    public Marcas getMarca() {
        return marca;
    }

    public void setMarca(Marcas marca) {
        this.marca = marca;
    }

    public Double getPrecio() {
        return precio;
    }

    public abstract void setPrecio(Double precio);
    
    public String toString(){
        return "Marca: "+getMarca()+" Precio: $"+getPrecio();
    }
}
