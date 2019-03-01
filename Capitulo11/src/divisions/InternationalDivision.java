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
public class InternationalDivision extends Division{
    private Paises pais;
    private Idiomas idioma;
    
    public InternationalDivision(String n, String nc, Paises p, Idiomas i){
        super(n,nc);
        pais=p;
        idioma=i;
    }

    public Paises getPais() {
        return pais;
    }

    public Idiomas getIdioma() {
        return idioma;
    }
    
    public void display(){
        System.out.println("Nombre: "+getNombre()+" Numero de cuenta: "+getNumCuenta()+" Pais: "+getPais()+" Idioma: "+getIdioma());
    }
}
