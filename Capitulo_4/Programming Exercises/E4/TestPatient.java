package cap04;

public class TestPatient {
	public static void main(String[] args) {
		Patient paciente1 = new Patient();
		System.out.println("ID del paciente 1: "+paciente1.getIdNumber());
		System.out.println("Edad del paciente 1: "+paciente1.getAge());
		System.out.printf("Tipo de sangre del paciente1: %s%c%n",
				paciente1.getBlood().getBloodType(),paciente1.getBlood().getRhFactor());
		Patient paciente2 = new Patient(177, 23, "AB", '-');
		System.out.println("ID del paciente 2: "+paciente2.getIdNumber());
		System.out.println("Edad del paciente 2: "+paciente2.getAge());
		System.out.printf("Tipo de sangre del paciente1: %s%c%n",
				paciente2.getBlood().getBloodType(),paciente2.getBlood().getRhFactor());
	}
}
