package cap03;

public class Percentajes {
	public static void main(String[] args) {
		Double a = 2.0;
		Double b = 5.0;
		computePercent(a, b);
	}
	public static void computePercent(Double a, Double b) {
		System.out.println("Value a: "+a);
		System.out.println("Value b: "+b);
		//b--100%, a--? a*100/b
		System.out.printf("Value a as a percentaje of b: %.2f por ciento", a*100/b);
	}

}
