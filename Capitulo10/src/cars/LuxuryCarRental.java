/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cars;

/**
 *
 * @author omarcr
 */
public class LuxuryCarRental extends CarRental{
    private Boolean chofer;
    public LuxuryCarRental(String a,Integer cp,Integer d,Boolean c){
        super(a,cp,null,d);
        chofer=c;
        if(chofer)
            setRentaDiaria(279.99);
        else
            setRentaDiaria(79.99);
        setRentaTotal(getRentaDiaria()*getDiasDeRenta());
    }
    public void display(){
        if(chofer){
            System.out.println("Arrendatario: "+getArrendatario()+"\nCodigo Postal: "+getCodigoPostal()+"\nRenta diaria(Incluye salario del chofer por $200.00 al dia): $"+getRentaDiaria()
        +"\nDias de renta: "+getDiasDeRenta()+"\nRenta total: "+getRentaTotal());
        }
        else{
            System.out.println("Arrendatario: "+getArrendatario()+"\nCodigo Postal: "+getCodigoPostal()+"\nRenta diaria: $"+getRentaDiaria()
        +"\nDias de renta: "+getDiasDeRenta()+"\nRenta total: $"+getRentaTotal());
        }
    }
}
