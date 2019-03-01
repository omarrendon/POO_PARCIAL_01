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
public class FullTime extends Student{
    public FullTime(String s){
        super(s,true,2000d);
    }
    
    public Double setCuota(){
        return 2000d;
    }
}
