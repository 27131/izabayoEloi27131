package id27131.q9;

public class Passenger extends Entity {
    private String passengerName;
    private String passportNumber;
    private String nationality;

    public Passenger(int id, String createdDate, String updatedDate, String passengerName, String passportNumber, String nationality) throws TicketDataException {
        super(id, createdDate, updatedDate);
        if (passengerName == null || passengerName.isEmpty()) throw new TicketDataException("Passenger name cannot be empty");
        if (passportNumber == null || passportNumber.isEmpty()) throw new TicketDataException("Passport number cannot be empty");
        if (nationality == null || nationality.isEmpty()) throw new TicketDataException("Nationality cannot be empty");
        this.passengerName = passengerName;
        this.passportNumber = passportNumber;
        this.nationality = nationality;
    }

    public String getPassengerName() { return passengerName; }
    public String getPassportNumber() { return passportNumber; }
    public String getNationality() { return nationality; }
}
