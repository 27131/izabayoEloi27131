package id27131.q10;

public class Customer extends Product {
    private String customerName;
    private String contactNumber;
    private String address;

    public Customer(int id, String createdDate, String updatedDate,
                    String storeName, String storeAddress, String email,
                    String categoryName, String categoryCode,
                    String productName, String productCode, double price,
                    String customerName, String contactNumber, String address) throws OnlineShoppingDataException {
        super(id, createdDate, updatedDate, storeName, storeAddress, email,
              categoryName, categoryCode, productName, productCode, price);
        setCustomerName(customerName);
        setContactNumber(contactNumber);
        setAddress(address);
    }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) throws OnlineShoppingDataException {
        if (customerName == null || customerName.trim().isEmpty())
            throw new OnlineShoppingDataException("Customer name required");
        this.customerName = customerName;
    }

    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) throws OnlineShoppingDataException {
        if (contactNumber == null || contactNumber.trim().isEmpty())
            throw new OnlineShoppingDataException("Contact number required");
        this.contactNumber = contactNumber;
    }

    public String getAddress() { return address; }
    public void setAddress(String address) throws OnlineShoppingDataException {
        if (address == null || address.trim().isEmpty())
            throw new OnlineShoppingDataException("Address required");
        this.address = address;
    }
}
