package id27131.q6;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) throws BankingDataException {
        if (id <= 0) throw new BankingDataException("ID must be > 0");
        if (createdDate == null || createdDate.isEmpty()) throw new BankingDataException("Created date cannot be empty");
        if (updatedDate == null || updatedDate.isEmpty()) throw new BankingDataException("Updated date cannot be empty");
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public int getId() { return id; }
    public String getCreatedDate() { return createdDate; }
    public String getUpdatedDate() { return updatedDate; }
}
