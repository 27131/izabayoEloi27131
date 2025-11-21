package id27131.q9;

public class Flight extends Entity {
    private String flightNumber;
    private String destination;
    private String departureTime;

    public Flight(int id, String createdDate, String updatedDate, String flightNumber, String destination, String departureTime) throws TicketDataException {
        super(id, createdDate, updatedDate);
        if (flightNumber == null || flightNumber.isEmpty()) throw new TicketDataException("Flight number cannot be empty");
        if (destination == null || destination.isEmpty()) throw new TicketDataException("Destination cannot be empty");
        if (departureTime == null || departureTime.isEmpty()) throw new TicketDataException("Departure time cannot be empty");
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
    }

    public String getFlightNumber() { return flightNumber; }
    public String getDestination() { return destination; }
    public String getDepartureTime() { return departureTime; }
}
