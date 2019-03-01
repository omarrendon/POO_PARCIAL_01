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
public class PartTime extends Student{
    public PartTime(String s){
        super(s,false,200d);
    }
    
    public Double setCuota(){
        return 200d;
    }
}
