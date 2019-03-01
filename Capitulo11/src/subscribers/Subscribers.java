/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subscribers;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author omarcr
 */
public class Subscribers {
    public static void useIt(){
        Scanner in=new Scanner(System.in);
        NewspaperSubscriber s1=new SevenDaySubscriber();
        WeekdaySubscriber s2=new WeekdaySubscriber();
        WeekendSubscriber s3=new WeekendSubscriber();
        ArrayList<NewspaperSubscriber> subsArray=new ArrayList();
        Subscribers[] subsArray1=new Subscribers[10];
        int c=0,flagCounter;
        boolean flag=false;
        while(true){
            System.out.print("Ingrese el tipo de subscripcion que desea(D=diaria,L=lunes a viernes,F=fines de semana) o Q para salir: ");
            String subs=in.next();
            subs=subs.toUpperCase();
            if(subs.equals("Q")){
                break;
            }
            else{
                in.nextLine();
                System.out.print("Ingrese la direccion a la que se asignara la subscripcion: ");
                String dr=in.nextLine();
                dr=dr.toUpperCase();
                switch(subs){
                    case "D":
                        subsArray.add(new SevenDaySubscriber());
                    break;
                    case "L":
                        subsArray.add(new WeekdaySubscriber());
                    break;
                    case "F":
                        subsArray.add(new WeekendSubscriber());
                    break;
                }
                flag=validarDireccion(subsArray,dr);
                if(flag){
                    System.out.println("Esta direccion ya ha sido registrada.");
                    subsArray.remove(c);
                    c--;
                }
                else{
                    subsArray.get(c).setDireccion(dr);
                    subsArray.get(c).setTarifa();
                    System.out.println("Su subscripcion ha sido registrada exitosamente.");
                }
            }
            c++;
        }
        if(c>0){
            for(int i=0;i<subsArray.size();i++){
                System.out.println(subsArray.get(i));
            }
        }
    }
    
    static boolean validarDireccion(ArrayList<NewspaperSubscriber> a, String d){
        for(int i=0;i<a.size();i++){
            if(d.equals(a.get(i).getDireccion())){
                return true;
            }            
        }
        return false;
    }
}
