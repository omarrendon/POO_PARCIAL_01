/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo02caseproblems;

import java.util.Scanner;

/**
 *
 * @author omarc
 */
public class SammyRentalPrice {
    public static void main(String[] args) {
		//pregunta por el numero de minutos que rento un equipo de sports
		//costo de 40 por hora + 1 por minuto adicional
		Scanner scanner = new Scanner(System.in);
		System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs\n"+
				           "Ss          Bienvenido a Sammys       Ss\n"+
				           "SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs\n");
		System.out.println("Minutos que rentará el equipo: ");
		Integer minutes = scanner.nextInt();
		/*En el libro habla sobre el problema lógico de tener minutos<60,
		 * pero menciona que por el momento ignoremos ese problema lógico
		 * igualmente fue agregada su solucion
		 */
		Integer hours = minutes/60;
		Integer resto = minutes%60;
		Integer total = minutes<60 ? 40 : hours*40+resto;
		System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs\n"+
				   "Ss  Sammy's makes it fun in the sun   Ss\n"+
				    "SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs\n");
		System.out.println("Si rentó menos de una hora se le cobra una hora");
		System.out.println("Cantidad de horas : " + hours);
		System.out.println("Cantidad de minutos : " + minutes);
		System.out.println("El precio total a pagar es: " + total);
		scanner.close();
    }
}
