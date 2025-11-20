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
        setPropertyCode(propertyCode);
        setPropertyType(propertyType);
        setPrice(price);
    }

    public String getPropertyCode() { return propertyCode; }
    public void setPropertyCode(String propertyCode) throws RealEstateDataException {
        if (propertyCode == null || propertyCode.trim().isEmpty())
            throw new RealEstateDataException("Property code required");
        this.propertyCode = propertyCode;
    }

    public String getPropertyType() { return propertyType; }
    public void setPropertyType(String propertyType) throws RealEstateDataException {
        if (propertyType == null || propertyType.trim().isEmpty())
            throw new RealEstateDataException("Property type required");
        this.propertyType = propertyType;
    }

    public double getPrice() { return price; }
    public void setPrice(double price) throws RealEstateDataException {
        if (price <= 0) throw new RealEstateDataException("Price > 0");
        this.price = price;
    }
}
