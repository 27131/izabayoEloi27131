package id27131.q8;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) throws LibraryDataException {
        setId(id);
        setCreatedDate(createdDate);
        setUpdatedDate(updatedDate);
    }

    public int getId() { return id; }
    public void setId(int id) throws LibraryDataException {
        if (id <= 0) throw new LibraryDataException("ID must be > 0");
        this.id = id;
    }

    public String getCreatedDate() { return createdDate; }
    public void setCreatedDate(String createdDate) throws LibraryDataException {
        if (createdDate == null || createdDate.trim().isEmpty())
            throw new LibraryDataException("Created date required");
        this.createdDate = createdDate;
    }

    public String getUpdatedDate() { return updatedDate; }
    public void setUpdatedDate(String updatedDate) throws LibraryDataException {
        if (updatedDate == null || updatedDate.trim().isEmpty())
            throw new LibraryDataException("Updated date required");
        this.updatedDate = updatedDate;
    }
}
