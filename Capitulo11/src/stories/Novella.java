/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stories;

/**
 *
 * @author omarcr
 */
public class Novella extends Story{
    public Novella(){
        super(100);
    }
    public void setNumPaginas(Integer n){
        numPaginas=n;
        if(n>getMaxPaginas())
            setMensaje((getNumPaginas()-getMaxPaginas())+" paginas deben cortarse para considerarse una novela corta.");
        else{
            if(n<50)
                setMensaje((getMaxPaginas()-getNumPaginas())+" paginas deben agregarse para considerarse una novela corta.");
            else
                setMensaje("");
        }
    }
}
