package id27131.q10;

public class Invoice extends Shipping {
    private double totalAmount;

    public Invoice(int id, String createdDate, String updatedDate,
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
              orderDate, orderId, paymentMethod, paymentStatus,
              shippingAddress, shippingCost);
        calculateTotalAmount();
    }

    public double getTotalAmount() { return totalAmount; }

    public void calculateTotalAmount() {
        this.totalAmount = getPrice() + getShippingCost();
    }
}
