package id27131.q4;

public class Payment extends Service {
    private String paymentMethod;
    private String paymentDate;

    public Payment(int id, String createdDate, String updatedDate,
                   String hotelName, String address, String phoneNumber, String email,
                   int roomNumber, String roomType, double pricePerNight,
                   String customerName, String customerEmail, String contactNumber,
                   String bookingDate, String checkInDate, String checkOutDate,
                   String serviceName, double serviceCost,
                   String paymentMethod, String paymentDate)
            throws ReservationDataException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email,
              roomNumber, roomType, pricePerNight,
              customerName, customerEmail, contactNumber,
              bookingDate, checkInDate, checkOutDate,
              serviceName, serviceCost);
        setPaymentMethod(paymentMethod);
        setPaymentDate(paymentDate);
    }

    public String getPaymentMethod() { return paymentMethod; }
    public void setPaymentMethod(String paymentMethod) throws ReservationDataException {
        if (paymentMethod == null || paymentMethod.trim().isEmpty())
            throw new ReservationDataException("Payment method required");
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentDate() { return paymentDate; }
    public void setPaymentDate(String paymentDate) throws ReservationDataException {
        if (paymentDate == null || paymentDate.trim().isEmpty())
            throw new ReservationDataException("Payment date required");
        this.paymentDate = paymentDate;
    }
}
