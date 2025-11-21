package id27131.q6;

public class Customer extends Entity {
    private String customerName;
    private String email;
    private String phoneNumber;

    public Customer(int id, String createdDate, String updatedDate, String customerName, String email, String phoneNumber) throws BankingDataException {
        super(id, createdDate, updatedDate);
        if (customerName == null || customerName.isEmpty()) throw new BankingDataException("Customer name cannot be empty");
        if (email == null || !email.contains("@")) throw new BankingDataException("Invalid email format");
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) throw new BankingDataException("Phone number must be 10 digits");
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerName() { return customerName; }
    public String getEmail() { return email; }
    public String getPhoneNumber() { return phoneNumber; }
}
