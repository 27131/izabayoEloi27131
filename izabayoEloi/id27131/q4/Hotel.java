package id27131.q4;

public class Hotel extends Entity {
    private String hotelName;
    private String address;
    private String phoneNumber;
    private String email;

    public Hotel(int id, String createdDate, String updatedDate, String hotelName, String address, String phoneNumber, String email) throws ReservationDataException {
        super(id, createdDate, updatedDate);

        if (hotelName == null || hotelName.trim().isEmpty())
            throw new ReservationDataException("Hotel name cannot be empty");
        this.hotelName = hotelName;

        if (address == null || address.trim().isEmpty())
            throw new ReservationDataException("Address cannot be empty");
        this.address = address;

        if (phoneNumber == null || !phoneNumber.matches("\\d{10}"))
            throw new ReservationDataException("Phone number must be 10 digits");
        this.phoneNumber = phoneNumber;

        if (email == null || !email.contains("@"))
            throw new ReservationDataException("Invalid email");
        this.email = email;
    }

    public String getHotelName() { return hotelName; }
    public String getAddress() { return address; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getEmail() { return email; }
}
