package cap03;

public class TestSandwich {
	public static void main(String[] args) {
		Sandwich sanwish = new Sandwich();
		sanwish.setMainIngredient("Jamón");
		sanwish.setBreadType("Linaza");
		sanwish.setPrice(17.0);
		System.out.println("Ingrediente principal del sándwich: "+sanwish.getMainIngredient1());
		System.out.println("Tipo de pan: "+sanwish.getBreadType());
		System.out.println("Precio del sándwich: "+sanwish.getPrice());
	}
}
