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
public class DemoTennisGames {
    public static void demo(){
        TennisGame g1= new TennisGame();
        DoubleTennisGame g2= new DoubleTennisGame();
        g1.setNombres("Jugador 1", "Jugador 2");
        g1.setScores(1, 0);
        g2.setNombres("Jugador 1", "Pareja del jugador 1", "Jugador 2", "Pareja del jugador 2");
        g2.setScores(3, 4);
        System.out.println("\nTennis\nJuego simple\n"+g1);
        System.out.println("Juego doble\n"+g2);
    }
}
