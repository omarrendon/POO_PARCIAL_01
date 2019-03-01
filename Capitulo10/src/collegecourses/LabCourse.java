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
public class LabCourse extends CollegeCourse{
    public LabCourse(Departamentos d, Integer n, Integer c){
        super(d,n,c);
        setColegiatura(getColegiatura()+50);
    }
}
