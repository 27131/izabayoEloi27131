package id27131.q4;

public class Feedback extends Bill {
    private int rating; // 1-5
    private String comments;

    public Feedback(int id, String createdDate, String updatedDate,
                    String hotelName, String address, String phoneNumber, String email,
                    int roomNumber, String roomType, double pricePerNight,
                    String customerName, String customerEmail, String contactNumber,
                    String bookingDate, String checkInDate, String checkOutDate,
                    String serviceName, double serviceCost,
                    String paymentMethod, String paymentDate,
                    int rating, String comments) throws ReservationException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email,
              roomNumber, roomType, pricePerNight, customerName, customerEmail, contactNumber,
              bookingDate, checkInDate, checkOutDate, serviceName, serviceCost, paymentMethod, paymentDate);
        if (rating < 1 || rating > 5) throw new ReservationException("Rating must be between 1 and 5");
        if (comments == null || comments.trim().isEmpty()) throw new ReservationException("Comments cannot be empty");
        this.rating = rating;
        this.comments = comments;
    }

    public int getRating() { return rating; }
    public String getComments() { return comments; }
}
