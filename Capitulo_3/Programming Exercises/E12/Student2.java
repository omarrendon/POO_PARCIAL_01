package cap03;

public class Student2 {
	private Integer idNumber;
	private Integer creditHours;
	private Integer points;
	private Double gradePointAverage;
	public Student2() {
		idNumber = 9999;
		creditHours = 3;
		points = 12;
	}
	public void setidNumber(Integer idNumber) {
		this.idNumber = idNumber;
	}
	public void setcreditHours(Integer creditHours) {
		this.creditHours = creditHours;
	}
	public void setPoints(Integer points) {
		this.points = points;
	}
	public Integer getIdNumber() {
		return idNumber;
	}
	public Integer getCreditHours() {
		return creditHours;
	}
	public Integer getPoints() {
		return points;
	}
	public void showIdNumber() {
		System.out.println("ID: "+idNumber);
	}
	public void showCreditHours() {
		System.out.println("Credit hours earned: "+creditHours);
	}
	public void showPoints() {
		System.out.println("Points earned: "+points);
	}
	public void showGradePointAverage() {
		System.out.printf("Grade point Average: %.2f%n",gradePointAverage);
	}
	public void gradePointAverage() {
		gradePointAverage = (double)points/creditHours;
	}
}
