/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horses;

//import ejercicio01.Colores;

/**
 *
 * @author omarcr
 */
public class RaceHorse extends Horse{
    private Integer numeroDeCarreras;
    public Integer getNumeroDeCarreras() {
        return numeroDeCarreras;
    }

    public void setNumeroDeCarreras(Integer numeroDeCarreras) {
        this.numeroDeCarreras = numeroDeCarreras;
    }
    
    public String toString(){
        return getNombre()+"  "+getColor()+" "+getAnioDeNacimiento()+" "+getNumeroDeCarreras();
    }
    
}
