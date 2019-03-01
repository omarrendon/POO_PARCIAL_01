package cap04;

public class TestBloodData {
	public static void main(String[] args) {
		BloodData sangre1 = new BloodData();
		System.out.printf("Tipo de sangre 1: %s%c%n",sangre1.getBloodType(), sangre1.getRhFactor());
		BloodData sangre2 = new BloodData("AB", '-');
		System.out.printf("Tipo de sangre 1: %s%c",sangre2.getBloodType(), sangre2.getRhFactor());
	}
}
