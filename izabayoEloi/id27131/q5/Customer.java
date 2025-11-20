package id27131.q5;

public class Customer extends Vehicle {
    private String customerName;
    private String licenseNumber;
    private String contactNumber;

    public Customer(int id, String createdDate, String updatedDate,
                    String companyName, String address, String phoneNumber,
                    String branchName, String locationCode,
                    String vehicleType, String registrationNumber, double dailyRate,
                    String customerName, String licenseNumber, String contactNumber)
            throws RentalDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode,
              vehicleType, registrationNumber, dailyRate);
        setCustomerName(customerName);
        setLicenseNumber(licenseNumber);
        setContactNumber(contactNumber);
    }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) throws RentalDataException {
        if (customerName == null || customerName.trim().isEmpty())
            throw new RentalDataException("Customer name required");
        this.customerName = customerName;
    }

    public String getLicenseNumber() { return licenseNumber; }
    public void setLicenseNumber(String licenseNumber) throws RentalDataException {
        if (licenseNumber == null || licenseNumber.trim().isEmpty())
            throw new RentalDataException("License required");
        this.licenseNumber = licenseNumber;
    }

    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) throws RentalDataException {
        if (contactNumber == null || !contactNumber.matches("\\d{10}"))
            throw new RentalDataException("Contact must be 10 digits");
        this.contactNumber = contactNumber;
    }
}
