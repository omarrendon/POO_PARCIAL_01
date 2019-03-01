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
public class ShortStory extends Story{
    public ShortStory(){
        super(50);
    }
    public void setNumPaginas(Integer n){
        numPaginas=n;
        if(n>getMaxPaginas())
            setMensaje((getNumPaginas()-getMaxPaginas())+" paginas deben cortarse para considerarse una historia corta.");
        else
            setMensaje("");
    }
}
