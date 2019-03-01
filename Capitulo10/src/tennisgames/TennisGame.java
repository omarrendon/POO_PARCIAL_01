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
public class TennisGame {
    private String jugador1;
    private String jugador2;
    private Integer scoreJugador1;
    private Integer scoreJugador2;
    private String sScoreJugador1;
    private String sScoreJugador2;

    public TennisGame(){
        
    }
    public String getJugador1() {
        return jugador1;
    }

    public String getJugador2() {
        return jugador2;
    }

    public Integer getScoreJugador1() {
        return scoreJugador1;
    }

    public Integer getScoreJugador2() {
        return scoreJugador2;
    }

    public String getSscoreJugador1() {
        return sScoreJugador1;
    }

    public String getSscoreJugador2() {
        return sScoreJugador2;
    }
    
    public void setNombres(String n1,String n2){
        jugador1=n1;
        jugador2=n2;
    }
    
    public void setScores(Integer s1, Integer s2){
        if((s1>4 || s1<0)||(s2>4 || s2<0)||(s1==4 && s2==4)||(s1==0 && s2==0)){
            scoreJugador1=0;
            scoreJugador2=0;
            sScoreJugador1="error";
            sScoreJugador2="error";
        }
        else{
            scoreJugador1=s1;
            scoreJugador2=s2;
            switch(s1){
                case 0:
                    sScoreJugador1="love";
                break;
                case 1:
                    sScoreJugador1="15";
                break;
                case 2:
                    sScoreJugador1="30";
                break;
                case 3:
                    sScoreJugador1="40";
                break;
                case 4:
                    sScoreJugador1="game";
                break;
            }
            switch(s2){
                case 0:
                    sScoreJugador2="love";
                break;
                case 1:
                    sScoreJugador2="15";
                break;
                case 2:
                    sScoreJugador2="30";
                break;
                case 3:
                    sScoreJugador2="40";
                break;
                case 4:
                    sScoreJugador2="game";
                break;
            }
        }
    }
    public String toString(){
        return getJugador1()+" "+getScoreJugador1()+" "+getSscoreJugador1()+"\n"+getJugador2()+" "+getScoreJugador2()+" "+getSscoreJugador2();
    }
}

