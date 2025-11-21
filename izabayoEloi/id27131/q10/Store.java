package id27131.q10;

public class Store extends Entity {
    private String storeName;
    private String address;
    private String email;

    public Store(int id, String createdDate, String updatedDate, String storeName, String address, String email) throws OrderDataException {
        super(id, createdDate, updatedDate);
        if (storeName == null || storeName.isEmpty()) throw new OrderDataException("Store name cannot be empty");
        if (address == null || address.isEmpty()) throw new OrderDataException("Address cannot be empty");
        if (email == null || !email.matches(".+@.+\\..+")) throw new OrderDataException("Invalid email format");
        this.storeName = storeName;
        this.address = address;
        this.email = email;
    }

    public String getStoreName() { return storeName; }
    public String getAddress() { return address; }
    public String getEmail() { return email; }
}
