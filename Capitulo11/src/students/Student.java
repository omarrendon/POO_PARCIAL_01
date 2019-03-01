/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students;

/**
 *
 * @author omarcr
 */
public abstract class Student {
    private String nombre;
    private Boolean fulltime;
    private Double cuota;
    
    public Student(String n,Boolean f,Double c){
        nombre=n;
        fulltime=f;
        cuota=c;
    }

    public String getNombre() {
        return nombre;
    }

    public Boolean getFulltime() {
        return fulltime;
    }

    public Double getCuota() {
        return cuota;
    }
    
    public abstract Double setCuota();
    
    public String toString(){
        return fulltime? getNombre()+" es un estudiante de tiempo completo y paga $"+getCuota(): getNombre()+" no es "
                + "un estudiante de tiempo completo y paga $"+getCuota()+" por credito.";
    }
}
