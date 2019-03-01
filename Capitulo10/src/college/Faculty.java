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
public class Faculty extends CollegeEmployee{
    private Boolean titular;
    public void setPropiedades(){
        super.setPropiedades();
        Scanner in=new Scanner(System.in);
        System.out.print("Es titular? S/N"); String t=in.next();
        //in.close();
        if(t.equals("S")||t.equals("s"))
            titular=true;
        else
            titular=false;
    }

    public Boolean isTitular() {
        return titular;
    }
    
    public void display(){
        if(titular){
            System.out.println(getNombre()+" "+getApellidos()+" Calle: "+getCalle()+" "+getCodigoPostal()+" Tel: "+getTelefono()+" Numero de segurdidad social: "
            +getNumSeguridadSocial()+" Salario anual: $"+getSalarioAnual()+" Departamento: "+getDepartamento()+" Este empleado es titular de facultad");
        }
        else{
            super.display();
        }
    }
}
