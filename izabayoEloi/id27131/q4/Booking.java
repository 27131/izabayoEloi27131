package id27131.q4;

public class Booking extends Customer {
    private String bookingDate;
    private String checkInDate;
    private String checkOutDate;

    public Booking(int id, String createdDate, String updatedDate,
                   String hotelName, String address, String phoneNumber, String email,
                   int roomNumber, String roomType, double pricePerNight,
                   String customerName, String customerEmail, String contactNumber,
                   String bookingDate, String checkInDate, String checkOutDate) throws ReservationException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email,
              roomNumber, roomType, pricePerNight, customerName, customerEmail, contactNumber);
        if (bookingDate == null || bookingDate.trim().isEmpty() ||
            checkInDate == null || checkInDate.trim().isEmpty() ||
            checkOutDate == null || checkOutDate.trim().isEmpty())
            throw new ReservationException("Dates cannot be empty");
        this.bookingDate = bookingDate;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public String getBookingDate() { return bookingDate; }
    public String getCheckInDate() { return checkInDate; }
    public String getCheckOutDate() { return checkOutDate; }
}
