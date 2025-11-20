package id27131.q9;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) throws AirlineDataException {
        setId(id);
        setCreatedDate(createdDate);
        setUpdatedDate(updatedDate);
    }

    public int getId() { return id; }
    public void setId(int id) throws AirlineDataException {
        if (id <= 0) throw new AirlineDataException("ID must be > 0");
        this.id = id;
    }

    public String getCreatedDate() { return createdDate; }
    public void setCreatedDate(String createdDate) throws AirlineDataException {
        if (createdDate == null || createdDate.trim().isEmpty())
            throw new AirlineDataException("Created date required");
        this.createdDate = createdDate;
    }

    public String getUpdatedDate() { return updatedDate; }
    public void setUpdatedDate(String updatedDate) throws AirlineDataException {
        if (updatedDate == null || updatedDate.trim().isEmpty())
            throw new AirlineDataException("Updated date required");
        this.updatedDate = updatedDate;
    }
}
