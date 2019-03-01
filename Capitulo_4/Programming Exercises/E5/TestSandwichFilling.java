package cap04;

public class TestSandwichFilling {
	public static void main(String[] args) {
		SandwichFilling sanwish1 = new SandwichFilling("Jamón", 30.0);
		SandwichFilling sanwish2 = new SandwichFilling("Tocino", 300.0);
		SandwichFilling sanwish3 = new SandwichFilling("Quesillo", 3000.0);
		System.out.println("Sandwich 1 relleno: "+sanwish1.getFillingType());
		System.out.println("Sandwich 1 calorias: "+sanwish1.getCalories());
		System.out.println();
		System.out.println("Sandwich 2 relleno: "+sanwish2.getFillingType());
		System.out.println("Sandwich 2 calorias: "+sanwish2.getCalories());
		System.out.println();
		System.out.println("Sandwich 3 relleno: "+sanwish3.getFillingType());
		System.out.println("Sandwich 3 calorias: "+sanwish3.getCalories());
		System.out.println();
	}
}
