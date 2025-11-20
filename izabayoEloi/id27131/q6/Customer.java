package id27131.q6;

public class Customer extends Account {
    private String customerName;
    private String email;
    private String phoneNumber;

    public Customer(int id, String createdDate, String updatedDate,
                    String bankName, String branchCode, String address,
                    String accountNumber, double balance, String accountType,
                    String customerName, String email, String phoneNumber) throws BankDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber, balance, accountType);
        setCustomerName(customerName);
        setEmail(email);
        setPhoneNumber(phoneNumber);
    }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) throws BankDataException {
        if (customerName == null || customerName.trim().isEmpty())
            throw new BankDataException("Customer name required");
        this.customerName = customerName;
    }

    public String getEmail() { return email; }
    public void setEmail(String email) throws BankDataException {
        if (email == null || !email.matches("^(.+)@(.+)$"))
            throw new BankDataException("Valid email required");
        this.email = email;
    }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) throws BankDataException {
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}"))
            throw new BankDataException("Phone must be 10 digits");
        this.phoneNumber = phoneNumber;
    }
}
