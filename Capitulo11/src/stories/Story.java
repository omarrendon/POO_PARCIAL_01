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
public abstract class Story {
    private String titulo,autor,mensaje;
    Integer numPaginas;
    private Integer maxPaginas;

    public Story(Integer m){
        maxPaginas=m;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public Integer getMaxPaginas() {
        return maxPaginas;
    }

    public abstract void setNumPaginas(Integer numPaginas);
    
    public String toString(){
        return("Se esta publicando la historia "+getTitulo()+" de "+getAutor()+".\n"+ "La historia tiene "+getNumPaginas()+" paginas .\n"+getMensaje());
    }
}
