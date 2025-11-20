package id27131.q5;

public class Company extends Entity {
    private String companyName;
    private String address;
    private String phoneNumber;

    public Company(int id, String createdDate, String updatedDate, String companyName, String address, String phoneNumber)
            throws RentalDataException {
        super(id, createdDate, updatedDate);
        setCompanyName(companyName);
        setAddress(address);
        setPhoneNumber(phoneNumber);
    }

    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) throws RentalDataException {
        if (companyName == null || companyName.trim().isEmpty())
            throw new RentalDataException("Company name required");
        this.companyName = companyName;
    }

    public String getAddress() { return address; }
    public void setAddress(String address) throws RentalDataException {
        if (address == null || address.trim().isEmpty())
            throw new RentalDataException("Address required");
        this.address = address;
    }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) throws RentalDataException {
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}"))
            throw new RentalDataException("Phone must be 10 digits");
        this.phoneNumber = phoneNumber;
    }
}
