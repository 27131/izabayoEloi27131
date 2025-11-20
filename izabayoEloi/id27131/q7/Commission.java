package id27131.q7;

public class Commission extends Payment {
    private double commissionRate; // in %
    private double commissionAmount;

    public Commission(int id, String createdDate, String updatedDate,
                      String agencyName, String location, String phoneNumber,
                      String agentName, String agentEmail, String licenseNumber,
                      String propertyCode, String propertyType, double price,
                      String sellerName, String sellerContact,
                      String buyerName, String buyerEmail,
                      String agreementDate, String terms,
                      double paymentAmount, String paymentDate,
                      double commissionRate) throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber,
              agentName, agentEmail, licenseNumber,
              propertyCode, propertyType, price,
              sellerName, sellerContact, buyerName, buyerEmail,
              agreementDate, terms,
              paymentAmount, paymentDate);
        setCommissionRate(commissionRate);
        calculateCommission();
    }

    public double getCommissionRate() { return commissionRate; }
    public void setCommissionRate(double commissionRate) throws RealEstateDataException {
        if (commissionRate < 0) throw new RealEstateDataException("Rate must be >= 0");
        this.commissionRate = commissionRate;
    }

    public double getCommissionAmount() { return commissionAmount; }
    public void calculateCommission() {
        this.commissionAmount = getPaymentAmount() * commissionRate / 100;
    }
}
