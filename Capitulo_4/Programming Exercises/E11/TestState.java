package cap04;

public class TestState {
	public static void main(String[] args) {
		State oaxaca = new State("Oaxaca", 3800000, "Oaxaca de Juárez", 255029, "Oaxaca de Juárez2.0", 299999);
		//como la capital y ciudad mas poblada es la misma cambie nombres y datos para diferenciar
		State dfctuoso = new State("CDMX", 8800000, "Ecatepunk", 1600000, "Iztapayork", 1827868);
		System.out.println("\tEstado 1:");
		System.out.println("Nombre del estado: "+oaxaca.getStateName());
		System.out.println("Población del estado: "+oaxaca.getPopulation());
		System.out.println("Nombre de su ciudad capital: "+oaxaca.getCapitalCityName());
		System.out.println("Población de su ciudad capital: "+oaxaca.getCapCityPopulation());
		System.out.println("Nombre de su ciudad más poblada: "+oaxaca.getMostPopCityName());
		System.out.println("Población de su ciudad más poblada: "+oaxaca.getMostPopCityPopulation());
		System.out.println("\n\tEstado 2:");
		System.out.println("Nombre del estado: "+dfctuoso.getStateName());
		System.out.println("Población del estado: "+dfctuoso.getPopulation());
		System.out.println("Nombre de su ciudad capital: "+dfctuoso.getCapitalCityName());
		System.out.println("Población de su ciudad capital: "+dfctuoso.getCapCityPopulation());
		System.out.println("Nombre de su ciudad más poblada: "+dfctuoso.getMostPopCityName());
		System.out.println("Población de su ciudad más poblada: "+dfctuoso.getMostPopCityPopulation());
	}
}
