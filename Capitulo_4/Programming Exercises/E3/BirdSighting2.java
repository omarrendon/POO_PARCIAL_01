package cap04;

public class BirdSighting2 {
	private String birdSpecieSighted;
	private Integer numberSeen;
	private Integer dayOfTheYear;
	public BirdSighting2(String species, Integer number, Integer day) {
		birdSpecieSighted = species;
		numberSeen = number;
		dayOfTheYear = day;
	}
	public String getBirdSpecieSighted() {
		return birdSpecieSighted;
	}
	public Integer getNumberSeen() {
		return numberSeen;
	}
	public Integer getDayOfTheYear() {
		return dayOfTheYear;
	}
	
}
