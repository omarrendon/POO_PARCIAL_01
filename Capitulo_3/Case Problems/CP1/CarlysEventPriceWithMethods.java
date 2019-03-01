package cap03;

import java.util.Scanner;

public class CarlysEventPriceWithMethods {
	private static final Integer PRIZEPERPERSON = 35;
	private static Scanner scanner;
	public static void main(String[] args) {
		System.out.println("************************************************\n"+
						   "*              Bienvenido a Carly's            *\n"+
		            	   "************************************************\n");
		
	}
	public static int askingNumberGuests() {
		scanner = new Scanner(System.in);
		System.out.print("Ingresa el numero de invitados: ");
		Integer numeroInvitados = scanner.nextInt();
		return numeroInvitados;
		
	}
	public static String askingEventNumber() {
		scanner = new Scanner(System.in);
		System.out.print("Ingresa el numero de evento: ");
		String eventNumber = scanner.nextLine();
		return eventNumber;
	}
	public static void motto() {
		System.out.println("************************************************\n"+
		           "* Carly's makes the food that makes it a party *\n"+
		           "************************************************\n");
	}
	public static void impresionFinal (Event event1) {
		Integer total = event1.getNumberOfGuests()*PRIZEPERPERSON;
		boolean largeEvent = event1.getNumberOfGuests()>=50;
		System.out.println("\tEl número de evento es: "+event1.getEventNumber());
		System.out.println("\tEl numero de invitados es: "+event1.getNumberOfGuests());
		System.out.println("\tEl precio por invitado es de: $"+PRIZEPERPERSON);
		System.out.println("\tEvento clasificado como grande?: "+largeEvent);
		System.out.printf("\tEl precio total para %d invitados es: $%d", event1.getNumberOfGuests(), total);
	}
}
