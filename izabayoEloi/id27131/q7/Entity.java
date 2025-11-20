package id27131.q7;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) throws RealEstateDataException {
        setId(id);
        setCreatedDate(createdDate);
        setUpdatedDate(updatedDate);
    }

    public int getId() { return id; }
    public void setId(int id) throws RealEstateDataException {
        if (id <= 0) throw new RealEstateDataException("ID must be > 0");
        this.id = id;
    }

    public String getCreatedDate() { return createdDate; }
    public void setCreatedDate(String createdDate) throws RealEstateDataException {
        if (createdDate == null || createdDate.trim().isEmpty())
            throw new RealEstateDataException("Created date required");
        this.createdDate = createdDate;
    }

    public String getUpdatedDate() { return updatedDate; }
    public void setUpdatedDate(String updatedDate) throws RealEstateDataException {
        if (updatedDate == null || updatedDate.trim().isEmpty())
            throw new RealEstateDataException("Updated date required");
        this.updatedDate = updatedDate;
    }
}
