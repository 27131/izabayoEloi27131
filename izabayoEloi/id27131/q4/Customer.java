package id27131.q4;

public class Customer extends Entity {
    private String customerName;
    private String customerEmail;
    private String contactNumber;

    public Customer(int id, String createdDate, String updatedDate, String customerName, String customerEmail, String contactNumber) throws ReservationDataException {
        super(id, createdDate, updatedDate);

        if (customerName == null || customerName.trim().isEmpty())
            throw new ReservationDataException("Customer name cannot be empty");
        this.customerName = customerName;

        if (customerEmail == null || !customerEmail.contains("@"))
            throw new ReservationDataException("Invalid email");
        this.customerEmail = customerEmail;

        if (contactNumber == null || !contactNumber.matches("\\d{10}"))
            throw new ReservationDataException("Contact number must be 10 digits");
        this.contactNumber = contactNumber;
    }

    public String getCustomerName() { return customerName; }
    public String getCustomerEmail() { return customerEmail; }
    public String getContactNumber() { return contactNumber; }
}
