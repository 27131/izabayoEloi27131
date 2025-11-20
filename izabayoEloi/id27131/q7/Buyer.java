package id27131.q7;

public class Buyer extends Seller {
    private String buyerName;
    private String email;

    public Buyer(int id, String createdDate, String updatedDate,
                 String agencyName, String location, String phoneNumber,
                 String agentName, String agentEmail, String licenseNumber,
                 String propertyCode, String propertyType, double price,
                 String sellerName, String sellerContact,
                 String buyerName, String buyerEmail) throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber,
              agentName, agentEmail, licenseNumber,
              propertyCode, propertyType, price,
              sellerName, sellerContact);
        setBuyerName(buyerName);
        setEmail(buyerEmail);
    }

    public String getBuyerName() { return buyerName; }
    public void setBuyerName(String buyerName) throws RealEstateDataException {
        if (buyerName == null || buyerName.trim().isEmpty())
            throw new RealEstateDataException("Buyer name required");
        this.buyerName = buyerName;
    }

    public String getEmail() { return email; }
    public void setEmail(String email) throws RealEstateDataException {
        if (email == null || !email.matches("^(.+)@(.+)$"))
            throw new RealEstateDataException("Valid buyer email required");
        this.email = email;
    }
}
