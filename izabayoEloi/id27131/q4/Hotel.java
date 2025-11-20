package id27131.q4;

public class Hotel extends Entity {
    private String hotelName;
    private String address;
    private String phoneNumber;
    private String email;

    public Hotel(int id, String createdDate, String updatedDate,
                 String hotelName, String address, String phoneNumber, String email)
            throws ReservationDataException {
        super(id, createdDate, updatedDate);
        setHotelName(hotelName);
        setAddress(address);
        setPhoneNumber(phoneNumber);
        setEmail(email);
    }

    public String getHotelName() { return hotelName; }
    public void setHotelName(String hotelName) throws ReservationDataException {
        if (hotelName == null || hotelName.trim().isEmpty())
            throw new ReservationDataException("Hotel name required");
        this.hotelName = hotelName;
    }

    public String getAddress() { return address; }
    public void setAddress(String address) throws ReservationDataException {
        if (address == null || address.trim().isEmpty())
            throw new ReservationDataException("Address required");
        this.address = address;
    }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) throws ReservationDataException {
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}"))
            throw new ReservationDataException("Phone must be 10 digits");
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() { return email; }
    public void setEmail(String email) throws ReservationDataException {
        if (email == null || !email.contains("@"))
            throw new ReservationDataException("Invalid email");
        this.email = email;
    }
}
