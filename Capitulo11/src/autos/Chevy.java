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
public class Chevy extends Auto{
    public Chevy(){
        setMarca(Marcas.CHEVROLET);
    }
    public void setPrecio(Double p){
        precio=p;
    }
}
