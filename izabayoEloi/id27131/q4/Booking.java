package id27131.q4;

public class Booking extends Entity {
    private String bookingDate;
    private String checkInDate;
    private String checkOutDate;

    public Booking(int id, String createdDate, String updatedDate, String bookingDate, String checkInDate, String checkOutDate) throws ReservationDataException {
        super(id, createdDate, updatedDate);

        if (bookingDate == null || bookingDate.trim().isEmpty())
            throw new ReservationDataException("Booking date cannot be empty");
        this.bookingDate = bookingDate;

        if (checkInDate == null || checkInDate.trim().isEmpty())
            throw new ReservationDataException("Check-in date cannot be empty");
        this.checkInDate = checkInDate;

        if (checkOutDate == null || checkOutDate.trim().isEmpty())
            throw new ReservationDataException("Check-out date cannot be empty");
        this.checkOutDate = checkOutDate;
    }

    public String getBookingDate() { return bookingDate; }
    public String getCheckInDate() { return checkInDate; }
    public String getCheckOutDate() { return checkOutDate; }
}
