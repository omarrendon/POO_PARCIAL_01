/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packages;

/**
 *
 * @author omarcr
 */
public class UsePackage {
    public static void demo(){
        Package p1=new Package(2d,MetodosDeEnvio.A);
        Package p2=new Package(5d,MetodosDeEnvio.M);
        Package p3=new Package(3d,MetodosDeEnvio.T);
        InsuredPackage p4=new InsuredPackage(3d,MetodosDeEnvio.A);
        InsuredPackage p5=new InsuredPackage(4d,MetodosDeEnvio.T);
        InsuredPackage p6=new InsuredPackage(1d,MetodosDeEnvio.M);
        System.out.println("\nPaquetes:\nPaquete 1");
        p1.display();
        System.out.println("Paquete 3");
        p2.display();
        System.out.println("Paquete 4");
        p3.display();
        System.out.println("Paquete 5");
        p4.display();
        System.out.println("Paquete 6");
        p5.display();
        System.out.println("Paquete 7");
        p6.display();
    }
}
