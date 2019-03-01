package cap04;

import java.util.GregorianCalendar;

public class YearEnd {
	public static void main(String[] args) {
		GregorianCalendar now = new GregorianCalendar();
		GregorianCalendar yearEnd = new GregorianCalendar(now.get(GregorianCalendar.YEAR), 11, 31);
		System.out.println("Fin de año: "+yearEnd.get(GregorianCalendar.DAY_OF_YEAR));
		System.out.println("Dia actual: "+now.get(GregorianCalendar.DAY_OF_YEAR));
		System.out.printf("Faltan %d dias para el fin de año mes%n%n",
		(yearEnd.get(GregorianCalendar.DAY_OF_YEAR)-now.get(GregorianCalendar.DAY_OF_YEAR)));
		
	}
}
