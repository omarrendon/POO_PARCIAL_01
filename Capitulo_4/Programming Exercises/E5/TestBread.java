package cap04;

public class TestBread {

	public static void main(String[] args) {
		Bread bread1 = new Bread("Blanco", 100.0);
		Bread bread2 = new Bread("Integral", 200.0);
		Bread bread3 = new Bread("Parmesano", 300.3);
		System.out.println(Bread.MOTTO); //podemos llamar bread1.MOTTO, por sugerencia del entorno lo dejamos con la clase
		System.out.println("Pan 1 tipo: "+bread1.getBreadType());
		System.out.println("Pan 1 calorias por rebanada: "+bread1.getCaloriesPerSlice());
		System.out.println();
		System.out.println(Bread.MOTTO);
		System.out.println("Pan 2 tipo: "+bread2.getBreadType());
		System.out.println("Pan 2 calorias por rebanada: "+bread2.getCaloriesPerSlice());
		System.out.println();
		System.out.println(Bread.MOTTO);
		System.out.println("Pan 3 tipo: "+bread3.getBreadType());
		System.out.println("Pan 3 calorias por rebanada: "+bread3.getCaloriesPerSlice());

	}
	
}
