package id27131.q5;

public class Payment {
    private String paymentMode;
    private String transactionId;

    public Payment(String paymentMode, String transactionId) throws RentalDataException {
        if (paymentMode == null || paymentMode.isEmpty()) throw new RentalDataException("Payment mode cannot be empty");
        if (transactionId == null || transactionId.isEmpty()) throw new RentalDataException("Transaction ID cannot be empty");
        this.paymentMode = paymentMode;
        this.transactionId = transactionId;
    }

    public String getPaymentMode() { return paymentMode; }
    public String getTransactionId() { return transactionId; }
}
