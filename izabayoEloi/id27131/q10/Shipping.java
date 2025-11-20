package id27131.q10;

public class Shipping extends Payment {
    private String shippingAddress;
    private double shippingCost;

    public Shipping(int id, String createdDate, String updatedDate,
                    String storeName, String storeAddress, String email,
                    String categoryName, String categoryCode,
                    String productName, String productCode, double price,
                    String customerName, String contactNumber, String customerAddress,
                    String orderDate, String orderId,
                    String paymentMethod, String paymentStatus,
                    String shippingAddress, double shippingCost) throws OnlineShoppingDataException {
        super(id, createdDate, updatedDate, storeName, storeAddress, email,
              categoryName, categoryCode, productName, productCode, price,
              customerName, contactNumber, customerAddress,
              orderDate, orderId, paymentMethod, paymentStatus);
        setShippingAddress(shippingAddress);
        setShippingCost(shippingCost);
    }

    public String getShippingAddress() { return shippingAddress; }
    public void setShippingAddress(String shippingAddress) throws OnlineShoppingDataException {
        if (shippingAddress == null || shippingAddress.trim().isEmpty())
            throw new OnlineShoppingDataException("Shipping address required");
        this.shippingAddress = shippingAddress;
    }

    public double getShippingCost() { return shippingCost; }
    public void setShippingCost(double shippingCost) throws OnlineShoppingDataException {
        if (shippingCost < 0) throw new OnlineShoppingDataException("Shipping cost >= 0");
        this.shippingCost = shippingCost;
    }
}
