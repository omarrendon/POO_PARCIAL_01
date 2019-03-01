package cap04;

public class TestBirdSighting2 {
	public static void main(String[] args) {
		//BirdSighting2 bird1 = new BirdSighting2(); no funciona porque se llama al constructor de 3 parametros
		BirdSighting2 bird2 = new BirdSighting2("Canario", 1, 17);
		System.out.println("\nPajaro 2: ");
		System.out.println("Bird Species: "+bird2.getBirdSpecieSighted());
		System.out.println("Number seen: "+bird2.getNumberSeen());
		System.out.println("Day of the year: "+bird2.getDayOfTheYear());
	}
}
