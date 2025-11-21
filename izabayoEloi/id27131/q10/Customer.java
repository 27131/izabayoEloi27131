package id27131.q10;

public class Customer extends Entity {
    private String customerName;
    private String contactNumber;
    private String address;

    public Customer(int id, String createdDate, String updatedDate, String customerName, String contactNumber, String address) throws OrderDataException {
        super(id, createdDate, updatedDate);
        if (customerName == null || customerName.isEmpty()) throw new OrderDataException("Customer name cannot be empty");
        if (contactNumber == null || contactNumber.isEmpty()) throw new OrderDataException("Contact number cannot be empty");
        if (address == null || address.isEmpty()) throw new OrderDataException("Address cannot be empty");
        this.customerName = customerName;
        this.contactNumber = contactNumber;
        this.address = address;
    }

    public String getCustomerName() { return customerName; }
    public String getContactNumber() { return contactNumber; }
    public String getAddress() { return address; }
}
