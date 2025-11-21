package id27131.q7;

public class Buyer extends Entity {
    private String buyerName;
    private String email;

    public Buyer(int id, String createdDate, String updatedDate, String buyerName, String email) throws RealEstateDataException {
        super(id, createdDate, updatedDate);
        if (buyerName == null || buyerName.isEmpty()) throw new RealEstateDataException("Buyer name cannot be empty");
        if (email == null || !email.contains("@")) throw new RealEstateDataException("Invalid email");
        this.buyerName = buyerName;
        this.email = email;
    }

    public String getBuyerName() { return buyerName; }
    public String getEmail() { return email; }
}
