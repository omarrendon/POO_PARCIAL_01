/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package books;

/**
 *
 * @author omarcr
 */
public class NonFiction extends Book{
    public NonFiction(String t){
        super(t);
        setPrecio();
    }
    
    public void setPrecio(){
        precio=37.99;
    }
}
