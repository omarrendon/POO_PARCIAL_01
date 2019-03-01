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
public abstract class Book {
    private String titulo;
    Double precio;
    
    public Book(String t){
        titulo=t;
    }

    public String getTitulo() {
        return titulo;
    }

    public Double getPrecio() {
        return precio;
    }
    
    public String toString(){
        return "Titulo: "+getTitulo()+" Precio: $"+getPrecio();
    }
}
