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
public class DomesticDivision extends Division{
    private String estado;
    public DomesticDivision(String n, String nc, String e){
        super(n,nc);
        estado=e;
    }

    public String getEstado() {
        return estado;
    }
    
    public void display(){
        System.out.println("Nombre: "+getNombre()+" Numero de cuenta: "+getNumCuenta()+" Estado: "+getEstado());
    }
}
