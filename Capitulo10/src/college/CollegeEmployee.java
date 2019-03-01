/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college;
import collegecourses.Departamentos;
import java.util.Scanner;
/**
 *
 * @author omarcr
 */
public class CollegeEmployee extends Person{
    private Integer numSeguridadSocial;
    private Double salarioAnual;
    private Departamentos departamento;
    
    public void setPropiedades(){
        super.setPropiedades();
        Scanner in=new Scanner(System.in);
        System.out.print("Numero de seguridad social: "); numSeguridadSocial=in.nextInt();
        System.out.print("Salario anual: $"); salarioAnual=in.nextDouble();
        System.out.print("Seleccione el departamento: \n"
                + "1. Ingenieria\n"
                + "2. Medicina\n"
                + "3. Leyes\n"
                + "4. Biologia\n"
                + "5. Quimica\n"
                + "6. Ciencias de la Comunicacion e Informacion\n"
                + "7. Fisica\n"
                + "8. Filosofia\n"
                + "9. Literatura\n"
                + "10. Arquitectura\n"
                + "Opcion: ");
        int opc=in.nextInt();
        //in.close();
        switch(opc){
            case 1:
                departamento=Departamentos.ENG;
            break;
            case 2:
                departamento=Departamentos.MED;
            break;
            case 3:
                departamento=Departamentos.LAW;
            break;
            case 4:
                departamento=Departamentos.BIO;
            break;
            case 5:
                departamento=Departamentos.CHM;
            break;
            case 6:
                departamento=Departamentos.CIS;
            break;
            case 7:
                departamento=Departamentos.PHY;
            break;
            case 8:
                departamento=Departamentos.PHI;
            break;
            case 9:
                departamento=Departamentos.LIT;
            break;
            case 10:
                departamento=Departamentos.ARQ;
            break;
        }
        
    }

    public Integer getNumSeguridadSocial() {
        return numSeguridadSocial;
    }

    public Double getSalarioAnual() {
        return salarioAnual;
    }

    public Departamentos getDepartamento() {
        return departamento;
    }
    
    public void display(){
        System.out.println(getNombre()+" "+getApellidos()+" Calle: "+getCalle()+" "+getCodigoPostal()+" Tel: "+getTelefono()+" Numero de segurdidad social: "
        +getNumSeguridadSocial()+" Salario anual: $"+getSalarioAnual()+" Departamento: "+getDepartamento());
    }
}

