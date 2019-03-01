package cap03;

import java.util.Scanner;

public class SammysRentalPriceWithMethods {
	
	private static Scanner scanner;
	public static void main(String[] args) {
		//pregunta por el numero de minutos que rento un equipo de sports
		//costo de 40 por hora + 1 por minuto adicional
		
		System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs\n"+
				           "Ss          Bienvenido a Sammys       Ss\n"+
				           "SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs\n");
		Integer minutes = askingRentalTime();
		samysMotto();
		calculate(minutes);
		
	}
	public static Integer  askingRentalTime() {
		scanner = new Scanner(System.in);
		System.out.println("Ingrese el numero de minutos que rento el equipo deportivo: ");

		Integer minutes = scanner.nextInt();
		return minutes;
	}
	public static void calculate(Integer minutes) {
		Integer hours = minutes/60;
		Integer resto = minutes%60;
		Integer total = minutes<60 ? 40 : hours*40+resto;
		System.out.println("Si rentó menos de una hora se le cobra una hora(40 pesos)");
		System.out.println("Cantidad de horas : " + hours);
		System.out.println("Cantidad de minutos : " + minutes);
		System.out.println("El precio total a pagar es: " + total);
	}
	public static void samysMotto() {
		System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs\n"+
				   "Ss  Sammy's makes it fun in the sun   Ss\n"+
				    "SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs\n");
	}
}
