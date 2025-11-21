package id27131.q8;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) throws LibraryDataException {
        if (id <= 0) throw new LibraryDataException("ID must be greater than 0");
        if (createdDate == null || createdDate.isEmpty()) throw new LibraryDataException("Created date cannot be empty");
        if (updatedDate == null || updatedDate.isEmpty()) throw new LibraryDataException("Updated date cannot be empty");
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public int getId() { return id; }
    public String getCreatedDate() { return createdDate; }
    public String getUpdatedDate() { return updatedDate; }
}
