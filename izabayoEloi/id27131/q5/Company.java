package id27131.q5;

public class Company extends Entity {
    private String companyName;
    private String address;
    private String phoneNumber;

    public Company(int id, String createdDate, String updatedDate,
                   String companyName, String address, String phoneNumber) throws RentalException {
        super(id, createdDate, updatedDate);
        if (companyName == null || companyName.trim().isEmpty())
            throw new RentalException("Company name cannot be empty");
        if (address == null || address.trim().isEmpty())
            throw new RentalException("Address cannot be empty");
        if (!phoneNumber.matches("\\d{10}"))
            throw new RentalException("Phone must be 10 digits");
        this.companyName = companyName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getCompanyName() { return companyName; }
    public String getAddress() { return address; }
    public String getPhoneNumber() { return phoneNumber; }
}
