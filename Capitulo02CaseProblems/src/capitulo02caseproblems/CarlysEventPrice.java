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
public class CarlysEventPrice {
    private static final Integer PRIZEPERPERSON = 35;
	
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("************************************************\n"+
						   "*              Bienvenido a Carly's            *\n"+
						   "************************************************\n");
		System.out.print("Ingresa el numero de invitados: ");
		Integer numeroInvitados = scanner.nextInt();
		Integer total = numeroInvitados*PRIZEPERPERSON;
		boolean largeEvent = numeroInvitados>=50;
		System.out.println("************************************************\n"+
				           "* Carly's makes the food that makes it a party *\n"+
				           "************************************************\n");
		System.out.println("\tEl numero de invitados es: "+numeroInvitados);
		System.out.println("\tEl precio por invitado es de: $"+PRIZEPERPERSON);
		System.out.println("\tEvento clasificado como grande?: "+largeEvent);
		System.out.printf("\tEl precio total para %d invitados es: $%d", numeroInvitados, total);
		scanner.close();
	}
}
