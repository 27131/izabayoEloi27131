package id27131.q4;

public class Payment extends Entity {
    private String paymentMethod;
    private String paymentDate;

    public Payment(int id, String createdDate, String updatedDate, String paymentMethod, String paymentDate) throws ReservationDataException {
        super(id, createdDate, updatedDate);

        if (paymentMethod == null || paymentMethod.trim().isEmpty())
            throw new ReservationDataException("Payment method cannot be empty");
        this.paymentMethod = paymentMethod;

        if (paymentDate == null || paymentDate.trim().isEmpty())
            throw new ReservationDataException("Payment date cannot be empty");
        this.paymentDate = paymentDate;
    }

    public String getPaymentMethod() { return paymentMethod; }
    public String getPaymentDate() { return paymentDate; }
}
