/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegecourses;

/**
 *
 * @author omarcr
 */
public class CollegeCourse {
    private Departamentos departamento;
    private Integer numeroDeCurso;
    private Integer creditos;
    private Double colegiatura;
    
    public CollegeCourse(Departamentos d, Integer n, Integer c){
        departamento=d;
        numeroDeCurso=n;
        creditos=c;
        colegiatura=creditos*120d;
    }

    public Departamentos getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamentos departamento) {
        this.departamento = departamento;
    }

    public Integer getNumeroDeCurso() {
        return numeroDeCurso;
    }

    public void setNumeroDeCurso(Integer numeroDeCurso) {
        this.numeroDeCurso = numeroDeCurso;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }

    public Double getColegiatura() {
        return colegiatura;
    }

    public void setColegiatura(Double colegiatura) {
        this.colegiatura = colegiatura;
    }
    
    public void display(){
        System.out.println("Departamento: "+getDepartamento()+"\nNumero de curso: "+getNumeroDeCurso()+"\nCreditos: "+getCreditos()+"\nColegiatura: $"+getColegiatura());
    }
}
