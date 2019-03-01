package cap04;

import java.util.Scanner;

public class EventDemo {
	private static final Integer PRIZEPERPERSON = 35;
	private static Scanner scanner;
	public static void main(String[] args) {
		Event event1 = new Event();
		Event event2 = new Event(askingEventNumber(), askingNumberGuests());
		motto();
		System.out.println("EVENTO1 DATOS CONSTRUCTOR DEFAULT: ");
		impresionFinal(event1);
		System.out.println("\nEVENTO2 DATOS DE USUARIO: ");
		impresionFinal(event2);
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
