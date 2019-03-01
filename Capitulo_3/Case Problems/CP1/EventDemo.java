package cap03;

public class EventDemo {
	public static void main(String[] args) {
		Event event1 = new Event();
		event1.setGuests(CarlysEventPriceWithMethods.askingNumberGuests());
		event1.setEventNumber(CarlysEventPriceWithMethods.askingEventNumber());
		CarlysEventPriceWithMethods.motto();
		CarlysEventPriceWithMethods.impresionFinal(event1);
	}
}
