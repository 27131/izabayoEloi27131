package id27131.q7;

public class Payment extends Agreement {
    private double paymentAmount;
    private String paymentDate;

    public Payment(int id, String createdDate, String updatedDate,
                   String agencyName, String location, String phoneNumber,
                   String agentName, String agentEmail, String licenseNumber,
                   String propertyCode, String propertyType, double price,
                   String sellerName, String sellerContact,
                   String buyerName, String buyerEmail,
                   String agreementDate, String terms,
                   double paymentAmount, String paymentDate) throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber,
              agentName, agentEmail, licenseNumber, propertyCode, propertyType, price,
              sellerName, sellerContact, buyerName, buyerEmail,
              agreementDate, terms);

        if (paymentAmount <= 0) throw new RealEstateDataException("Payment amount must be > 0");
        if (paymentDate == null || paymentDate.isEmpty()) throw new RealEstateDataException("Payment date required");

        this.paymentAmount = paymentAmount;
        this.paymentDate = paymentDate;
    }

    public double getPaymentAmount() { return paymentAmount; }
    public String getPaymentDate() { return paymentDate; }
}
