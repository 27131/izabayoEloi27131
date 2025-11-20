package id27131.q10;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) throws OnlineShoppingDataException {
        setId(id);
        setCreatedDate(createdDate);
        setUpdatedDate(updatedDate);
    }

    public int getId() { return id; }
    public void setId(int id) throws OnlineShoppingDataException {
        if (id <= 0) throw new OnlineShoppingDataException("ID must be > 0");
        this.id = id;
    }

    public String getCreatedDate() { return createdDate; }
    public void setCreatedDate(String createdDate) throws OnlineShoppingDataException {
        if (createdDate == null || createdDate.trim().isEmpty())
            throw new OnlineShoppingDataException("Created date required");
        this.createdDate = createdDate;
    }

    public String getUpdatedDate() { return updatedDate; }
    public void setUpdatedDate(String updatedDate) throws OnlineShoppingDataException {
        if (updatedDate == null || updatedDate.trim().isEmpty())
            throw new OnlineShoppingDataException("Updated date required");
        this.updatedDate = updatedDate;
    }
}
