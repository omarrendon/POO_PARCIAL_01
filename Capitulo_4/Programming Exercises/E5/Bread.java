package cap04;


public class Bread {
	private String breadType;
	private Double caloriesPerSlice;
	public static final String MOTTO = "The staff of life";
	public Bread(String type, Double calories) {
		breadType = type;
		caloriesPerSlice = calories;
		
	}
	
	public String getBreadType() {
		return breadType;
	}
	public Double getCaloriesPerSlice() {
		return caloriesPerSlice;
	}

}
