package id27131.q4;

public class Customer extends Room {
    private String customerName;
    private String customerEmail;
    private String contactNumber;

    public Customer(int id, String createdDate, String updatedDate,
                    String hotelName, String address, String phoneNumber, String email,
                    int roomNumber, String roomType, double pricePerNight,
                    String customerName, String customerEmail, String contactNumber)
            throws ReservationDataException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email,
              roomNumber, roomType, pricePerNight);
        setCustomerName(customerName);
        setCustomerEmail(customerEmail);
        setContactNumber(contactNumber);
    }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) throws ReservationDataException {
        if (customerName == null || customerName.trim().isEmpty())
            throw new ReservationDataException("Customer name required");
        this.customerName = customerName;
    }

    public String getCustomerEmail() { return customerEmail; }
    public void setCustomerEmail(String customerEmail) throws ReservationDataException {
        if (customerEmail == null || !customerEmail.contains("@"))
            throw new ReservationDataException("Invalid customer email");
        this.customerEmail = customerEmail;
    }

    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) throws ReservationDataException {
        if (contactNumber == null || !contactNumber.matches("\\d{10}"))
            throw new ReservationDataException("Contact number must be 10 digits");
        this.contactNumber = contactNumber;
    }
}
