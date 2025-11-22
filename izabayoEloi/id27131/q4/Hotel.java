package id27131.q4;

public class Hotel extends Entity {
    private String hotelName;
    private String address;
    private String phoneNumber;
    private String email;

    public Hotel(int id, String createdDate, String updatedDate,
                 String hotelName, String address, String phoneNumber, String email) throws ReservationException {
        super(id, createdDate, updatedDate);
        if (hotelName == null || hotelName.trim().isEmpty()) throw new ReservationException("Hotel name cannot be empty");
        if (address == null || address.trim().isEmpty()) throw new ReservationException("Address cannot be empty");
        if (!phoneNumber.matches("\\d{10}")) throw new ReservationException("Phone must be 10 digits");
        if (!email.matches(".+@.+")) throw new ReservationException("Invalid email format");
        this.hotelName = hotelName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getHotelName() { return hotelName; }
    public String getAddress() { return address; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getEmail() { return email; }
}
