/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ImpuestosCollection;

import ImpuestosObjects.Vehiculo;
import java.util.ArrayList;

/**
 *
 * @author omarc
 */
public class myArrayList extends ArrayList <Vehiculo>{

    @Override
    public boolean add(Vehiculo vehiculo) {
        if (isRepetido(vehiculo)){
            return false;
        } else {
            return super.add(vehiculo);
        }
         
    }
    private Boolean isRepetido(Vehiculo vehiculo){
    boolean encontrado = false;
    int contador = 0;
        while (!encontrado && contador<super.size()) {
            encontrado = (this.get(contador).getPlaca() == null ? vehiculo.getPlaca() == null : this.get(contador).getPlaca().equals(vehiculo.getPlaca()));
            contador++;
            
        }
        return encontrado;
    }
}
