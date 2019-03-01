/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisions;

/**
 *
 * @author omarcr
 */
public class UseDivision {
    public static void demo(){
        Division d1=new InternationalDivision("Intel","00000001",Paises.EUA,Idiomas.INGLES);
        Division d2=new DomesticDivision("Intel","00000301","California");
        Division d3=new InternationalDivision("IBM","00203001",Paises.MEXICO,Idiomas.ESPANIOL);
        Division d4=new DomesticDivision("IBM","01010201","Guadalajara");
        d1.display();
        d2.display();
        d3.display();
        d4.display();
    }
}
