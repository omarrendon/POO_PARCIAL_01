package cap04;

public class BirdSighting {
	private String birdSpecieSighted;
	private Integer numberSeen;
	private Integer dayOfTheYear;
	public BirdSighting() {
		birdSpecieSighted = "robin";
		numberSeen = 1;
		dayOfTheYear = 1;
	}
	public BirdSighting(String species, Integer number, Integer day) {
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
