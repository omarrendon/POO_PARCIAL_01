/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college;
import java.util.Scanner;
/**
 *
 * @author omarcr
 */
public abstract class Person {
    private String nombre;
    private String apellidos;
    private String calle;
    private Integer codigoPostal;
    private Integer telefono;
    
    public void setPropiedades(){
        Scanner in=new Scanner(System.in);
        System.out.print("Nombre: "); nombre=in.nextLine();
        System.out.print("Apellidos: "); apellidos=in.nextLine();
        System.out.print("Calle: "); calle=in.nextLine();
        System.out.print("Codigo Postal: "); codigoPostal=in.nextInt();
        System.out.print("Telefono: "); telefono=in.nextInt();
        //in.close();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCalle() {
        return calle;
    }

    public Integer getCodigoPostal() {
        return codigoPostal;
    }

    public Integer getTelefono() {
        return telefono;
    }
    
    public void display(){
        System.out.println(getNombre()+" "+getApellidos()+" Calle: "+getCalle()+" "+getCodigoPostal()+" Tel: "+getTelefono());
    }
    
}
