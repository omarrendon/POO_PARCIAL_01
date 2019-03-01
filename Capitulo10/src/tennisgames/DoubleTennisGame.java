/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tennisgames;

/**
 *
 * @author omarcr
 */
public class DoubleTennisGame extends TennisGame{
    private String pareja1;
    private String pareja2;
    
    public DoubleTennisGame(){
        
    }

    public String getPareja1() {
        return pareja1;
    }

    public String getPareja2() {
        return pareja2;
    }
    
    public void setNombres(String s1, String p1,String s2,String p2){
        setNombres(s1,s2);
        pareja1=p1;
        pareja2=p2;
    }
    
    public String toString(){
        return "Pareja 1  "+getScoreJugador1()+" "+getSscoreJugador1()+"\n"+getJugador1()+" "+getPareja1()+"\n"+
                "Pareja 2  "+getScoreJugador2()+" "+getSscoreJugador2()+"\n"+getJugador2()+" "+getPareja2()+"\n";
    }
}
