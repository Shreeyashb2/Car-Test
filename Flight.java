package snippet;

public class Flight {
	private int flightNumber;
	String flightName;
	String source;
	String destination;
	int tripCost;
	public Flight(int flightNumber, String flightName, String source, String destination, int tripCost) {
		super();
		this.flightNumber = flightNumber;
		this.flightName = flightName;
		this.source = source;
		this.destination = destination;
		this.tripCost = tripCost;
	}
	public Flight(int flightNumber, String flightName) {
		super();
		this.flightNumber = flightNumber;
		this.flightName = flightName;
	}
	public Flight(String source, String destination, int tripCost) {
		super();
		this.source = source;
		this.destination = destination;
		this.tripCost = tripCost;
	}
	public Flight(int tripCost) {
		super();
		this.tripCost = tripCost;
	}

}
