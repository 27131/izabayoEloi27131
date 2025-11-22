package id27131.q8;

public class Payment extends Entity {
    private String paymentDate;
    private String paymentMode;

    public Payment(int id, String createdDate, String updatedDate, String paymentDate, String paymentMode) throws LibraryException {
        super(id, createdDate, updatedDate);
        if (paymentDate == null || paymentDate.isEmpty()) throw new LibraryException("Payment date cannot be empty");
        if (paymentMode == null || paymentMode.isEmpty()) throw new LibraryException("Payment mode cannot be empty");
        this.paymentDate = paymentDate;
        this.paymentMode = paymentMode;
    }

    public String getPaymentDate() { return paymentDate; }
    public String getPaymentMode() { return paymentMode; }
}
