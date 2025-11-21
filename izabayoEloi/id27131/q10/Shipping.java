package id27131.q10;

public class Shipping extends Entity {
    private String shippingAddress;
    private double shippingCost;

    public Shipping(int id, String createdDate, String updatedDate, String shippingAddress, double shippingCost) throws OrderDataException {
        super(id, createdDate, updatedDate);
        if (shippingAddress == null || shippingAddress.isEmpty()) throw new OrderDataException("Shipping address cannot be empty");
        if (shippingCost < 0) throw new OrderDataException("Shipping cost cannot be negative");
        this.shippingAddress = shippingAddress;
        this.shippingCost = shippingCost;
    }

    public String getShippingAddress() { return shippingAddress; }
    public double getShippingCost() { return shippingCost; }
}
