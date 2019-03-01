package cap03;

import java.util.Scanner;

public class Salary {
	public static void main(String[] args) {
		//salario semanal de un empleado
		//main pide pago por hora, horas trabajadas
		//y horas extra trabajadas
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce el pago por hora: ");
		Integer pagoHora = scanner.nextInt();
		System.out.println("Introduce las horas trabajadas a la semana :");
		Integer workedHours = scanner.nextInt();
		System.out.println("Introduce las horas extra trabajadas en la semana: ");
		Integer xWorkedHours = scanner.nextInt();
		System.out.println("Tu salario semanal es: $"+overTimePay(pagoHora, workedHours, xWorkedHours));
		scanner.close();
		
	}
	public static Double overTimePay(Integer pagoHora, Integer workedHours, Integer xWorkedHours) {
		Double salario = (double)pagoHora*workedHours;
		salario+=(xWorkedHours*(pagoHora*1.5));
		return salario;
	}
}
