package id27131.q6;

public class Customer extends Account {
    private String customerName;
    private String email;
    private String phoneNumber;

    public Customer(int id, String createdDate, String updatedDate,
                    String bankName, String branchCode, String address,
                    String accountNumber, String accountType, double balance,
                    String customerName, String email, String phoneNumber) throws BankingException {
        super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber, accountType, balance);
        if (customerName == null || customerName.trim().isEmpty()) throw new BankingException("Customer name cannot be empty");
        if (email == null || !email.matches(".+@.+")) throw new BankingException("Invalid email format");
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) throw new BankingException("Phone number must be 10 digits");
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerName() { return customerName; }
    public String getEmail() { return email; }
    public String getPhoneNumber() { return phoneNumber; }
}
