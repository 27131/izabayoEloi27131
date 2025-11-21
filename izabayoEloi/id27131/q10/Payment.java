package id27131.q10;

public class Payment extends Entity {
    private String paymentMethod;
    private String paymentStatus;

    public Payment(int id, String createdDate, String updatedDate, String paymentMethod, String paymentStatus) throws OrderDataException {
        super(id, createdDate, updatedDate);
        if (paymentMethod == null || paymentMethod.isEmpty()) throw new OrderDataException("Payment method cannot be empty");
        if (paymentStatus == null || paymentStatus.isEmpty()) throw new OrderDataException("Payment status cannot be empty");
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
    }

    public String getPaymentMethod() { return paymentMethod; }
    public String getPaymentStatus() { return paymentStatus; }
}
