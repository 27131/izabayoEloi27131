package id27131.q1;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) throws HospitalDataException {
        if (id <= 0) throw new HospitalDataException("ID must be greater than 0");
        if (createdDate == null || createdDate.trim().isEmpty())
            throw new HospitalDataException("Created date cannot be empty");
        if (updatedDate == null || updatedDate.trim().isEmpty())
            throw new HospitalDataException("Updated date cannot be empty");
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public int getId() { return id; }
    public String getCreatedDate() { return createdDate; }
    public String getUpdatedDate() { return updatedDate; }
}
