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
public class CollegeList {
    public static void demo(){
        Person[] arrayPersonas=new Person[14];
        int cc=0,cf=0,cs=0,c=0;
        Scanner in=new Scanner(System.in);
        while(true){
            if(cc==4&&cf==3&&cs==7){
                System.out.println("Ya ha ingresado el numero maximo de personas");
                break;
            }
            System.out.print("Ingrese el tipo de persona a ingresar (C,F O S) o Q para salir: "); String p=in.next();
            p=p.toUpperCase();
            if(p.equals("Q")){
                break;
            }
            else{
                switch(p){
                    case "C":
                        if(cc==4){
                            System.out.println("Ya ha ingresado el numero maximo de empleados.");
                            break;
                        }
                        else{
                            arrayPersonas[c]=new CollegeEmployee();
                            cc++;
                            System.out.println("Empleado "+cc+": ");
                        }
                    break;
                    case "F":
                        if(cf==3){
                            System.out.println("Ya ha ingresado el numero maximo de miembros del profesorado.");
                            break;
                        }
                        else{
                            arrayPersonas[c]=new Faculty();
                            cf++;
                            System.out.println("Miembro del profesorado "+cf+": ");
                        }
                    break;
                    case "S":
                        if(cs==7){
                            System.out.println("Ya ha ingresado el numero maximo de estudiantes.");
                            break;
                        }
                        else{
                            arrayPersonas[c]=new Student();
                            cs++;
                            System.out.println("Estudiante "+cs+": ");
                        }
                    break;
                }
                arrayPersonas[c].setPropiedades();
                c++;
            }
        }
        if(c>0){
            System.out.println("Datos de las personas: ");
            for(int i=0;i<c;i++){
                System.out.println("Persona "+(i+1)+": ");
                arrayPersonas[i].display();
            }
        }
    }
}
