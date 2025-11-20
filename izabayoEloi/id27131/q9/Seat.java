package id27131.q9;

public class Seat extends Passenger {
    private String seatNumber;
    private String seatType;

    public Seat(int id, String createdDate, String updatedDate,
                String airlineName, String address, String contactEmail,
                String flightNumber, String destination, String departureTime,
                String passengerName, String passportNumber, String nationality,
                String seatNumber, String seatType) throws AirlineDataException {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail,
              flightNumber, destination, departureTime,
              passengerName, passportNumber, nationality);
        setSeatNumber(seatNumber);
        setSeatType(seatType);
    }

    public String getSeatNumber() { return seatNumber; }
    public void setSeatNumber(String seatNumber) throws AirlineDataException {
        if (seatNumber == null || seatNumber.trim().isEmpty())
            throw new AirlineDataException("Seat number required");
        this.seatNumber = seatNumber;
    }

    public String getSeatType() { return seatType; }
    public void setSeatType(String seatType) throws AirlineDataException {
        if (!seatType.equalsIgnoreCase("Economy") && !seatType.equalsIgnoreCase("Business"))
            throw new AirlineDataException("Seat type must be Economy or Business");
        this.seatType = seatType;
    }
}
