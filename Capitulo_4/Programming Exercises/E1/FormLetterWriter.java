package cap04;

public class FormLetterWriter {
	public static void main(String[] args) {
		displaySalutation("Jose");
		displaySalutation("Jose", "Flores");
	}
	public static void displaySalutation(String name) {
		System.out.println("Dear Mr. or Ms. "+name);
		System.out.println("Thank you for your recent order");
	}
	public static void displaySalutation(String name, String lastName) {
		System.out.println("Dear "+name+" "+lastName);
		System.out.println("Thank you for your recent order");
	}
}
