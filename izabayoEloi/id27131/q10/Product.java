package id27131.q10;

public class Product extends Category {
    private String productName;
    private String productCode;
    private double price;

    public Product(int id, String createdDate, String updatedDate,
                   String storeName, String address, String email,
                   String categoryName, String categoryCode,
                   String productName, String productCode, double price) throws OnlineShoppingDataException {
        super(id, createdDate, updatedDate, storeName, address, email, categoryName, categoryCode);
        setProductName(productName);
        setProductCode(productCode);
        setPrice(price);
    }

    public String getProductName() { return productName; }
    public void setProductName(String productName) throws OnlineShoppingDataException {
        if (productName == null || productName.trim().isEmpty())
            throw new OnlineShoppingDataException("Product name required");
        this.productName = productName;
    }

    public String getProductCode() { return productCode; }
    public void setProductCode(String productCode) throws OnlineShoppingDataException {
        if (productCode == null || productCode.trim().isEmpty())
            throw new OnlineShoppingDataException("Product code required");
        this.productCode = productCode;
    }

    public double getPrice() { return price; }
    public void setPrice(double price) throws OnlineShoppingDataException {
        if (price <= 0) throw new OnlineShoppingDataException("Price must be > 0");
        this.price = price;
    }
}
