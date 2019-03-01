package cap03;

public class Event {
	public static final Integer PRIZEPERGUEST = 35;
	public static final Integer LARGEEVENT = 50;
	private String eventNumber;
	private Integer numberOfGuests;
	private Double price;
	public void setEventNumber(String eventNumber) {
		this.eventNumber = eventNumber;
	}
	public void setGuests(Integer guests) {
		this.numberOfGuests = guests;
		price = (double)numberOfGuests*PRIZEPERGUEST;
	}
	public String getEventNumber() {
		return eventNumber;
	}
	public Integer getNumberOfGuests() {
		return numberOfGuests;
	}
	public Double getPrice() {
		return price;
	}
}
