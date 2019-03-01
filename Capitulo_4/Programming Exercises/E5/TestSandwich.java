package cap04;

public class TestSandwich {
	public static void main(String[] args) {
		Sandwich sanwish1 = new Sandwich("Blanco", 100.0, "Jamoncito", 130.3);
		Sandwich sanwish2 = new Sandwich("Integral", 110.98, "Quesillo", 130.3);
		Sandwich sanwish3 = new Sandwich("Linaza", 150.12, "Tasajo", 130.3);
		System.out.println("DATA PARA SANDWICH 1: ");
		System.out.println("Sandwich1 tipo de pan: "+sanwish1.getSBreadType());
		System.out.println("Sandwich1 calorias por rebanada: "+sanwish1.getSCaloriesPerSlice());
		System.out.println("Sandwich1 tipo de relleno: "+sanwish1.getSFillingType());
		System.out.println("Sandwich1 calorias del relleno: "+sanwish1.getSCalories());
		System.out.println("Sandwich1 calorias totales: "+sanwish1.totalCalories());
		System.out.println();
		System.out.println("DATA PARA SANDWICH 2: ");
		System.out.println("Sandwich2 tipo de pan: "+sanwish2.getSBreadType());
		System.out.println("Sandwich2 calorias por rebanada: "+sanwish2.getSCaloriesPerSlice());
		System.out.println("Sandwich2 tipo de relleno: "+sanwish2.getSFillingType());
		System.out.println("Sandwich2 calorias del relleno: "+sanwish2.getSCalories());
		System.out.println("Sandwich2 calorias totales: "+sanwish2.totalCalories());
		System.out.println();
		System.out.println("DATA PARA SANDWICH 3: ");
		System.out.println("Sandwich3 tipo de pan: "+sanwish3.getSBreadType());
		System.out.println("Sandwich3 calorias por rebanada: "+sanwish3.getSCaloriesPerSlice());
		System.out.println("Sandwich3 tipo de relleno: "+sanwish3.getSFillingType());
		System.out.println("Sandwich3 calorias del relleno: "+sanwish3.getSCalories());
		System.out.println("Sandwich3 calorias totales: "+sanwish3.totalCalories());
	}
}
