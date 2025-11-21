package id27131.q3;

public class Company {
    private String companyName;
    private String address;
    private String phone;
    private String email;

    public Company(String companyName, String address, String phone, String email) throws PayrollDataException {
        if (companyName == null || companyName.trim().isEmpty())
            throw new PayrollDataException("Company name cannot be empty");
        this.companyName = companyName;

        if (address == null || address.trim().isEmpty())
            throw new PayrollDataException("Address cannot be empty");
        this.address = address;

        if (phone == null || !phone.matches("\\d{10}"))
            throw new PayrollDataException("Phone must be exactly 10 digits");
        this.phone = phone;

        if (email == null || !email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$"))
            throw new PayrollDataException("Invalid email format");
        this.email = email;
    }

    public String getCompanyName() { return companyName; }
    public String getAddress() { return address; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }
}
