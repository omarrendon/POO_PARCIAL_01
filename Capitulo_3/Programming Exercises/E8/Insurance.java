package cap03;

import java.util.Scanner;

public class Insurance {
	public static void main(String[] args) {
		//decada de la edad del consumidor
		//agregandole 15, y multiplicandolo por 20
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce el año actual: ");
		Integer anio = scanner.nextInt();
		System.out.println("Introduce tu año de nacimiento: ");
		Integer anioNac = scanner.nextInt();
		System.out.println("La cantidad de tu premio es: $"+premio(anio,anioNac));
		scanner.close();
	}
	public static Integer premio(Integer anio, Integer anioNac) {
		Integer edad = anio-anioNac;
		Integer decadas = edad/10;
		Integer premio = (decadas+15)*20;
		return premio;
	}
}
