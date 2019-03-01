/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01;
import horses.DemoHorses;
import candles.DemoCandles;
import tennisgames.DemoTennisGames;
import years.UseYears;
import cabins.DemoCabinRental;
import packages.UsePackage;
import cars.UseCarRental;
import collegecourses.UseCourse;
import vehicles.UseVehicle;
import college.CollegeList;
/**
 *
 * @author omarcr
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DemoHorses.demo();
        DemoCandles.demo();
        DemoTennisGames.demo();
        UseYears.demo();
        DemoCabinRental.demo();
        UsePackage.demo();
        UseCarRental.demo();
        UseCourse.demo();
        UseVehicle.demo();
        CollegeList.demo();
    }
    
}
