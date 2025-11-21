package id27131.q5;

public class Company extends Entity {
    private String companyName;
    private String address;
    private String phoneNumber;

    public Company(int id, String createdDate, String updatedDate,
                   String companyName, String address, String phoneNumber) throws RentalDataException {
        super(id, createdDate, updatedDate);
        if (companyName == null || companyName.isEmpty()) throw new RentalDataException("Company name cannot be empty");
        if (address == null || address.isEmpty()) throw new RentalDataException("Address cannot be empty");
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}"))
            throw new RentalDataException("Phone number must be exactly 10 digits");
        this.companyName = companyName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getCompanyName() { return companyName; }
    public String getAddress() { return address; }
    public String getPhoneNumber() { return phoneNumber; }
}
