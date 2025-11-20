package id27131.q4;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) throws ReservationDataException {
        setId(id);
        setCreatedDate(createdDate);
        setUpdatedDate(updatedDate);
    }

    public int getId() { return id; }
    public void setId(int id) throws ReservationDataException {
        if (id <= 0) throw new ReservationDataException("ID must be > 0");
        this.id = id;
    }

    public String getCreatedDate() { return createdDate; }
    public void setCreatedDate(String createdDate) throws ReservationDataException {
        if (createdDate == null || createdDate.trim().isEmpty())
            throw new ReservationDataException("Created date required");
        this.createdDate = createdDate;
    }

    public String getUpdatedDate() { return updatedDate; }
    public void setUpdatedDate(String updatedDate) throws ReservationDataException {
        if (updatedDate == null || updatedDate.trim().isEmpty())
            throw new ReservationDataException("Updated date required");
        this.updatedDate = updatedDate;
    }
}
