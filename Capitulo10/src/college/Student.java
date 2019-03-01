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
public class Student extends Person{
    private Departamentos carrera;
    private Double promedio;
    
    public void setPropiedades(){
        super.setPropiedades();
        Scanner in=new Scanner(System.in);
        System.out.print("Seleccione la carrera: \n"
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
        switch(opc){
            case 1:
                carrera=Departamentos.ENG;
            break;
            case 2:
                carrera=Departamentos.MED;
            break;
            case 3:
                carrera=Departamentos.LAW;
            break;
            case 4:
                carrera=Departamentos.BIO;
            break;
            case 5:
                carrera=Departamentos.CHM;
            break;
            case 6:
                carrera=Departamentos.CIS;
            break;
            case 7:
                carrera=Departamentos.PHY;
            break;
            case 8:
                carrera=Departamentos.PHI;
            break;
            case 9:
                carrera=Departamentos.LIT;
            break;
            case 10:
                carrera=Departamentos.ARQ;
            break;
        }
        System.out.print("Promedio: "); promedio=in.nextDouble();
    }

    public Departamentos getCarrera() {
        return carrera;
    }

    public Double getPromedio() {
        return promedio;
    }
    
    public void display(){
        System.out.println(getNombre()+" "+getApellidos()+" Calle: "+getCalle()+" "+getCodigoPostal()+" Tel: "+getTelefono()+" Carrera: "+getCarrera()
                + " Promedio: "+getPromedio());
    }
}
