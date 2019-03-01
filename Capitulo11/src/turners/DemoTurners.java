/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turners;

/**
 *
 * @author Usuario
 */
public class DemoTurners {
    public static void demo(){
        Leaf leaf=new Leaf();
        Page page=new Page();
        Pancake pancake=new Pancake();
        leaf.turn();
        page.turn();
        pancake.turn();
    }
}
