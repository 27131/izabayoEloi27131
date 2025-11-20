package id27131.q4;

public class Feedback extends Bill {
    private int rating;
    private String comments;

    public Feedback(int id, String createdDate, String updatedDate,
                    String hotelName, String address, String phoneNumber, String email,
                    int roomNumber, String roomType, double pricePerNight,
                    String customerName, String customerEmail, String contactNumber,
                    String bookingDate, String checkInDate, String checkOutDate,
                    String serviceName, double serviceCost,
                    String paymentMethod, String paymentDate,
                    double roomCharge, double serviceCharge, double totalBill,
                    int rating, String comments)
            throws ReservationDataException {

        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email,
              roomNumber, roomType, pricePerNight,
              customerName, customerEmail, contactNumber,
              bookingDate, checkInDate, checkOutDate,
              serviceName, serviceCost,
              paymentMethod, paymentDate,
              roomCharge, serviceCharge, totalBill);

        setRating(rating);
        setComments(comments);
    }

    public int getRating() { return rating; }
    public void setRating(int rating) throws ReservationDataException {
        if (rating < 1 || rating > 5)
            throw new ReservationDataException("Rating must be 1–5");
        this.rating = rating;
    }

    public String getComments() { return comments; }
    public void setComments(String comments) throws ReservationDataException {
        if (comments == null || comments.trim().isEmpty())
            throw new ReservationDataException("Comments required");
        this.comments = comments;
    }
}
