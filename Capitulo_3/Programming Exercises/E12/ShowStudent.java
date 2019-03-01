package cap03;

public class ShowStudent {
	public static void main(String[] args) {
		Student jose = new Student();
		jose.setidNumber(1717);
		jose.setcreditHours(17);
		jose.setPoints(177);
		jose.gradePointAverage();
		jose.showIdNumber();
		jose.showCreditHours();
		jose.showPoints();
		jose.showGradePointAverage();
	}
}
