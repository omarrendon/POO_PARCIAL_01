package cap04;

public class Patient {
	private Integer idNumber;
	private Integer age;
	private BloodData blood = new BloodData();
	public Patient () {
		idNumber = 0;
		age = 0;
		blood.setBloodType("O");
		blood.setRhFactor('+');
	}
	public Patient(Integer idNumber, Integer age, String type, char factor) {
		this.idNumber = idNumber;
		this.age = age;
		blood.setBloodType(type);
		blood.setRhFactor(factor);
	}
	public Integer getIdNumber() {
		return idNumber;
	}
	public Integer getAge() {
		return age;
	}
	public BloodData getBlood() {
		return blood;
	}
}
