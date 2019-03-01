/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students;

/**
 *
 * @author omarcr
 */
public class UseStudent {
    public static void useIt(){
        Student s1=new FullTime("Estudiante 1");
        Student s2=new PartTime("Estudiante 2");
        System.out.println(s1);
        System.out.println(s2);
    }
}
