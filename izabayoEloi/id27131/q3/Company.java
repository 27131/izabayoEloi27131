package id27131.q3;

public class Company extends Entity {
    private String companyName;
    private String address;
    private String phoneNumber;
    private String email;

    public Company(int id, String createdDate, String updatedDate,
                   String companyName, String address, String phoneNumber, String email) throws PayrollException {
        super(id, createdDate, updatedDate);

        if (companyName == null || companyName.trim().isEmpty()) throw new PayrollException("Company name cannot be empty");
        if (address == null || address.trim().isEmpty()) throw new PayrollException("Address cannot be empty");
        if (!phoneNumber.matches("\\d{10}")) throw new PayrollException("Phone must be 10 digits");
        if (!email.matches(".+@.+")) throw new PayrollException("Invalid email format");

        this.companyName = companyName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getCompanyName() { return companyName; }
    public String getAddress() { return address; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getEmail() { return email; }
}
