package id27131.q10;

public class Store extends Entity {
    private String storeName;
    private String address;
    private String email;

    public Store(int id, String createdDate, String updatedDate,
                 String storeName, String address, String email) throws OnlineShoppingDataException {
        super(id, createdDate, updatedDate);
        setStoreName(storeName);
        setAddress(address);
        setEmail(email);
    }

    public String getStoreName() { return storeName; }
    public void setStoreName(String storeName) throws OnlineShoppingDataException {
        if (storeName == null || storeName.trim().isEmpty())
            throw new OnlineShoppingDataException("Store name required");
        this.storeName = storeName;
    }

    public String getAddress() { return address; }
    public void setAddress(String address) throws OnlineShoppingDataException {
        if (address == null || address.trim().isEmpty())
            throw new OnlineShoppingDataException("Address required");
        this.address = address;
    }

    public String getEmail() { return email; }
    public void setEmail(String email) throws OnlineShoppingDataException {
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@(.+)$"))
            throw new OnlineShoppingDataException("Invalid email format");
        this.email = email;
    }
}
