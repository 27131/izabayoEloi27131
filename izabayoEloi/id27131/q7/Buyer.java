package id27131.q7;

public class Buyer extends Seller {
    private String buyerName;
    private String email;

    public Buyer(int id, String createdDate, String updatedDate,
                 String agencyName, String location, String phoneNumber,
                 String agentName, String agentEmail, String licenseNumber,
                 String propertyCode, String propertyType, double price,
                 String sellerName, String sellerContact,
                 String buyerName, String email) throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber,
              agentName, agentEmail, licenseNumber, propertyCode, propertyType, price,
              sellerName, sellerContact);

        if (buyerName == null || buyerName.isEmpty()) throw new RealEstateDataException("Buyer name required");
        if (!email.matches(".+@.+")) throw new RealEstateDataException("Invalid email");

        this.buyerName = buyerName;
        this.email = email;
    }

    public String getBuyerName() { return buyerName; }
    public String getEmail() { return email; }
}
