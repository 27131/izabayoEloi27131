package id27131.q6;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) throws BankDataException {
        setId(id);
        setCreatedDate(createdDate);
        setUpdatedDate(updatedDate);
    }

    public int getId() { return id; }
    public void setId(int id) throws BankDataException {
        if (id <= 0) throw new BankDataException("ID must be > 0");
        this.id = id;
    }

    public String getCreatedDate() { return createdDate; }
    public void setCreatedDate(String createdDate) throws BankDataException {
        if (createdDate == null || createdDate.trim().isEmpty())
            throw new BankDataException("Created date required");
        this.createdDate = createdDate;
    }

    public String getUpdatedDate() { return updatedDate; }
    public void setUpdatedDate(String updatedDate) throws BankDataException {
        if (updatedDate == null || updatedDate.trim().isEmpty())
            throw new BankDataException("Updated date required");
        this.updatedDate = updatedDate;
    }
}
