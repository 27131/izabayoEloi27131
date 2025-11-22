package id27131.q6;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) throws BankingException {
        if (id <= 0) throw new BankingException("ID must be greater than 0");
        if (createdDate == null || createdDate.trim().isEmpty()) throw new BankingException("Created date cannot be empty");
        if (updatedDate == null || updatedDate.trim().isEmpty()) throw new BankingException("Updated date cannot be empty");
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public int getId() { return id; }
    public String getCreatedDate() { return createdDate; }
    public String getUpdatedDate() { return updatedDate; }
}
