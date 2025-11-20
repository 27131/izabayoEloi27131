package id27131.q10;

public class Order extends Customer {
    private String orderDate;
    private String orderId;

    public Order(int id, String createdDate, String updatedDate,
                 String storeName, String storeAddress, String email,
                 String categoryName, String categoryCode,
                 String productName, String productCode, double price,
                 String customerName, String contactNumber, String customerAddress,
                 String orderDate, String orderId) throws OnlineShoppingDataException {
        super(id, createdDate, updatedDate, storeName, storeAddress, email,
              categoryName, categoryCode, productName, productCode, price,
              customerName, contactNumber, customerAddress);
        setOrderDate(orderDate);
        setOrderId(orderId);
    }

    public String getOrderDate() { return orderDate; }
    public void setOrderDate(String orderDate) throws OnlineShoppingDataException {
        if (orderDate == null || orderDate.trim().isEmpty())
            throw new OnlineShoppingDataException("Order date required");
        this.orderDate = orderDate;
    }

    public String getOrderId() { return orderId; }
    public void setOrderId(String orderId) throws OnlineShoppingDataException {
        if (orderId == null || orderId.trim().isEmpty())
            throw new OnlineShoppingDataException("Order ID required");
        this.orderId = orderId;
    }
}
