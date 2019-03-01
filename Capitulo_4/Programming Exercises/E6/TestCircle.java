package cap04;

public class TestCircle {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		Circle c3 = new Circle();
		c1.setRadius(14.0);
		c2.setRadius(180.0);
		System.out.println("Círculo 1 data: ");
		System.out.println("El radio del circulo 1 es: "+c1.getRadius());
		System.out.println("El diámetro del círculo 1 es: "+c1.getDiameter());
		System.out.println("El área del círculo 1 es: "+c1.getArea());
		
		
		System.out.println("Círculo 2 data: ");
		System.out.println("El radio del circulo 2 es: "+c2.getRadius());
		System.out.println("El diámetro del círculo 2 es: "+c2.getDiameter());
		System.out.println("El área del círculo 2 es: "+c2.getArea());
		
		
		System.out.println("Círculo 3 data: ");
		System.out.println("El radio del circulo 2 es: "+c3.getRadius());
		System.out.println("El diámetro del círculo 2 es: "+c3.getDiameter());
		System.out.println("El área del círculo 2 es: "+c3.getArea());
		
		
	}
}
