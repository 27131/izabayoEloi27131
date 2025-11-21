package id27131.q10;

public class Product extends Entity {
    private String productName;
    private String productCode;
    private double price;

    public Product(int id, String createdDate, String updatedDate, String productName, String productCode, double price) throws OrderDataException {
        super(id, createdDate, updatedDate);
        if (productName == null || productName.length() < 3) throw new OrderDataException("Product name must be at least 3 characters");
        if (productCode == null || productCode.length() < 3) throw new OrderDataException("Product code must be at least 3 characters");
        if (price <= 0) throw new OrderDataException("Price must be greater than 0");
        this.productName = productName;
        this.productCode = productCode;
        this.price = price;
    }

    public String getProductName() { return productName; }
    public String getProductCode() { return productCode; }
    public double getPrice() { return price; }
}
