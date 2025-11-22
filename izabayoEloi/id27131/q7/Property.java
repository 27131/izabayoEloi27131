package id27131.q7;

public class Property extends Agent {
    private String propertyCode;
    private String propertyType;
    private double price;

    public Property(int id, String createdDate, String updatedDate,
                    String agencyName, String location, String phoneNumber,
                    String agentName, String email, String licenseNumber,
                    String propertyCode, String propertyType, double price) throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName, email, licenseNumber);
        if (propertyCode == null || propertyCode.isEmpty()) throw new RealEstateDataException("Property code required");
        if (propertyType == null || propertyType.isEmpty()) throw new RealEstateDataException("Property type required");
        if (price <= 0) throw new RealEstateDataException("Price must be > 0");

        this.propertyCode = propertyCode;
        this.propertyType = propertyType;
        this.price = price;
    }

    public String getPropertyCode() { return propertyCode; }
    public String getPropertyType() { return propertyType; }
    public double getPrice() { return price; }
}
