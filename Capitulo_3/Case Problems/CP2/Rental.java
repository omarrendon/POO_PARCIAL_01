package cap03;

public class Rental {
	public static final Integer HOURMINUTES = 60;
	public static final Integer RENTALRATE = 40;
	private String contractNumber;
	private Integer rentalHours;
	private Integer extraMinutes;
	private Integer price;
	public void setContractNumber(String contract) {
		contractNumber = contract;
	}
	public void setHoursAndMinutes(Integer minutes) {
		rentalHours = minutes/60;
		extraMinutes = minutes%60;
		price = (minutes<60 && minutes>0) ? 40 : rentalHours*40+extraMinutes;
		
	}
	public String getContractNumber() {
		return contractNumber;
	}
	public Integer getRentalHours() {
		return rentalHours;
	}
	public Integer getExtraMinutes() {
		return extraMinutes;
	}
	public Integer getPrice() {
		return price;
	}
	
}
