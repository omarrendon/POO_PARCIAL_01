package cap04;

public class BloodData {
	String bloodType;
	char rhFactor;
	public BloodData() {
		bloodType = "O";
		rhFactor = '+';
	}
	public BloodData(String type, char factor) {
		bloodType = type;
		rhFactor = factor;
	}
	public String getBloodType() {
		return bloodType;
	}
	public char getRhFactor() {
		return rhFactor;
	}
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
	public void setRhFactor(char rh) {
		rhFactor = rh;
	}
}

