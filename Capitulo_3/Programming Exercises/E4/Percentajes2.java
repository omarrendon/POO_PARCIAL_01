package cap03;

import java.util.Scanner;

public class Percentajes2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa el valor para a: ");
		Double a = scanner.nextDouble();
		System.out.println("Ingresa el valor para b: ");
		Double b = scanner.nextDouble();
		computePercent(a, b);
		scanner.close();
	}
	
	
	public static void computePercent(Double a, Double b) {
		System.out.println("Value a: "+a);
		System.out.println("Value b: "+b);
		//b--100%, a--? a*100/b
		System.out.printf("Value a as a percentaje of b: %.2f por ciento", a*100/b);
	}

}
