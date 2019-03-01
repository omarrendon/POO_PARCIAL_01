package cap03;

import java.util.Scanner;

public class TestPainting {
	private static Scanner scanner;
	public static void main(String[] args) {
		Painting paint1 = new Painting();
		Painting paint2 = new Painting();
		Painting paint3 = new Painting();
		paint1 = getData();
		paint2 = getData();
		showValues(paint1);
		showValues(paint2);
		showValues(paint3);
		System.out.println("The gallery comission rate is 20 percent of the price of the painting");
	}
	public static Painting getData() {
		Painting paint = new Painting();
		scanner = new Scanner(System.in);
		System.out.println("Please input the title of the painting: ");
		paint.setTitle(scanner.nextLine());
		System.out.println("Please input the name of the artist: ");
		paint.setArtist(scanner.nextLine());
		System.out.println("Please input the medium to create the painting: ");
		paint.setMedium(scanner.nextLine());
		System.out.println("Please input the painting's price: ");
		paint.setPrice(scanner.nextDouble());
		return paint;
	}
	public static void showValues(Painting a) {
		System.out.println("Title of the painting: "+a.getTitle());
		System.out.println("Name of the artist: "+a.getArtist());
		System.out.println("Medium of creation: "+a.getMedium());
		System.out.println("Price: $"+a.getPrice());
		System.out.println("Gallery comission: "+a.getGalleryComission());
		System.out.println("\n");
	}
}
