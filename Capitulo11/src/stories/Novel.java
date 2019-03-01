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
public class Novel extends Story{
    public Novel(){
        super(10000);
    }
    public void setNumPaginas(Integer n){
        numPaginas=n;
        if(n<100)
            setMensaje((100-getNumPaginas())+" paginas deben agregarse para considerarse una novela.");
        else
            setMensaje("");
    }
}
