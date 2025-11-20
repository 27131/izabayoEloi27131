package id27131.q5;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) throws RentalDataException {
        setId(id);
        setCreatedDate(createdDate);
        setUpdatedDate(updatedDate);
    }

    public int getId() { return id; }
    public void setId(int id) throws RentalDataException {
        if (id <= 0) throw new RentalDataException("ID must be > 0");
        this.id = id;
    }

    public String getCreatedDate() { return createdDate; }
    public void setCreatedDate(String createdDate) throws RentalDataException {
        if (createdDate == null || createdDate.trim().isEmpty())
            throw new RentalDataException("Created date required");
        this.createdDate = createdDate;
    }

    public String getUpdatedDate() { return updatedDate; }
    public void setUpdatedDate(String updatedDate) throws RentalDataException {
        if (updatedDate == null || updatedDate.trim().isEmpty())
            throw new RentalDataException("Updated date required");
        this.updatedDate = updatedDate;
    }
}
