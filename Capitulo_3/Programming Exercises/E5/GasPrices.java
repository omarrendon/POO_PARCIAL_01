package cap03;

import java.util.Scanner;

public class GasPrices {
	//gasolina 100 por barril
	//precio al consumidor entre 3.50 y 4.00 por gallon
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa el precio por barril: ");
		Integer pricePerBarrel = scanner.nextInt();
		pricesPerGal(pricePerBarrel);
		scanner.close();
	}
	public static void pricesPerGal(Integer pricepb) {
		
		System.out.printf("El rango de precios va de $%.2f a $%.2f ", pricepb*0.035, pricepb*0.04);
	}
}
