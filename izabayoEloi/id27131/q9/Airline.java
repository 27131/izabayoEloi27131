package id27131.q9;

public class Airline extends Entity {
    private String airlineName;
    private String address;
    private String contactEmail;

    public Airline(int id, String createdDate, String updatedDate,
                   String airlineName, String address, String contactEmail) throws AirlineDataException {
        super(id, createdDate, updatedDate);
        setAirlineName(airlineName);
        setAddress(address);
        setContactEmail(contactEmail);
    }

    public String getAirlineName() { return airlineName; }
    public void setAirlineName(String airlineName) throws AirlineDataException {
        if (airlineName == null || airlineName.trim().isEmpty())
            throw new AirlineDataException("Airline name required");
        this.airlineName = airlineName;
    }

    public String getAddress() { return address; }
    public void setAddress(String address) throws AirlineDataException {
        if (address == null || address.trim().isEmpty())
            throw new AirlineDataException("Address required");
        this.address = address;
    }

    public String getContactEmail() { return contactEmail; }
    public void setContactEmail(String contactEmail) throws AirlineDataException {
        if (contactEmail == null || !contactEmail.matches("^[A-Za-z0-9+_.-]+@(.+)$"))
            throw new AirlineDataException("Invalid email format");
        this.contactEmail = contactEmail;
    }
}
