/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo2.Objects;

/**
 *
 * @author omarc
 */
public class Initials {
    private char inicial='O', inicial2='C', inicial3='R';

    public Initials() {
    }
    
    @Override
    public String toString() {
        return inicial + "." + inicial2 + "." + inicial3;
    }
    
    
}
