package id27131.q4;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) throws ReservationDataException {
        if (id <= 0) throw new ReservationDataException("ID must be greater than 0");
        this.id = id;

        if (createdDate == null || createdDate.trim().isEmpty())
            throw new ReservationDataException("Created date cannot be empty");
        this.createdDate = createdDate;

        if (updatedDate == null || updatedDate.trim().isEmpty())
            throw new ReservationDataException("Updated date cannot be empty");
        this.updatedDate = updatedDate;
    }

    public int getId() { return id; }
    public String getCreatedDate() { return createdDate; }
    public String getUpdatedDate() { return updatedDate; }
}
