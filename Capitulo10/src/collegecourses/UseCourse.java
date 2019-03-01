/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegecourses;
import java.util.Scanner;
/**
 *
 * @author omarcr
 */
public class UseCourse {
    public static void demo(){
        CollegeCourse c1=null;
        LabCourse c2=null;
        Departamentos d=null;
        Scanner in=new Scanner(System.in);
        System.out.print("Seleccione el curso que desa: \n"
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
                d=Departamentos.ENG;
            break;
            case 2:
                d=Departamentos.MED;
            break;
            case 3:
                d=Departamentos.LAW;
            break;
            case 4:
                d=Departamentos.BIO;
            break;
            case 5:
                d=Departamentos.CHM;
            break;
            case 6:
                d=Departamentos.CIS;
            break;
            case 7:
                d=Departamentos.PHY;
            break;
            case 8:
                d=Departamentos.PHI;
            break;
            case 9:
                d=Departamentos.LIT;
            break;
            case 10:
                d=Departamentos.ARQ;
            break;
        }
        System.out.print("Numero de curso: "); int nc=in.nextInt();
        System.out.println("Numero de creditos: "); int c=in.nextInt();
        if(opc==4||opc==5||opc==6||opc==7)
            c2=new LabCourse(d,nc,c);
        else
            c1=new CollegeCourse(d,nc,c);
        if(c1!=null)
            c1.display();
        else
            c2.display();
        
    }
}
