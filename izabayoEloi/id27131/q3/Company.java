package id27131.q3;

public class Company extends Entity {
    private String companyName;
    private String address;
    private String phoneNumber;
    private String email;

    public Company(int id, String createdDate, String updatedDate,
                   String companyName, String address, String phoneNumber, String email)
            throws PayrollDataException {
        super(id, createdDate, updatedDate);
        setCompanyName(companyName);
        setAddress(address);
        setPhoneNumber(phoneNumber);
        setEmail(email);
    }

    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) throws PayrollDataException {
        if (companyName == null || companyName.trim().isEmpty())
            throw new PayrollDataException("Company name cannot be empty");
        this.companyName = companyName;
    }

    public String getAddress() { return address; }
    public void setAddress(String address) throws PayrollDataException {
        if (address == null || address.trim().isEmpty())
            throw new PayrollDataException("Address cannot be empty");
        this.address = address;
    }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) throws PayrollDataException {
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}"))
            throw new PayrollDataException("Phone must be 10 digits");
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() { return email; }
    public void setEmail(String email) throws PayrollDataException {
        if (email == null || !email.contains("@"))
            throw new PayrollDataException("Invalid email");
        this.email = email;
    }
}
