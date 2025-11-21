package id27131.q5;

public class Customer extends Entity {
    private String customerName;
    private String licenseNumber;
    private String contactNumber;

    public Customer(int id, String createdDate, String updatedDate, String customerName, String licenseNumber, String contactNumber) throws RentalDataException {
        super(id, createdDate, updatedDate);
        if (customerName == null || customerName.isEmpty()) throw new RentalDataException("Customer name cannot be empty");
        if (licenseNumber == null || licenseNumber.isEmpty()) throw new RentalDataException("License number cannot be empty");
        if (contactNumber == null || !contactNumber.matches("\\d{10}"))
            throw new RentalDataException("Contact number must be exactly 10 digits");
        this.customerName = customerName;
        this.licenseNumber = licenseNumber;
        this.contactNumber = contactNumber;
    }

    public String getCustomerName() { return customerName; }
    public String getLicenseNumber() { return licenseNumber; }
    public String getContactNumber() { return contactNumber; }
}
