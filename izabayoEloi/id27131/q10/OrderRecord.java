package id27131.q10;

public final class OrderRecord extends Invoice {
    public OrderRecord(int id, String createdDate, String updatedDate,
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
    }
}
