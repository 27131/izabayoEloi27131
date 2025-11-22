package id27131.q4;

public class Customer extends Room {
    private String customerName;
    private String customerEmail;
    private String contactNumber;

    public Customer(int id, String createdDate, String updatedDate,
                    String hotelName, String address, String phoneNumber, String email,
                    int roomNumber, String roomType, double pricePerNight,
                    String customerName, String customerEmail, String contactNumber) throws ReservationException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email, roomNumber, roomType, pricePerNight);
        if (customerName == null || customerName.trim().isEmpty()) throw new ReservationException("Customer name cannot be empty");
        if (!customerEmail.matches(".+@.+")) throw new ReservationException("Invalid email format");
        if (!contactNumber.matches("\\d{10}")) throw new ReservationException("Contact must be 10 digits");
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.contactNumber = contactNumber;
    }

    public String getCustomerName() { return customerName; }
    public String getCustomerEmail() { return customerEmail; }
    public String getContactNumber() { return contactNumber; }
}
