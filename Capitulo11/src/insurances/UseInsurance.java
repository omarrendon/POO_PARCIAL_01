/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insurances;
import java.util.Scanner;
/**
 *
 * @author omarcr
 */
public class UseInsurance {
    public static void useIt(){
        Insurance insrnc=null;
        Scanner in=new Scanner(System.in); 
        System.out.print("Elija el tipo de poliza a contratar:\n"
                + "1. De salud\n"
                + "2. De vida\n"
                + "Opcion: ");
        int opc=in.nextInt(); 
        switch(opc){
            case 1:
                insrnc=new Health();
            break;
            case 2:
                insrnc=new Life();
            break;
        }
        insrnc.display();
    }
}
