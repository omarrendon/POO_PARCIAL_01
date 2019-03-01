package cap04;

public class SandwichFilling {
	private String FillingType;
	private Double calories;
	public SandwichFilling(String type, Double calories) {
		FillingType = type;
		this.calories = calories;
	}
	public String getFillingType() {
		return FillingType;
	}
	public Double getCalories() {
		return calories;
	}
}
