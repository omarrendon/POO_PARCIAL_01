/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package players;

/**
 *
 * @author omarcr
 */
public class UsePlayer {
    public static void useIt(){
        Child child=new Child();
        Actor actor=new Actor();
        Musician musician=new Musician();
        
        child.play();
        actor.play();
        musician.play();
    }
}
