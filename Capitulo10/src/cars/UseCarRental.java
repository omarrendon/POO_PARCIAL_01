/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cars;
import java.util.Scanner;

/**
 *
 * @author omarcr
 */
public class UseCarRental {
    public static void demo(){
        Scanner in=new Scanner(System.in);
        CarRental c1=null;
        CarRental c2=null;
        System.out.print("\nRenta de autos.\nNombre del arrendatario: "); 
        String n=in.nextLine();
        System.out.print("Codigo Postal: "); 
        int cp=in.nextInt();
        System.out.print("Numero de dias que rentara el auto: "); 
        int d=in.nextInt();
        System.out.print("Elija el vehiculo que desea rentar: \n1. Economico.\n2. Tamanio medio.\n3.Tamanio familiar.\n4.De lujo."
                + "\nOpcion: ");
        int opc=in.nextInt();
        if(opc==4)
            System.out.print("Desea agregar un chofer para el auto? S/N"); String c=in.next();
        in.close();
        Sizes t=null;
        switch(opc){
            case 1:
                t=Sizes.ECONOMY;
            break;
            case 2:
                t=Sizes.MIDSIZE;
            break;
            case 3:
                t=Sizes.FULL_SIZE;
            break;
        }
        if(opc==1||opc==2||opc==3)
            c1=new CarRental(n,cp,t,d);
        else{
            if(c.equals("S")||c.equals("s")){
                c2=new LuxuryCarRental(n,cp,d,true);
            }
            else
                c2=new LuxuryCarRental(n,cp,d,false);
        }
        if(c1!=null)
            c1.display();
        else
            c2.display();
            
    }
}
