package id27131.q10;

public class Order extends Entity {
    private String orderDate;
    private String orderId;

    public Order(int id, String createdDate, String updatedDate, String orderDate, String orderId) throws OrderDataException {
        super(id, createdDate, updatedDate);
        if (orderDate == null || orderDate.isEmpty()) throw new OrderDataException("Order date cannot be empty");
        if (orderId == null || orderId.isEmpty()) throw new OrderDataException("Order ID cannot be empty");
        this.orderDate = orderDate;
        this.orderId = orderId;
    }

    public String getOrderDate() { return orderDate; }
    public String getOrderId() { return orderId; }
}
