package id27131.q9;

public class Airline extends Entity {
    private String airlineName;
    private String address;
    private String contactEmail;

    public Airline(int id, String createdDate, String updatedDate, String airlineName, String address, String contactEmail) throws TicketDataException {
        super(id, createdDate, updatedDate);
        if (airlineName == null || airlineName.isEmpty()) throw new TicketDataException("Airline name cannot be empty");
        if (address == null || address.isEmpty()) throw new TicketDataException("Address cannot be empty");
        if (contactEmail == null || !contactEmail.matches(".+@.+\\..+")) throw new TicketDataException("Invalid email format");
        this.airlineName = airlineName;
        this.address = address;
        this.contactEmail = contactEmail;
    }

    public String getAirlineName() { return airlineName; }
    public String getAddress() { return address; }
    public String getContactEmail() { return contactEmail; }
}
