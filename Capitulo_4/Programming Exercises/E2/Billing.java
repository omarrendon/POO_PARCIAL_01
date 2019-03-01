package cap04;

public class Billing {
	public static void main(String[] args) {
		System.out.println("Total 1: $"+computeBill(100.0));
		System.out.println("Total 2: $"+computeBill(100.0, 2));
		System.out.printf("Total  3: $%.2f", computeBill(100.0, 2, 15.5));
	}
	public static Double computeBill(Double price) {
		return price*1.08;
	}
	public static Double computeBill(Double price, Integer quantity) {
		return (price*quantity)*1.08;
	}
	public static Double computeBill(Double price, Integer quantity, Double couponValue) {
		return (price*quantity-couponValue)*1.08;
		
	}
}
