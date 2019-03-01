/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horses;

import ejercicio01.Colores;

/**
 *
 * @author omarcr
 */
public class Horse {
    private String nombre;
    private Colores color;
    private Integer anioDeNacimiento;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Colores getColor() {
        return color;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public Integer getAnioDeNacimiento() {
        return anioDeNacimiento;
    }

    public void setAnioDeNacimiento(Integer anioDeNacimiento) {
        this.anioDeNacimiento = anioDeNacimiento;
    }
    
    public String toString(){
        return getNombre()+"  "+getColor()+" "+getAnioDeNacimiento();
    }
    
}
