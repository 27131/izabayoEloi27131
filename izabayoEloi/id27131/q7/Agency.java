package id27131.q7;

public class Agency extends Entity {
    private String agencyName;
    private String location;
    private String phoneNumber;

    public Agency(int id, String createdDate, String updatedDate, String agencyName, String location, String phoneNumber) throws RealEstateDataException {
        super(id, createdDate, updatedDate);
        if (agencyName == null || agencyName.isEmpty()) throw new RealEstateDataException("Agency name required");
        if (location == null || location.isEmpty()) throw new RealEstateDataException("Location required");
        if (!phoneNumber.matches("\\d{10}")) throw new RealEstateDataException("Phone must be 10 digits");

        this.agencyName = agencyName;
        this.location = location;
        this.phoneNumber = phoneNumber;
    }

    public String getAgencyName() { return agencyName; }
    public String getLocation() { return location; }
    public String getPhoneNumber() { return phoneNumber; }
}
