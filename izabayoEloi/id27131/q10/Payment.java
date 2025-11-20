package id27131.q10;

public class Payment extends Order {
    private String paymentMethod;
    private String paymentStatus;

    public Payment(int id, String createdDate, String updatedDate,
                   String storeName, String storeAddress, String email,
                   String categoryName, String categoryCode,
                   String productName, String productCode, double price,
                   String customerName, String contactNumber, String customerAddress,
                   String orderDate, String orderId,
                   String paymentMethod, String paymentStatus) throws OnlineShoppingDataException {
        super(id, createdDate, updatedDate, storeName, storeAddress, email,
              categoryName, categoryCode, productName, productCode, price,
              customerName, contactNumber, customerAddress, orderDate, orderId);
        setPaymentMethod(paymentMethod);
        setPaymentStatus(paymentStatus);
    }

    public String getPaymentMethod() { return paymentMethod; }
    public void setPaymentMethod(String paymentMethod) throws OnlineShoppingDataException {
        if (paymentMethod == null || paymentMethod.trim().isEmpty())
            throw new OnlineShoppingDataException("Payment method required");
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentStatus() { return paymentStatus; }
    public void setPaymentStatus(String paymentStatus) throws OnlineShoppingDataException {
        if (paymentStatus == null || paymentStatus.trim().isEmpty())
            throw new OnlineShoppingDataException("Payment status required");
        this.paymentStatus = paymentStatus;
    }
}
