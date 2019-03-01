package cap04;

import java.util.GregorianCalendar;

public class NextMonth {
	public static void main(String[] args) {
		GregorianCalendar now = new GregorianCalendar();
		GregorianCalendar nextMonth = new GregorianCalendar(now.get(GregorianCalendar.YEAR), 
				now.get(GregorianCalendar.MONTH)+1, 1);
		System.out.printf("Faltan %d dias para el siguiente mes%n%n",
		(nextMonth.get(GregorianCalendar.DAY_OF_YEAR)-now.get(GregorianCalendar.DAY_OF_YEAR)));
		
	}
}
