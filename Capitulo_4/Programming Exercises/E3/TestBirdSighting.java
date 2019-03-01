package cap04;

public class TestBirdSighting {
	public static void main(String[] args) {
		BirdSighting bird1 = new BirdSighting();
		System.out.println("Pajaro 1:");
		System.out.println("Bird Species: "+bird1.getBirdSpecieSighted());
		System.out.println("Number seen: "+bird1.getNumberSeen());
		System.out.println("Day of the year: "+bird1.getDayOfTheYear());
		BirdSighting bird2 = new BirdSighting("Canario", 1, 17);
		System.out.println("\nPajaro 2: ");
		System.out.println("Bird Species: "+bird2.getBirdSpecieSighted());
		System.out.println("Number seen: "+bird2.getNumberSeen());
		System.out.println("Day of the year: "+bird2.getDayOfTheYear());
	}
}
