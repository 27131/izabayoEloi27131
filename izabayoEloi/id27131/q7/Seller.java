package id27131.q7;

public class Seller extends Entity {
    private String sellerName;
    private String contactNumber;

    public Seller(int id, String createdDate, String updatedDate, String sellerName, String contactNumber) throws RealEstateDataException {
        super(id, createdDate, updatedDate);
        if (sellerName == null || sellerName.isEmpty()) throw new RealEstateDataException("Seller name cannot be empty");
        if (contactNumber == null || !contactNumber.matches("\\d{10}")) throw new RealEstateDataException("Contact number must be 10 digits");
        this.sellerName = sellerName;
        this.contactNumber = contactNumber;
    }

    public String getSellerName() { return sellerName; }
    public String getContactNumber() { return contactNumber; }
}
