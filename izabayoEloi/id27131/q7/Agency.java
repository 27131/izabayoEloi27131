package id27131.q7;

public class Agency extends Entity {
    private String agencyName;
    private String location;
    private String phoneNumber;

    public Agency(int id, String createdDate, String updatedDate,
                  String agencyName, String location, String phoneNumber) throws RealEstateDataException {
        super(id, createdDate, updatedDate);
        setAgencyName(agencyName);
        setLocation(location);
        setPhoneNumber(phoneNumber);
    }

    public String getAgencyName() { return agencyName; }
    public void setAgencyName(String agencyName) throws RealEstateDataException {
        if (agencyName == null || agencyName.trim().isEmpty())
            throw new RealEstateDataException("Agency name required");
        this.agencyName = agencyName;
    }

    public String getLocation() { return location; }
    public void setLocation(String location) throws RealEstateDataException {
        if (location == null || location.trim().isEmpty())
            throw new RealEstateDataException("Location required");
        this.location = location;
    }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) throws RealEstateDataException {
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}"))
            throw new RealEstateDataException("Phone must be 10 digits");
        this.phoneNumber = phoneNumber;
    }
}
