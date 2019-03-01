package cap04;

import java.util.Scanner;

public class RentalDemo {
	
	private static Scanner scanner;
	public static void main(String[] args) {
		//pregunta por el numero de minutos que rento un equipo de sports
		//costo de 40 por hora + 1 por minuto adicional
		Rental renta1 = new Rental();
		Rental renta2 = new Rental(askingContractNumber(), askingRentalTime());
		System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs\n"+
				           "Ss          Bienvenido a Sammys       Ss\n"+
				           "SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs\n");
		
		Rental.samysMotto();
		System.out.println("DATOS CONSTRUCTOR DEFAULT");
		calculate(renta1);
		System.out.println("\nDATOS POR EL USUARIO");
		calculate(renta2);
		
	}
	public static Integer  askingRentalTime() {
		scanner = new Scanner(System.in);
		System.out.println("Ingrese el numero de minutos que rento el equipo deportivo: ");

		Integer minutes = scanner.nextInt();
		return minutes;
	}
	public static String askingContractNumber() {
		scanner = new Scanner(System.in);
		System.out.println("Ingrese el numero de contrato: ");
		String number = scanner.nextLine();
		return number;
	}
	public static void calculate(Rental renta1) {
		System.out.println("Si rentó menos de una hora se le cobra una hora(40 pesos)");
		System.out.println("Numero de contrato: "+renta1.getContractNumber());
		System.out.println("Cantidad de horas : " + renta1.getRentalHours());
		System.out.println("Cantidad de minutos : " + renta1.getExtraMinutes());
		System.out.println("El precio total a pagar es: " + renta1.getPrice());
	}
	public static void samysMotto() {
		System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs\n"+
				   "Ss  Sammy's makes it fun in the sun   Ss\n"+
				    "SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs\n");
	}
}
