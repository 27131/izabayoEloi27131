package id27131.q7;

public class Payment extends Entity {
    private double paymentAmount;
    private String paymentDate;

    public Payment(int id, String createdDate, String updatedDate, double paymentAmount, String paymentDate) throws RealEstateDataException {
        super(id, createdDate, updatedDate);
        if (paymentAmount <= 0) throw new RealEstateDataException("Payment amount must be > 0");
        if (paymentDate == null || paymentDate.isEmpty()) throw new RealEstateDataException("Payment date cannot be empty");
        this.paymentAmount = paymentAmount;
        this.paymentDate = paymentDate;
    }

    public double getPaymentAmount() { return paymentAmount; }
    public String getPaymentDate() { return paymentDate; }
}
