package id27131.q9;

public class Passenger extends Flight {
    private String passengerName;
    private String passportNumber;
    private String nationality;

    public Passenger(int id, String createdDate, String updatedDate,
                     String airlineName, String address, String contactEmail,
                     String flightNumber, String destination, String departureTime,
                     String passengerName, String passportNumber, String nationality) throws AirlineDataException {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail,
              flightNumber, destination, departureTime);
        setPassengerName(passengerName);
        setPassportNumber(passportNumber);
        setNationality(nationality);
    }

    public String getPassengerName() { return passengerName; }
    public void setPassengerName(String passengerName) throws AirlineDataException {
        if (passengerName == null || passengerName.trim().isEmpty())
            throw new AirlineDataException("Passenger name required");
        this.passengerName = passengerName;
    }

    public String getPassportNumber() { return passportNumber; }
    public void setPassportNumber(String passportNumber) throws AirlineDataException {
        if (passportNumber == null || passportNumber.trim().isEmpty())
            throw new AirlineDataException("Passport number required");
        this.passportNumber = passportNumber;
    }

    public String getNationality() { return nationality; }
    public void setNationality(String nationality) throws AirlineDataException {
        if (nationality == null || nationality.trim().isEmpty())
            throw new AirlineDataException("Nationality required");
        this.nationality = nationality;
    }
}
